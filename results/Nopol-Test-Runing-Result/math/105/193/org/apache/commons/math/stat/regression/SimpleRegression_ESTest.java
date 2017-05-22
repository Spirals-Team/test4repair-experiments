package org.apache.commons.math.stat.regression;


public class SimpleRegression_ESTest extends org.apache.commons.math.stat.regression.SimpleRegression_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1340.985, 1340.985);
        simpleRegression0.addData(1504.400384612821, 1340.985);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -4.996259802245774;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(0.0);
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[1][5];
        simpleRegression0.addData(doubleArray0);
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1678.2;
        doubleArray1[1] = -2402.9802;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(1.0);
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-1.4318795137647478), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 1.0E-14);
        simpleRegression0.addData(1.0E-14, 1.0E-14);
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-4283.2), (-3141.901718108));
        simpleRegression0.addData(1728.909414, (-3141.901718108));
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][1];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -2531.0;
        doubleArray1[1] = 2353.348578684196;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[1] = 3118.0;
        doubleArray0[1] = doubleArray2;
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray0[0];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-1.1641532182693481E-10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(((double)(4L)), 0.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(java.lang.Double.NaN);
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getRegressionSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 0.0);
        simpleRegression0.addData(0.0, (-662.4168509196888));
        simpleRegression0.addData(0.0, 1.0E-14);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.05);
        org.junit.Assert.assertEquals(292530.7229215715, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(7.2891662319089741E17, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -4.996259802245774;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[1][5];
        simpleRegression0.addData(doubleArray0);
        double[] doubleArray1 = new double[4];
        simpleRegression0.addData((-1.0), 0.0);
        doubleArray1[1] = -2402.9802;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(3849542.56106136, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(26442.144558169566, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][7];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = -847.00671211;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[8];
        doubleArray2[1] = -1320.700771086794;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.5197521862200921), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 0.0);
        simpleRegression0.addData(0.0, 1.0E-14);
        double[][] doubleArray0 = new double[23][2];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(2155.9146798367346, 3.399464998481189E-5);
        double double0 = simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(26L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -4.996259802245774;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(3L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -4.996259802245774;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1845.7020152916239, 8.441822398385275E-5);
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-4.1359030627651384E-25), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][1];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -1360.59928439;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray0[1] = doubleArray2;
        doubleArray0[2] = doubleArray0[0];
        doubleArray0[3] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][1];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -1360.59928439;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        doubleArray0[2] = doubleArray0[1];
        double[] doubleArray2 = new double[6];
        doubleArray2[1] = -1360.59928439;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-1360.59928439), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[5][2];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSlopeConfidenceInterval(1.0E-14);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(10.38797889391077, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][7];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = -847.00671211;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[8];
        doubleArray2[1] = -1320.700771086794;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.3333333333333334), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getR();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRSquare();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(((double)(4L)), 0.0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(0.0);
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.clear();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
    }
}

