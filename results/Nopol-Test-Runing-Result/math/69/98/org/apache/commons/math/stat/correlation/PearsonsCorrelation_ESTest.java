package org.apache.commons.math.stat.correlation;


public class PearsonsCorrelation_ESTest extends org.apache.commons.math.stat.correlation.PearsonsCorrelation_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[8][7];
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(7, blockRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -46.0;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[8];
        doubleArray2[2] = -2673.3;
        doubleArray0[1] = doubleArray2;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray2);
        org.junit.Assert.assertEquals((-0.14285714285714254), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray0 = new double[9];
        try {
            pearsonsCorrelation0.correlation(doubleArray0, ((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[6][7];
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationMatrix()));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(7, blockRealMatrix1.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[8];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray0[0]);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[8];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray0[0];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)))));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(8, blockRealMatrix1.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[8];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation1.getCorrelationPValues()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(8, blockRealMatrix1.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[27];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.junit.Assert.assertEquals(27, blockRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[8];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray0[0];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)) , 8);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(8, blockRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
        org.junit.Assert.assertNull(realMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[27];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
    }
}

