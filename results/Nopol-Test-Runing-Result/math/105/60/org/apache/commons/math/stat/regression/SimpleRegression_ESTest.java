package org.apache.commons.math.stat.regression;


public class SimpleRegression_ESTest extends org.apache.commons.math.stat.regression.SimpleRegression_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = -1607.0048005400263;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(1607.0048005400263, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[26][5];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = java.lang.Double.NaN;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(3820886.7269065105, 3820886.7269065105);
        simpleRegression0.addData(1583.0, (-2008.212));
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(7.307262856958504E12, simpleRegression0.getRegressionSumSquares(), 0.01);
        org.junit.Assert.assertEquals(7.307262856958506E12, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = -1607.0048005400263;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[4];
        doubleArray2[0] = -1607.0048005400263;
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(2600.9579);
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-841.5925401080053), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(2338.2123, 2338.2123);
        simpleRegression0.addData((-5247.040381135095), 2338.2123);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2335.736), 0.7598297725568395);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(java.lang.Double.NaN);
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[10][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.7786124432386732);
        org.junit.Assert.assertEquals(10L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(3808.5928, 0.9999999999999971);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(0.7499999999999957, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 5207.6753;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[4];
        doubleArray2[0] = 1.0;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-5207.6753), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(3808.5928, 0.9999999999999971);
        double double0 = simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1015.7179668206508, 1015.7179668206508);
        double[][] doubleArray0 = new double[4][7];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 1015.7179668206508;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray0[2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(5L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 1.0;
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = 1.0;
        doubleArray2[1] = 1.0;
        doubleArray0[4] = doubleArray2;
        doubleArray0[5] = doubleArray0[2];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(1.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(2.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][7];
        simpleRegression0.addData(doubleArray0);
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(3L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2335.736), 0.7598297725568395);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2335.736), 0.7598297725568395);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(12L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-1.1102230246251566E-17), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[9][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 75.0410489242507;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[8];
        doubleArray2[1] = -2254.013068930943;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(9L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-281.7516336163679), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(11L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.0;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[10][6];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 1.0;
        doubleArray0[2] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = 1.0;
        doubleArray0[5] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(10L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.11111111111111091), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getR();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRSquare();
        org.junit.Assert.assertEquals(11L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1015.7179668206508, 1015.7179668206508);
        double[][] doubleArray0 = new double[4][7];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(1.0, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(825346.3904978213, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(0L, long0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.clear();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.predict(1.370465416314954);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }
}

