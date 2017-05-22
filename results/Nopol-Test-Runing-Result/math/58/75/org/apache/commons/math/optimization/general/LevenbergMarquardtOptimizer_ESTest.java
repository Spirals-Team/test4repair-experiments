package org.apache.commons.math.optimization.general;


public class LevenbergMarquardtOptimizer_ESTest extends org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(0.0, 206);
        circleVectorial0.addPoint(8.875856470674002, 8.875856470674002);
        levenbergMarquardtOptimizer0.optimize(206, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        levenbergMarquardtOptimizer0.cols = 206;
        try {
            levenbergMarquardtOptimizer0.doOptimize();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 8.109623804260607;
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(0.0, 207);
        circleVectorial0.addPoint(8.109623804260607, 207);
        levenbergMarquardtOptimizer0.optimize(207, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertEquals(133.33427869992832, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 2.116875610148907E-14;
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(2.116875610148907E-14, 1025);
        circleVectorial0.addPoint((-621.7208131653344), 958.717360541532);
        levenbergMarquardtOptimizer0.optimize(1025, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        levenbergMarquardtOptimizer0.doOptimize();
        levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertEquals(39, levenbergMarquardtOptimizer0.getJacobianEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 10.0;
        levenbergMarquardtOptimizer0.setConvergenceChecker(((org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.VectorialPointValuePair>)(null)));
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(3165.593, 159);
        circleVectorial0.addPoint((-652.6105418713), 0.0);
        levenbergMarquardtOptimizer0.optimize(159, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(5, levenbergMarquardtOptimizer0.getJacobianEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer(2.116875610148907E-14 , 2.116875610148907E-14 , 2.116875610148907E-14 , 2.116875610148907E-14 , 2.116875610148907E-14);
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 2.116875610148907E-14;
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(2.116875610148907E-14, 1048);
        circleVectorial0.addPoint((-652.4199121896518), 958.717360541532);
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair0 = levenbergMarquardtOptimizer0.optimize(1048, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertNotNull(vectorialPointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 8.109623804260607;
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(0.0, 206);
        circleVectorial0.addPoint(8.109623804260607, 206);
        levenbergMarquardtOptimizer0.optimize(206, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(9, levenbergMarquardtOptimizer0.getJacobianEvaluations());
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 8.875856470674002;
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        circleVectorial0.addPoint(0.0, 206);
        circleVectorial0.addPoint(8.875856470674002, 8.875856470674002);
        levenbergMarquardtOptimizer0.optimize(206, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray0);
        levenbergMarquardtOptimizer0.doOptimize();
        org.junit.Assert.assertEquals(4.481162348843307E-28, levenbergMarquardtOptimizer0.getChiSquare(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.general.CircleVectorial circleVectorial0 = new org.apache.commons.math.optimization.general.CircleVectorial();
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = new double[2];
        levenbergMarquardtOptimizer0.optimize(839, ((org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction)(circleVectorial0)), doubleArray0, doubleArray0, doubleArray1);
    }
}

