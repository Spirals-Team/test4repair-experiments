package org.apache.commons.math.stat.correlation;


public class PearsonsCorrelation_ESTest extends org.apache.commons.math.stat.correlation.PearsonsCorrelation_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix0 = pearsonsCorrelation0.getCorrelationMatrix();
        org.junit.Assert.assertNull(realMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -1.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = -1.0;
        double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals((-0.14285714285714304), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        try {
            pearsonsCorrelation0.covarianceToCorrelation(((org.apache.commons.math.linear.RealMatrix)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
        double[] doubleArray0 = new double[21];
        double[][] doubleArray1 = new double[3][4];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray1 , true);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationPValues()));
        pearsonsCorrelation0.computeCorrelationMatrix(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = null;
        try {
            pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(null)) , 0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[21];
        double[][] doubleArray1 = new double[3][4];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray1 , true);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationPValues()));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[3][4];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , true);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(covariance0.computeCovarianceMatrix(doubleArray0)));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.covarianceToCorrelation(blockRealMatrix0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(4, blockRealMatrix1.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[] doubleArray0 = new double[8];
        double double0 = pearsonsCorrelation0.correlation(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[][] doubleArray0 = new double[2][8];
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)))));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(8, blockRealMatrix1.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[3][4];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(4, blockRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[2][8];
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationStandardErrors()));
        org.junit.Assert.assertEquals(8, blockRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[3][4];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationMatrix()));
        org.junit.Assert.assertEquals(4, blockRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        double[][] doubleArray0 = new double[9][8];
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.computeCorrelationMatrix(doubleArray0)));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)) , 52);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation1.getCorrelationPValues()));
        org.junit.Assert.assertEquals(8, blockRealMatrix1.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix0.getFrobeniusNorm(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[3][4];
        org.apache.commons.math.stat.correlation.Covariance covariance0 = new org.apache.commons.math.stat.correlation.Covariance(doubleArray0 , false);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(covariance0);
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix0 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation0.getCorrelationPValues()));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation1 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(((org.apache.commons.math.linear.RealMatrix)(blockRealMatrix0)));
        org.apache.commons.math.linear.BlockRealMatrix blockRealMatrix1 = ((org.apache.commons.math.linear.BlockRealMatrix)(pearsonsCorrelation1.getCorrelationStandardErrors()));
        org.junit.Assert.assertEquals(4, blockRealMatrix1.getColumnDimension());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, blockRealMatrix1.getFrobeniusNorm(), 0.01);
    }
}

