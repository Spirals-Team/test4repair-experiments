package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -357.00095;
        doubleArray0[1] = -357.00095;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -357.00095;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -138888.89583004694;
        doubleArray0[2] = -602.2482746497102;
        doubleArray0[3] = -602.2482746497102;
        doubleArray0[5] = -2826.116921158;
        doubleArray0[6] = 18.0;
        doubleArray0[7] = -602.2482746497102;
        doubleArray0[8] = -1383.295209;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -602.2482746497102;
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[7] = -138888.89583004694;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals(6.250949853904606E35, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -394.38988840705485;
        doubleArray0[1] = -394.38988840705485;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-394.38988840705485));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 14.635035232975266;
        doubleArray0[2] = 1.732050807568877;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 14.635035232975266);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(1.732050807568877, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -357.00095;
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = -357.00095;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 14.635035232975266);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(4.549965623061658E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-357.00095), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 14.635035232975266);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(1)));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -357.00095;
        doubleArray0[1] = -357.00095;
        doubleArray0[2] = 1.732050807568877;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(220749.3182254742, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = 1.732050807568877;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 1.732050807568877;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-5.196152422706628), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , doubleArray0 , 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 32.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.732050807568877);
        eigenDecompositionImpl1.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 316.8781610497305;
        doubleArray0[2] = -138888.89583004694;
        doubleArray0[7] = 316.8781610497305;
        doubleArray0[5] = -138888.89583004694;
        doubleArray0[8] = -1383.295209;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -138888.89583004694;
        doubleArray1[2] = -138888.89583004694;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = 316.8781610497305;
        doubleArray1[5] = 316.8781610497305;
        doubleArray1[6] = -138888.89583004694;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-138888.89583004694));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -138888.89583004694;
        doubleArray0[4] = -138888.89583004694;
        doubleArray0[5] = -2826.116921158;
        doubleArray0[8] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[5] = -138888.89583004694;
        doubleArray1[6] = 18.0;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -138888.89583004694;
        doubleArray0[4] = -138888.89583004694;
        doubleArray0[7] = -602.2482746497102;
        doubleArray0[8] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -138888.89583004694;
        doubleArray1[5] = -138888.89583004694;
        doubleArray1[6] = 18.0;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -138888.89583004694;
        doubleArray0[8] = -1383.295209;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -602.2482746497102;
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[5] = -602.2482746497102;
        doubleArray1[6] = -602.2482746497102;
        doubleArray1[7] = -138888.89583004694;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(9.859782036055459E31, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 316.8781610497305;
        doubleArray0[5] = -2826.116921158;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[5] = -602.2482746497102;
        doubleArray1[6] = -602.2482746497102;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 316.8781610497305;
        doubleArray0[4] = 302.8660297637741;
        doubleArray0[5] = -2826.116921158;
        doubleArray0[7] = -602.2482746497102;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[5] = -602.2482746497102;
        doubleArray1[6] = -602.2482746497102;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -138888.89583004694;
        doubleArray1[5] = -138888.89583004694;
        doubleArray1[6] = 18.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -138888.89583004694;
        doubleArray0[4] = -138888.89583004694;
        doubleArray0[8] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -138888.89583004694;
        doubleArray1[5] = -138888.89583004694;
        doubleArray1[6] = 18.0;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -138888.89583004694;
        doubleArray0[4] = -138888.89583004694;
        doubleArray0[6] = -2826.116921158;
        doubleArray0[7] = -138888.89583004694;
        doubleArray0[8] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[5] = -138888.89583004694;
        doubleArray1[6] = 18.0;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = -602.2482746497102;
        doubleArray0[5] = -2826.116921158;
        doubleArray0[6] = 18.0;
        doubleArray0[7] = -602.2482746497102;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[7] = -138888.89583004694;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -138888.89583004694;
        doubleArray0[1] = 316.8781610497305;
        doubleArray0[2] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = -138888.89583004694;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = 0.5;
        doubleArray1[5] = 316.8781610497305;
        doubleArray1[6] = -138888.89583004694;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-138888.89583004694));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -138888.89583004694;
        doubleArray0[1] = -138888.89583004694;
        doubleArray0[4] = -138888.89583004694;
        doubleArray0[8] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -602.2482746497102;
        doubleArray1[2] = -602.2482746497102;
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[5] = -138888.89583004694;
        doubleArray1[6] = 18.0;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals((-1.4876305484155914E36), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = -138888.89583004694;
        doubleArray0[5] = -2826.116921158;
        doubleArray0[6] = 18.0;
        doubleArray0[8] = -138888.89583004694;
        double[] doubleArray1 = new double[8];
        doubleArray1[6] = 18.0;
        doubleArray1[7] = 0.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -138888.89583004694;
        doubleArray0[1] = 316.8781610497305;
        doubleArray0[2] = -602.2482746497102;
        doubleArray0[3] = -602.2482746497102;
        doubleArray0[5] = -2826.116921158;
        doubleArray0[6] = 18.0;
        doubleArray0[7] = -602.2482746497102;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 316.8781610497305;
        doubleArray1[4] = -2826.116921158;
        doubleArray1[7] = -138888.89583004694;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        org.junit.Assert.assertEquals(8.23234430293877E35, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(3, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2826.116921158));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-357.00095));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 375.890407);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

