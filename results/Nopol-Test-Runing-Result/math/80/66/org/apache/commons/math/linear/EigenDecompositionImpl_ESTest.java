package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = -1075.80066194259;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1075.80066194259));
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(1.5, double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 27.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        org.junit.Assert.assertEquals((-177.0), double0, 0.01);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(1)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = 27.0;
        doubleArray0[2] = 165862.8481090568;
        doubleArray0[3] = 2494.33136269;
        double[] doubleArray1 = new double[5];
        doubleArray1[4] = 27.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(8.760448999024492E15, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[3] = 2494.33136269;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        doubleArray1[4] = 27.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-4.401452313813917E9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.9999999999999998);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -177.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.9999999999999998);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 27.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 27.0;
        doubleArray1[3] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = -1075.80066194259;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1075.80066194259));
        org.junit.Assert.assertEquals((-3.013767511275557E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        org.junit.Assert.assertEquals((-3.0137675109655615E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 2494.33136269;
        doubleArray1[3] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.5);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 165862.8481090568;
        doubleArray0[4] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 27.0;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = 27.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        org.junit.Assert.assertEquals((-1.8983385221102467E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = -177.0;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = 165862.8481090568;
        doubleArray1[4] = 27.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.0));
        org.junit.Assert.assertEquals((-1.8983385399257977E9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = 165862.8481090568;
        doubleArray0[5] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = -1075.80066194259;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        org.junit.Assert.assertEquals((-2.3900610739000528E20), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 165862.8481090568;
        doubleArray0[3] = 2494.33136269;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = 27.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        org.junit.Assert.assertEquals(3.4905543822463174E17, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 2494.33136269;
        doubleArray0[4] = -177.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1059.2579836708874;
        doubleArray1[2] = 3772.953;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1059.2579836708874));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = 165862.8481090568;
        doubleArray0[4] = -177.0;
        doubleArray0[5] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        org.junit.Assert.assertEquals((-1.2795290855147478E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1075.80066194259;
        doubleArray0[1] = -1075.80066194259;
        doubleArray0[4] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.5;
        doubleArray1[2] = 1.5;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        org.junit.Assert.assertEquals(5.278473473979344E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 165862.8481090568;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[1] = 1.5;
        doubleArray1[2] = -10.518041618286837;
        doubleArray1[3] = -1075.80066194259;
        doubleArray1[4] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        org.junit.Assert.assertEquals((-1.481825276307127E14), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -1075.80066194259;
        doubleArray0[4] = -177.0;
        doubleArray0[5] = -0.3159877098721481;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1075.80066194259;
        doubleArray1[2] = 2494.33136269;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-177.0));
        org.junit.Assert.assertEquals(4.0273128409349225E14, eigenDecompositionImpl1.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(4.0273128409376575E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -1075.80066194259;
        doubleArray1[3] = -1075.80066194259;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1075.80066194259));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1075.80066194259));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-177.0));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1059.2579836708874));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-177.0));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getVT()));
        org.junit.Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 2213.8);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

