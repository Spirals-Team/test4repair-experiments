package org.apache.commons.math.stat.regression;


public class SimpleRegression_ESTest extends org.apache.commons.math.stat.regression.SimpleRegression_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -3332.0;
        doubleArray0[1] = -3332.0;
        double[][] doubleArray1 = new double[5][2];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        doubleArray1[4] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        simpleRegression0.addData(0.0, (-3332.0));
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][4];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 57.15623566586292;
        doubleArray1[1] = -722.37701338;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(965.6990317);
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-12205.121177356525), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1408.6289376959817, 1.627687708827525E7);
        simpleRegression0.addData(1.627687708827525E7, 1.627687708827525E7);
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1408.6289376959817, 1.627687708827525E7);
        simpleRegression0.addData(1.627687708827525E7, 1.627687708827525E7);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-952.355), (-952.355));
        simpleRegression0.addData((-1768.193410332683), 2845.7047);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-9.313225746154785E-10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 1.0E-14);
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1808.0475, 1808.0475);
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(1808.0475, 1808.0475);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(java.lang.Double.NaN);
        org.junit.Assert.assertEquals(2179357.1748375, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(java.lang.Double.NaN);
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 1.0E-14);
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(6.666666666666667E-29, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-3442.7), 272.876860463);
        simpleRegression0.addData(272.876860463, 272.876860463);
        simpleRegression0.addData((-747.538865531), (-542.963));
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(443729.7852801915, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(3.0172137315571144, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][4];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 57.15623566586292;
        doubleArray1[1] = -722.37701338;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-12.63863872356881), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][4];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[5][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 1487.4527353684;
        doubleArray1[1] = 1487.4527353684;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray2[1] = 1487.4527353684;
        doubleArray0[1] = doubleArray2;
        doubleArray0[2] = doubleArray0[0];
        doubleArray0[3] = doubleArray1;
        doubleArray0[4] = doubleArray0[0];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(4.9E-323, 4.9E-323);
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -3332.0;
        double[][] doubleArray1 = new double[5][2];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        doubleArray1[4] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        simpleRegression0.addData(0.0, (-3332.0));
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1808.0475, 1808.0475);
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-952.355), (-952.355));
        simpleRegression0.addData(1.0, (-952.355));
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getRegressionSumSquares(), 0.01);
        org.junit.Assert.assertEquals((-952.355), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][7];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSlopeConfidenceInterval(3.399464998481189E-5);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        simpleRegression0.addData((-3580.4040758571787), 298.49);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals((-7.275957614183426E-12), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
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
        double[][] doubleArray0 = new double[6][4];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 57.15623566586292;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
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
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
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
        double[][] doubleArray0 = new double[6][4];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 57.15623566586292;
        doubleArray1[1] = -722.37701338;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.9999999999999999), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getR();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 1.0E-14);
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(6.666666666666667E-29, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][7];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getRSquare();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.clear();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.predict(1116.2371764);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0E-14, 1.0E-14);
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
    }
}

