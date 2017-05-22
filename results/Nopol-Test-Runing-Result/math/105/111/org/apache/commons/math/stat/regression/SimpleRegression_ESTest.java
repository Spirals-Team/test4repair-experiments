package org.apache.commons.math.stat.regression;


public class SimpleRegression_ESTest extends org.apache.commons.math.stat.regression.SimpleRegression_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -396.88;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getMeanSquareError(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(0.0, (-1.0));
        simpleRegression0.addData((-1.0), 0.0);
        double double0 = simpleRegression0.getRSquare();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.predict(4.094841448786794E-5);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(2728.1, 691.4);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.predict(0.0);
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-956.1847084062364), (-956.1847084062364));
        double[][] doubleArray0 = new double[3][5];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -956.1847084062364;
        doubleArray0[0] = doubleArray1;
        doubleArray0[2] = doubleArray0[0];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(0.0);
        org.junit.Assert.assertEquals(685716.8974424393, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals((-2.8421709430404007E-14), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(917.335, 917.335);
        double[][] doubleArray0 = new double[3][2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(631127.62666875, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1798.653001747;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[2];
        doubleArray2[0] = 1762.19443502;
        doubleArray2[1] = -6065.2425328156;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-3.725290298461914E-9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-1879.1313), (-1879.1313));
        simpleRegression0.addData(1.0, 1.0);
        simpleRegression0.addData(0.09999999999999996, 623.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.09999999999999996);
        org.junit.Assert.assertEquals(3394146.2492264602, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(1.8124085878014928, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -396.88;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(2037.06164355436, (-250.4));
        simpleRegression0.addData(0.0, (-1.0));
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(31100.18, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals((-0.12243124835674353), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3284.2363797724493;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray2[1] = 3284.2363797724493;
        doubleArray0[2] = doubleArray2;
        doubleArray0[3] = doubleArray0[0];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -396.88;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = -396.88;
        doubleArray2[1] = -396.88;
        doubleArray0[1] = doubleArray2;
        double[] doubleArray3 = new double[5];
        doubleArray3[1] = -396.88;
        doubleArray0[2] = doubleArray3;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3284.2363797724493;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(917.335, 917.335);
        double[][] doubleArray0 = new double[3][2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -1.0;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[6][4];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -2910.572752761758;
        doubleArray1[1] = 429.6659243780677;
        doubleArray0[2] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray2[0] = -1841.0;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(6L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-17.41310961351031), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][5];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -2086.0;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
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
        simpleRegression0.addData((-1879.1313), (-1879.1313));
        simpleRegression0.addData((-1879.1313), (-1879.1313));
        simpleRegression0.addData(0.09999999999999996, (-1879.1313));
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.09999999999999996);
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
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
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3284.2363797724493;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray2[1] = 3284.2363797724493;
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.33333333333333337), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -1.0;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(3L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.clear();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }
}

