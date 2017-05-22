package org.apache.commons.math.stat.correlation;


public class PearsonsCorrelation_ESTest extends org.apache.commons.math.stat.correlation.PearsonsCorrelation_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][8];
        double[] doubleArray1 = new double[2];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[][] doubleArray0 = new double[3][6];
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)) , 52);
        org.junit.Assert.assertEquals(6, blockRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[13][3];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , true);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationMatrix()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(3, blockRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 414.12;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 414.12;
        double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals((-0.2000000000000001), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[8][3];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        try {
            pearsonsCorrelation0.correlation(((double[])(null)), ((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray0 = new double[21];
        double[][] doubleArray1 = new double[3][6];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray1)));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[][] doubleArray0 = new double[3][6];
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(6, blockRealMatrix1.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray0 = new double[5];
        double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[][] doubleArray0 = new double[2][4];
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)))));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(4, blockRealMatrix1.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[13][3];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , true);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationPValues()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(3, blockRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[][] doubleArray0 = new double[3][6];
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation1.getCorrelationStandardErrors()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(6, blockRealMatrix1.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
        org.junit.Assert.assertNull(realMatrix0);
    }
}

