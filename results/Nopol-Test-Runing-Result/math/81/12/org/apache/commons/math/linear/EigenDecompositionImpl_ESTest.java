package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = 2398258.878069406;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 12.566370614359172);
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals((-5.751645646238726E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = -806.94;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(651152.1636000001, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 1580.176;
        doubleArray0[2] = 2.446931546273845E-13;
        doubleArray0[3] = 3552.6882836062;
        doubleArray0[4] = 0.25;
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3552.6882836062);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        org.junit.Assert.assertEquals(2.446931546273845E-13, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -4957.215261942;
        doubleArray0[5] = -1720.843365;
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3552.6882836062);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(6);
        org.junit.Assert.assertEquals((-1720.843365), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = -806.94;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(651152.1636000001, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = 12.566370614359172;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 12.566370614359172);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-10140.307103550991), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , doubleArray0 , 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -823.781399;
        doubleArray1[1] = -4957.215261942;
        doubleArray1[2] = 1855.5;
        doubleArray1[3] = 2.446931546273845E-13;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2.446931546273845E-13);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[5] = 4.576133363434347E8;
        doubleArray0[7] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 4.576133363434347E8;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1173.5;
        doubleArray1[5] = 788.8;
        doubleArray1[6] = 2544.6249668702617;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -1689.7142020461747;
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[4] = 1173.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 1557.7335801679212;
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 4.576133363434347E8;
        doubleArray1[3] = -1689.7142020461747;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[4] = 1173.5;
        doubleArray0[5] = 4.576133363434347E8;
        doubleArray0[6] = -2421.864781154;
        doubleArray0[7] = 788.8;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 1557.7335801679212;
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 4.576133363434347E8;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.7335801679212;
        doubleArray1[5] = 788.8;
        doubleArray1[6] = 2544.6249668702617;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-2.2881877735093982E42), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 2544.6249668702617;
        doubleArray0[5] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 1557.7335801679212;
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 4.576133363434347E8;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.7335801679212;
        doubleArray1[5] = 788.8;
        doubleArray1[6] = 2544.6249668702617;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-3.831358840599479E42), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[5] = 4.576133363434347E8;
        doubleArray0[6] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 2544.6249668702617;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = -2421.864781154;
        doubleArray1[5] = 788.8;
        doubleArray1[6] = 2544.6249668702617;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[5] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 1.2041021588882206E-4;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.7335801679212;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -1689.7142020461747;
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[2] = 1557.1474166317855;
        doubleArray0[5] = 4.576133363434347E8;
        doubleArray0[6] = -2421.864781154;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 2544.6249668702617;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.1474166317855;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[4] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 4.576133363434347E8;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.7335801679212;
        doubleArray1[5] = 788.8;
        doubleArray1[6] = 2544.6249668702617;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[5] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 2544.6249668702617;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.1474166317855;
        doubleArray1[5] = 788.8;
        doubleArray1[6] = 1.2041021588882206E-4;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 2544.6249668702617;
        doubleArray0[2] = 1557.1474166317855;
        doubleArray0[5] = 4.576133363434347E8;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 2544.6249668702617;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.1474166317855;
        doubleArray1[5] = 788.8;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 4.576133363434347E8;
        doubleArray1[2] = 2544.6249668702617;
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.1474166317855;
        doubleArray1[5] = 788.8;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1557.7335801679212;
        doubleArray0[3] = 1.2041021588882206E-4;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 1557.7335801679212;
        doubleArray1[1] = 4.576133363434347E8;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[5] = 4.576133363434347E8;
        doubleArray0[6] = -2421.864781154;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = -1689.7142020461747;
        doubleArray1[4] = 1557.7335801679212;
        doubleArray1[6] = 2544.6249668702617;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3788.41705653));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -4957.215261942;
        doubleArray0[1] = -4957.215261942;
        doubleArray0[2] = 2.446931546273845E-13;
        doubleArray0[3] = -4957.215261942;
        doubleArray0[4] = 0.25;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 1855.5;
        doubleArray1[4] = -823.8;
        doubleArray1[5] = 0.25;
        doubleArray1[6] = -4957.215261942;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-4957.215261942));
        org.junit.Assert.assertEquals(4.688491952185412E29, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -4957.215261942;
        doubleArray1[2] = 1855.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3552.6882836062);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[19];
        double[] doubleArray1 = new double[18];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[19];
        double[] doubleArray1 = new double[18];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(1)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
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
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(2, array2DRowRealMatrix0.getColumnDimension());
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 0.0);
        eigenDecompositionImpl1.getV();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[19];
        double[] doubleArray1 = new double[18];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getRealEigenvalue(16);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getImagEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[19];
        double[] doubleArray1 = new double[18];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-806.94));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

