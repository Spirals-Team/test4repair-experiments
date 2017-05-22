package org.apache.commons.math.stat.correlation;


public class PearsonsCorrelation_ESTest extends org.apache.commons.math.stat.correlation.PearsonsCorrelation_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[8][3];
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationMatrix()));
        org.junit.Assert.assertNull(blockRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        try {
            pearsonsCorrelation0.correlation(((double[])(null)), ((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][6];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = blockRealMatrix0.createMatrix(8, 52);
        pearsonsCorrelation0.computeCorrelationMatrix(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][6];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        double[] doubleArray1 = new double[5];
        double double0 = pearsonsCorrelation0.correlation(doubleArray1, doubleArray1);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][6];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)))));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(6, blockRealMatrix1.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][6];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.junit.Assert.assertEquals(6, blockRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][6];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationPValues()));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)) , 10);
        org.junit.Assert.assertEquals(6, blockRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][2];
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationMatrix()));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][6];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }
}

