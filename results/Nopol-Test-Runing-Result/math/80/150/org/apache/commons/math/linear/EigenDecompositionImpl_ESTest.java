package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -3304.7932;
        doubleArray0[2] = -3304.7932;
        doubleArray0[1] = -3304.7932;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[2] = 2.2250738585072014E-308;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -3304.7932;
        doubleArray0[2] = -3304.7932;
        doubleArray0[1] = -3304.7932;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[2] = 2.2250738585072014E-308;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = -3304.7932;
        doubleArray1[6] = -3304.7932;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double)(-5448));
        doubleArray0[1] = 3.5834549549463;
        doubleArray0[3] = 3.5834549549463;
        doubleArray0[4] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        doubleArray0[7] = 3.5834549549463;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[2] = -0.6633606526334896;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(4.267043390061436E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[2] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 0.15885495038741);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 49.8014015728657;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        org.junit.Assert.assertEquals(0.15885495038741, double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getImagEigenvalue(6);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(2)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[4] = ((double)(-5448));
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(7.079492617844133E15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-1.1470798210374195E-6), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 240.3334255097641);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 6.428401320590638E-6;
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 6.428401320590638E-6);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[2] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[2] = 0.15885495038741;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double)(-5451));
        doubleArray0[5] = ((double)(-5451));
        double[] doubleArray1 = new double[7];
        doubleArray0[2] = -3304.7932;
        doubleArray1[1] = ((double)(-5451));
        doubleArray1[2] = 0.15885495038741;
        doubleArray1[3] = ((double)(-5451));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double)(-5448));
        doubleArray0[4] = ((double)(-5448));
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        doubleArray0[7] = -5448.0;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[2] = -5448.0;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(1.0616069563868612E30, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[4] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[2] = -0.8891123146020142;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[1] = 49.8014015728657;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[2] = 0.15885495038741;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 0.15885495038741;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(7.079497796714639E15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[4] = ((double)(-35));
        doubleArray0[5] = ((double)(-35));
        doubleArray0[6] = ((double)(-35));
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double)(-35));
        doubleArray1[2] = -19.59374856783727;
        doubleArray1[3] = ((double)(-35));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(2.9808533489293008E13, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -0.19479450034474333;
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[2] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = -0.19479450034474333;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = -0.19479450034474333;
        doubleArray1[1] = -0.19479450034474333;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double)(-5448));
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[4] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[2] = -0.6633606526334896;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals((-2.6294986033962253E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[3] = 3.5834549549463;
        doubleArray0[4] = ((double)(-5448));
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        doubleArray0[7] = 3.5834549549463;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -3304.7932;
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[2] = 2.2250738585072014E-308;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[4] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = -5448.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals((-2.787683936527211E30), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[6] = ((double)(-5448));
        doubleArray0[7] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[3] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(1.1346006240009535E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double)(-5448));
        doubleArray0[1] = 3.5834549549463;
        doubleArray0[3] = 3.5834549549463;
        doubleArray0[4] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = ((double)(-5448));
        doubleArray1[2] = -0.6633606526334896;
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 3.5834549549463;
        doubleArray1[6] = 3.5834549549463;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(3.106100332206137E30, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        doubleArray0[5] = ((double)(-5448));
        doubleArray0[6] = ((double)(-5448));
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = 0.15885495038741;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(7.080053204344238E15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 0.15885495038741;
        doubleArray0[1] = ((double)(-5448));
        doubleArray0[2] = 0.15885495038741;
        doubleArray0[3] = 0.15885495038741;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = ((double)(-5448));
        doubleArray1[4] = 49.8014015728657;
        doubleArray1[5] = 0.15885495038741;
        doubleArray1[6] = -5448.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals((-1.0900236557996127E22), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -3304.7932;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -3304.7932;
        doubleArray1[2] = 2.2250738585072014E-308;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , ((double)(4)));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(8, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(8, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 2438.13720703125);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getVT()));
        org.junit.Assert.assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3304.7932));
        eigenDecompositionImpl0.getRealEigenvalue(3);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , ((double)(4)));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertFalse(doubleArray2.equals(((java.lang.Object)(doubleArray1))));
    }
}

