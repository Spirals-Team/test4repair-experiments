

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest extends EigenDecompositionImpl_ESTest_scaffolding {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 811.6;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -445.00608;
        doubleArray0[4] = 811.6;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 811.6;
        doubleArray1[3] = 1.8330972295643733E-9;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -445.00608;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1.8330972295643733E-9;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double) (4356));
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 578.72);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(4356.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -357.00095;
        doubleArray1[1] = -357.00095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals((-1.0709170887483826E-13), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 578.72);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 30.794113988572995;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = 1.732050807568877;
        doubleArray1[1] = -357.00095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.732050807568877);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.3584086207981285E-9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), doubleArray0, 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 32.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 3.8035121296320757);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertEquals(3, array2DRowRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double) (4278));
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = ((double) (907));
        doubleArray1[1] = ((double) (4278));
        doubleArray1[2] = ((double) (907));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 578.72);
        Assert.assertEquals(6.767513772009343E11, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[7] = -370.903791416;
        doubleArray0[8] = -1475.97307232;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = -641.2;
        doubleArray1[5] = -641.2;
        doubleArray1[6] = -445.00608;
        doubleArray1[7] = -641.2;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = -445.00608;
        doubleArray0[4] = 1.8330972295643733E-9;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-3.157572721544641E-9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.67953441289416));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -641.2;
        doubleArray0[2] = 811.6;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 1.8330972295643733E-9;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = -641.2;
        doubleArray1[5] = 1.8330972295643733E-9;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -445.00608;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.67953441289416;
        doubleArray1[2] = 11.2667182117321;
        doubleArray1[3] = 1.8330972295643733E-9;
        doubleArray1[4] = -445.00608;
        doubleArray1[5] = 4061.036;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.67953441289416));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -370.903791416;
        doubleArray1[1] = -432.7;
        doubleArray1[2] = 811.6;
        doubleArray1[3] = -432.7;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -445.00608;
        doubleArray0[1] = -641.2;
        doubleArray0[2] = -445.00608;
        doubleArray0[3] = 1.8330972295643733E-9;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1.8330972295643733E-9;
        doubleArray0[4] = 811.6;
        doubleArray0[5] = -1437.9;
        doubleArray0[6] = 4734.6919;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getSolver();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getEigenvector(5);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), Double.NaN);
        Assert.assertFalse(eigenDecompositionImpl1.equals(((Object) (eigenDecompositionImpl0))));
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 32.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 578.72);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(2.307198649622036E21, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = ((double) (-11));
        doubleArray1[1] = ((double) (-11));
        doubleArray1[2] = ((double) (907));
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 578.72);
        Assert.assertEquals(5.252531370032749E9, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
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
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-432.7));
        Assert.assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}
