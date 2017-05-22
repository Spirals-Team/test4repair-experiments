package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -3695.393167472791;
        doubleArray0[1] = 6768.11043;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 6768.11043;
        doubleArray1[1] = -3695.393167472791;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1922.49067582));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(5.046403286459302E10, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 580.290120175663;
        doubleArray0[8] = 3207.532811735807;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals(1.3947994659809234E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 6768.11043;
        doubleArray0[2] = 6768.11043;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1947.585304143008));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -2347.001335;
        doubleArray0[1] = 269.66265;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray0 , 269.66265);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(2)));
        org.junit.Assert.assertTrue(arrayRealVector0.isNaN());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = 4523.428;
        doubleArray0[3] = 4523.428;
        doubleArray0[2] = 4523.428;
        doubleArray0[5] = 4523.428;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 580.290120175663;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = -1008.5442480526209;
        doubleArray1[5] = 4523.428;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(1.0351198190163435E30, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = 6768.11043;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 6768.11043;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1947.585304143008));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-3.100289920910372E11), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 19.085536923187668);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.1102230246251565E-16);
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.1102230246251565E-16);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        org.junit.Assert.assertTrue(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = -3453.862249243;
        doubleArray0[7] = 580.290120175663;
        doubleArray0[8] = 3207.532811735807;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.532811735807;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        doubleArray0[8] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = -3296.8714;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -3296.8714;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3296.8714));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = -3453.862249243;
        doubleArray0[7] = 580.290120175663;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.532811735807;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 4513.080401230179;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = -3453.862249243;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.532811735807;
        doubleArray1[6] = 15.4857;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals(8.208467729136854E29, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[7] = 580.290120175663;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.532811735807;
        doubleArray1[6] = 15.4857;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = 4523.428;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = -3453.862249243;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3207.0;
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 1873.440826646;
        doubleArray0[8] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3296.8714;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -3296.8714;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3296.8714));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 4513.080401230179;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[7] = 580.290120175663;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[2] = 6.090451682037922;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.532811735807;
        doubleArray1[6] = 15.4857;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1007.0667250773932));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[4] = -3453.862249243;
        doubleArray1[3] = -3296.8714;
        doubleArray1[5] = 3207.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3296.8714));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        doubleArray1[6] = -3296.8714;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1873.440826646;
        doubleArray0[4] = 0.736863451368379;
        double[] doubleArray1 = new double[8];
        doubleArray0[3] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = 3220.780406291052;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3220.780406291052;
        doubleArray1[6] = -3298.2141945404087;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 0.1411200080598672;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[4] = 4523.428;
        doubleArray0[5] = 0.1411200080598672;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 4523.428;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = -1008.5442480526209;
        doubleArray1[5] = 0.7853981633974483;
        doubleArray1[6] = 4523.428;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals(2.3922809556104673E29, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 4523.428;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 4523.428;
        doubleArray0[8] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -1008.5442480526209;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = -1008.5442480526209;
        doubleArray1[7] = -3296.8714;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3296.8714));
        org.junit.Assert.assertEquals(4.512145903827824E31, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 0.1411200080598672;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[4] = 4523.428;
        doubleArray0[5] = 0.1411200080598672;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 4523.428;
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = 0.7853981633974483;
        doubleArray1[6] = 4523.428;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals((-5.690228124282361E28), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.532811735807;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -1008.5442480526209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 4513.080401230179;
        doubleArray0[2] = 1873.440826646;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.1102230246251565E-16);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.1102230246251565E-16);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        org.junit.Assert.assertTrue(decompositionSolver0.isNonSingular());
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -3695.393167472791;
        doubleArray0[1] = 6768.11043;
        doubleArray0[2] = 1.1102230246251565E-16;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1922.49067582));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(7.392845362037476E-5, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-2.9558577807620168E-12), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1007.0667250773932));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1947.585304143008));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1922.49067582));
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1922.49067582));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1947.585304143008));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.1102230246251565E-16);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1008.5442480526209));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1922.49067582));
        eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1922.49067582));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

