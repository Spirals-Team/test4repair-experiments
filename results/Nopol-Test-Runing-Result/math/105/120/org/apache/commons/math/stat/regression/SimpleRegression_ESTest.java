package org.apache.commons.math.stat.regression;


public class SimpleRegression_ESTest extends org.apache.commons.math.stat.regression.SimpleRegression_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0, (-434.6487377495653));
        simpleRegression0.addData((-434.6487377495653), 1.0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(2L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(94894.91135139477, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-2346.5545639489337), 6.283185307179586);
        simpleRegression0.addData((-177.8075106212869), 6.283185307179586);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getRegressionSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(4414.695627, (-1141.464454));
        double double0 = simpleRegression0.predict(0.0);
        org.junit.Assert.assertEquals((-1.0), simpleRegression0.getR(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][8];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2593.9;
        doubleArray1[1] = 2.0;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict((-3386.282087));
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals((-2.610958083966228), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-9.837447530487956E-5), (-9.837447530487956E-5));
        simpleRegression0.addData(4736.25310846, 96.70400438515588);
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(0.020417848990861787, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -3217.56384964;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getRegressionSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[13][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(153986.0, 153986.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(4.652362892704858E-5);
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(0.05, 0.05);
        double[][] doubleArray0 = new double[2][7];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 0.05;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.05);
        org.junit.Assert.assertEquals(0.001666666666666667, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(11.003896144533178, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(4414.695627, (-1141.464454));
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals(1202714.861303555, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[2][2];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 857.78921562;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(2870.58728393, 2870.58728393);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertEquals((-380.4458099645946), simpleRegression0.getIntercept(), 0.01);
        org.junit.Assert.assertEquals(4.159767685973792, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((-2346.5545639489337), 6.283185307179586);
        simpleRegression0.addData((-177.8075106212869), 6.283185307179586);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData(1.0, 0.0);
        long long0 = simpleRegression0.getN();
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(4414.695627, (-1141.464454));
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getIntercept(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(4414.695627, (-1141.464454));
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(5L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-3.8805107275644936E-11), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(4414.695627, (-1141.464454));
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(5L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(2915.6438590428643, (-2549.151));
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(9L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-5.0527483431829344E-14), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSlopeConfidenceInterval(4.652362892704858E-5);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][8];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(4414.695627, (-1141.464454));
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(5L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.2585601704948525), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[13][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(153986.0, 153986.0);
        double double0 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertEquals(14L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getRSquare();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(2915.6438590428643, (-2549.151));
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(5L, simpleRegression0.getN());
        org.junit.Assert.assertEquals((-0.9999999999999999), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        org.junit.Assert.assertEquals(4L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(2915.6438590428643, (-2549.151));
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(5L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        org.junit.Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
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
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.predict(0.0);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.getIntercept();
        org.junit.Assert.assertEquals(0L, simpleRegression0.getN());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSlope(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }
}

