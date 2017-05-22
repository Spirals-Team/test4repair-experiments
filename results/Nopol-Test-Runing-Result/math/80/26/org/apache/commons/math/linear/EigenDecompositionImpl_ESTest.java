package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 811.6;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -445.00608;
        doubleArray0[4] = 811.6;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 811.6;
        doubleArray1[3] = 1.8330972295643733E-9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -641.2;
        doubleArray0[2] = 811.6;
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 11.2667182117321;
        doubleArray0[5] = -1437.9;
        doubleArray0[7] = -370.903791416;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = -641.2;
        doubleArray1[6] = -445.00608;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -445.00608;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1.8330972295643733E-9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double)(4356));
        double[] doubleArray1 = new double[3];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 578.72);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(4356.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -357.00095;
        doubleArray1[1] = -357.00095;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals((-1.0709170887483826E-13), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 578.72);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 30.794113988572995;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 1.732050807568877;
        doubleArray1[1] = -357.00095;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.732050807568877);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-1.3584086207981285E-9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , doubleArray0 , 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 32.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 3.8035121296320757);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getV()));
        org.junit.Assert.assertEquals(3, array2DRowRealMatrix1.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -641.2;
        doubleArray0[2] = 811.6;
        doubleArray0[6] = 1.8330972295643733E-9;
        doubleArray0[7] = 811.6;
        doubleArray0[8] = -1437.9;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 11.2667182117321;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = -641.2;
        doubleArray1[5] = 1.8330972295643733E-9;
        doubleArray1[7] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double)(4278));
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = ((double)(907));
        doubleArray1[1] = ((double)(4278));
        doubleArray1[2] = ((double)(907));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 578.72);
        org.junit.Assert.assertEquals(6.767513772009343E11, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -641.2;
        doubleArray0[2] = 811.6;
        doubleArray0[3] = 811.6;
        doubleArray0[6] = 811.6;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 11.2667182117321;
        doubleArray1[3] = 811.6;
        doubleArray1[4] = -641.2;
        doubleArray1[5] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = -370.903791416;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = -641.2;
        doubleArray1[5] = -641.2;
        doubleArray1[6] = -445.00608;
        doubleArray1[7] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = 4734.6919;
        doubleArray0[7] = -370.903791416;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 11.2667182117321;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = 4734.6919;
        doubleArray1[5] = -641.2;
        doubleArray1[6] = -445.00608;
        doubleArray1[7] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = -445.00608;
        doubleArray0[4] = 1.8330972295643733E-9;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -641.2;
        doubleArray0[2] = 811.6;
        doubleArray0[4] = 11.2667182117321;
        doubleArray0[5] = -1437.9;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 11.2667182117321;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = -641.2;
        doubleArray1[5] = -641.2;
        doubleArray1[6] = -445.00608;
        doubleArray1[7] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(1.1479319050484208E20, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 1.8330972295643733E-9;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        doubleArray0[7] = -370.903791416;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-3.157572721544641E-9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = ((double)(-11));
        doubleArray1[1] = ((double)(-11));
        doubleArray1[2] = ((double)(907));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 578.72);
        org.junit.Assert.assertEquals((-1.3515226016095981E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -641.2;
        doubleArray0[2] = -445.00608;
        doubleArray0[4] = 1.8330972295643733E-9;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 88.67523134823182;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 88.67523134823182;
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -445.00608;
        doubleArray0[2] = 811.6;
        doubleArray0[3] = 811.6;
        doubleArray0[4] = 11.2667182117321;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 811.6;
        doubleArray0[7] = -370.903791416;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = -641.2;
        doubleArray1[6] = 1.8330972295643733E-9;
        doubleArray1[7] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.67953441289416));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -641.2;
        doubleArray0[2] = -445.00608;
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 1.8330972295643733E-9;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = -1023.0;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[5] = -641.2;
        doubleArray1[6] = -445.00608;
        doubleArray1[7] = -641.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(1.464913399587806E25, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -445.00608;
        doubleArray0[2] = 785.3728629598794;
        doubleArray0[7] = 1.8330972295643733E-9;
        doubleArray0[6] = 4734.6919;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 785.3728629598794;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[5] = -445.00608;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.01859735997992595), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -641.2;
        doubleArray0[2] = 811.6;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = -641.2;
        doubleArray1[5] = 1.8330972295643733E-9;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -641.2;
        doubleArray0[2] = -445.00608;
        doubleArray0[4] = 1.8330972295643733E-9;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = -1023.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[6] = -445.00608;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -445.00608;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.67953441289416;
        doubleArray1[2] = 11.2667182117321;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = -445.00608;
        doubleArray1[5] = 4061.036;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.67953441289416));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 811.6;
        doubleArray1[3] = -432.7;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -641.2;
        doubleArray0[2] = -445.00608;
        doubleArray0[3] = 1.8330972295643733E-9;
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 811.6;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getEigenvector(5);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-432.7));
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , java.lang.Double.NaN);
        org.junit.Assert.assertFalse(eigenDecompositionImpl1.equals(((java.lang.Object)(eigenDecompositionImpl0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 32.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 578.72);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

