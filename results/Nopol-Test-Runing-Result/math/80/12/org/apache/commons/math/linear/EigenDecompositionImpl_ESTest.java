package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -2340.6500177;
        doubleArray0[2] = 1116.1943;
        doubleArray0[3] = 805.8061685561252;
        doubleArray0[4] = 0.25;
        doubleArray0[5] = 1060.361;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = -806.94;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(651152.1636000001, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1116.1943;
        doubleArray0[3] = 805.8061685561252;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[6] = 1116.1943;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        org.junit.Assert.assertEquals(805.8061685561252, double0, 0.01);
        org.junit.Assert.assertEquals((-7.128095854546883E23), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[2] = -240.478783023;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[6] = 989.762929;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        org.junit.Assert.assertEquals(3.603623748217655E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-240.478783023), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(0)));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = -806.94;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(651152.1636000001, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = 12.566370614359172;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 12.566370614359172);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-10140.307103550991), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 12.566370614359172);
        eigenDecompositionImpl1.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-806.94));
        eigenDecompositionImpl1.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -2340.6500177;
        doubleArray0[3] = 9.0;
        doubleArray0[2] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 9.0;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 1116.1943;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1116.1943;
        doubleArray0[3] = 805.8061685561252;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -2340.6500177;
        doubleArray0[5] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = -2340.6500177;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1116.1943;
        doubleArray0[5] = 1060.361;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.8986751110615;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 0.5;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 0.25;
        doubleArray0[5] = 1060.361;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.8986751110615;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 0.5;
        doubleArray1[3] = -2340.6500177;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals(2.3149667550111456E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 1116.1943;
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 2604766.5680704177;
        doubleArray1[6] = 2604766.5680704177;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -2340.6500177;
        doubleArray0[3] = 805.8061685561252;
        doubleArray0[2] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 9.0;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -2340.6500177;
        doubleArray0[2] = 1116.1943;
        doubleArray0[5] = 1060.361;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.5376077394944;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[6] = 1116.1943;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals((-1.580968014927721E26), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 805.8061685561252;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.5376077394944;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 989.762929;
        doubleArray1[6] = 1116.1943;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -2340.6500177;
        doubleArray0[7] = 10775.679804615913;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -2340.6500177;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = 989.762929;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 805.8061685561252;
        doubleArray1[6] = 1116.1943;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-3.174545340053143E29), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 1.1102230246251565E-16;
        doubleArray1[6] = 1116.1943;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -2340.6500177;
        doubleArray0[5] = -2340.6500177;
        doubleArray0[6] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = -2340.6500177;
        doubleArray1[5] = -11.948660333569418;
        doubleArray1[6] = -2340.6500177;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = -2340.6500177;
        doubleArray1[5] = -11.948660333569418;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2340.6500177));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 12.566370614359172);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 12.566370614359172);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

