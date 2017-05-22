package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[3] = -3.557998484235558;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3.557998484235558));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(5, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = java.lang.Double.NEGATIVE_INFINITY;
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 8.0;
        double[] doubleArray1 = new double[4];
        doubleArray0[2] = 8.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 8.0;
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(2053.58252079, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-155.1905714467), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 3.762195691083631;
        doubleArray0[1] = 7.434086092474168;
        doubleArray0[2] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(1.0453578017891377E8, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-3.1045835980207926E13), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 8.0;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = -155.1905714467;
        double[] doubleArray1 = new double[4];
        doubleArray1[2] = 2053.58252079;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals((-3.2651756670731375E15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 3.762195691083631;
        doubleArray0[2] = 3.762195691083631;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 8.0;
        doubleArray1[2] = 305.66687419282;
        doubleArray1[3] = 8.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 8.0);
        org.junit.Assert.assertEquals(18817.98912185089, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 36.020949530755516;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        doubleArray1[1] = 36.020949530755516;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals((-1.5762326354567535E13), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 2053.58252079;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        doubleArray1[1] = 8.0;
        doubleArray1[2] = 2053.58252079;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(3.165357724315065E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        doubleArray1[1] = 8.0;
        doubleArray1[2] = -160.7261288590774;
        doubleArray1[3] = -160.7261288590774;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-160.7261288590774));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 4.817846270738214;
        doubleArray0[1] = 7.747042615756616;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 4.817846270738214;
        doubleArray1[1] = 7.747042615756616;
        doubleArray1[2] = 305.66687419282;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(5.971090563363878E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 8.0;
        doubleArray0[2] = -160.7261288590774;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        doubleArray1[1] = 8.0;
        doubleArray1[2] = -160.7261288590774;
        doubleArray1[3] = -160.7261288590774;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-160.7261288590774));
        org.junit.Assert.assertEquals((-1.7438296972418043E13), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 3.762195691083631;
        doubleArray0[1] = 7.434086092474168;
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 7.434086092474168;
        doubleArray1[2] = -155.1905714467;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(5.6640539989905E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = -155.1905714467;
        doubleArray0[3] = 305.66687419282;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 8.0;
        doubleArray0[0] = 305.66687419282;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(1.7060074093939028E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 8.0;
        doubleArray0[2] = -160.7261288590774;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        doubleArray1[2] = -160.7261288590774;
        doubleArray1[3] = -160.7261288590774;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-160.7261288590774));
        org.junit.Assert.assertEquals((-1.7509904298691191E13), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 8.0;
        doubleArray0[3] = java.lang.Double.NEGATIVE_INFINITY;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 8.0;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 8.0;
        doubleArray1[1] = 8.0;
        doubleArray1[2] = -19891.44830170086;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals(0.2764057487477516, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 0.3333333333333333;
        doubleArray1[2] = 305.66687419282;
        doubleArray1[3] = -155.1905714467;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.junit.Assert.assertEquals((-1.8940410563755773E-7), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2053.58252079;
        doubleArray0[1] = 8.0;
        doubleArray0[2] = -160.7261288590774;
        doubleArray0[3] = 305.66687419282;
        doubleArray0[4] = -160.7261288590774;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2053.58252079;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-160.7261288590774));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-1561.9575122338406));
        org.junit.Assert.assertEquals((-3.3170384704718945E13), eigenDecompositionImpl1.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-3.3170384704718945E13), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[4] = java.lang.Double.NEGATIVE_INFINITY;
        double[] doubleArray1 = new double[4];
        doubleArray1[2] = 2053.58252079;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3.557998484235558));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getEigenvector(0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(5, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getVT()));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
        org.junit.Assert.assertFalse(array2DRowRealMatrix1.equals(((java.lang.Object)(array2DRowRealMatrix0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-160.7261288590774));
        eigenDecompositionImpl0.getImagEigenvalue(3);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-155.1905714467));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

