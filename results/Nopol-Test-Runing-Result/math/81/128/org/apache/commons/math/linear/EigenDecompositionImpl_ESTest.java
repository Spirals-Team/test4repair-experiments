package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = -8.675921967900518;
        doubleArray0[2] = -8.675921967900518;
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = -8.675921967900518;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-8.675921967900518));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[2] = ((double)(-7));
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[7] = ((double)(-2142071306));
        doubleArray0[8] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = 7.255501635616751;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-4.9738019365726396E82), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = -640.378;
        doubleArray0[2] = -640.378;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-640.378));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -640.37799;
        doubleArray0[1] = 0.6931471805599453;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.6931471805599453);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = -15.816822272422014;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-15.816822272422014));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(15.816822272422014, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -640.37799;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-15.816822272422014));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-640.37799), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.6931471805599453);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
        org.junit.Assert.assertEquals(3, arrayRealVector0.getDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = ((double)(-2142071306));
        doubleArray0[8] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[5] = ((double)(-2142071306));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(1.4344091971408367E41, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        doubleArray0[8] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[5] = ((double)(-2142071306));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-8.561839437794184E82), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 1140.853376);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 0.9999999999999998;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[4] = ((double)(-2142071306));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[7] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = 7.255501635616751;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-7));
        doubleArray0[2] = ((double)(-7));
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-7));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[8] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-7));
        doubleArray1[6] = 7.255501635616751;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-7));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        doubleArray0[8] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = -2.142071306E9;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-3.3045827209256413E84), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = ((double)(-7));
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-7));
        doubleArray0[7] = ((double)(-7));
        doubleArray0[8] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-7));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 17.464080512131524;
        doubleArray1[5] = ((double)(-7));
        doubleArray1[6] = -7.0;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-1.1183567311567562E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-7));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = -2.142071306E9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = ((double)(-7));
        doubleArray0[8] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 17.464080512131524;
        doubleArray1[5] = ((double)(-7));
        doubleArray1[6] = -7.0;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = ((double)(-7));
        doubleArray0[4] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-7));
        doubleArray1[6] = 7.255501635616751;
        doubleArray1[7] = 6.176170685989746E-13;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[2] = ((double)(-7));
        doubleArray0[3] = ((double)(-2142071306));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[4] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[2] = ((double)(-2142071306));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = 12.566370614359172;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-2.338236050276672E68), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-2142071306));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = 7.255501635616751;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-2.823117092369389E53), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071351));
        doubleArray0[2] = ((double)(-7));
        doubleArray0[3] = ((double)(-2142071351));
        doubleArray0[5] = ((double)(-2142071351));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071351));
        doubleArray0[4] = ((double)(-2142071351));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071351));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-2142071351));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-2142071351));
        doubleArray1[6] = 0.9999999999999998;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-3.170536843432722E68), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        doubleArray0[8] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = ((double)(-2142071306));
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[6] = -2.142071306E9;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-1.098675714608355E83), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-7));
        doubleArray0[7] = ((double)(-2142071306));
        doubleArray0[8] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = -2.142071306E9;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(-2142071306));
        doubleArray0[3] = ((double)(-2142071306));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[4] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4425.028369572873));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-7));
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 0.3749305845639874;
        doubleArray1[5] = ((double)(-7));
        doubleArray1[6] = -7.0;
        doubleArray1[7] = -33.61440651763629;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = ((double)(-7));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-2142071306));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = ((double)(-2142071306));
        doubleArray0[4] = ((double)(-7));
        doubleArray0[5] = ((double)(-2142071306));
        doubleArray0[6] = -33.61440651763629;
        doubleArray0[7] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -33.61440651763629;
        doubleArray1[2] = ((double)(-7));
        doubleArray1[6] = -2.142071306E9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = ((double)(-7));
        doubleArray0[3] = ((double)(-2142071306));
        doubleArray0[7] = ((double)(-2142071306));
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = ((double)(-7));
        doubleArray1[3] = 0.9999999999999998;
        doubleArray1[4] = 12.566370614359172;
        doubleArray1[5] = ((double)(-2142071306));
        doubleArray1[6] = 7.255501635616751;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getVT()));
        org.junit.Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4388.732052886594));
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-15.816822272422014));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-640.37799));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-15.816822272422014));
        eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getImagEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4391.3));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

