package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -1250.834475315;
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1250.834475315));
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals((-1250.834475315), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = 2138.7;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = 13.953588961344309;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.563);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(0)));
        org.junit.Assert.assertEquals(1.0, arrayRealVector0.getLInfNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 1120599.6570806336;
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1120599.6570806336);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(1120599.6570806336, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[2] = 1.05;
        doubleArray0[3] = 0.563;
        doubleArray0[4] = 0.25;
        doubleArray0[6] = 2138.7;
        doubleArray0[7] = -903.34974761603;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 1.05;
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = -903.34974761603;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.34974761603));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[3] = 0.563;
        doubleArray0[4] = 0.25;
        doubleArray0[6] = 2138.7;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 1.05;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = -903.34974761603;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.34974761603));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[2] = 1.05;
        doubleArray0[3] = -0.557109391460306;
        doubleArray0[4] = 0.25;
        doubleArray0[6] = 2138.7;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 0.25;
        doubleArray1[3] = -0.557109391460306;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.557109391460306));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[2] = 1.05;
        doubleArray0[4] = 0.25;
        doubleArray0[6] = 2138.7;
        doubleArray0[7] = -903.349747616035;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 1.05;
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.349747616035));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 2.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[6] = 1.05;
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 1.05;
        doubleArray1[5] = -903.349747616035;
        doubleArray1[7] = 2.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.349747616035));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[2] = 1.05;
        doubleArray0[3] = 0.563;
        doubleArray0[4] = 0.25;
        doubleArray0[6] = 2138.7;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.349747616035));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = 2138.7;
        doubleArray0[1] = -903.349747616035;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 1.05;
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 1.05;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[2] = 1.05;
        doubleArray0[3] = 0.563;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 1.05;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.349747616035));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = 2138.7;
        doubleArray0[7] = -0.557109391460306;
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = -903.349747616035;
        doubleArray1[7] = 2.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.557109391460306));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2.0;
        doubleArray0[2] = 1.05;
        doubleArray0[3] = 2.0;
        doubleArray0[6] = 1.05;
        doubleArray0[7] = -903.349747616035;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 1.05;
        doubleArray1[3] = 1.05;
        doubleArray1[4] = 1.05;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-903.349747616035));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 1.05;
        doubleArray1[2] = 0.25;
        doubleArray1[3] = -0.557109391460306;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = -903.349747616035;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.557109391460306));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = 2138.7;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = java.lang.Double.NEGATIVE_INFINITY;
        doubleArray1[3] = 0.563;
        doubleArray1[4] = 13.953588961344309;
        doubleArray1[5] = 1.05;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.563);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[5] = 0.25;
        doubleArray1[6] = java.lang.Double.NEGATIVE_INFINITY;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 13.743241801626539);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 1.05;
        doubleArray1[3] = 0.563;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 13.743241801626539);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 0.4);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1250.834475315));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1120599.6570806336);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1250.834475315));
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1250.834475315));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 3.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getV()));
        org.junit.Assert.assertTrue(array2DRowRealMatrix1.equals(((java.lang.Object)(array2DRowRealMatrix0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertFalse(doubleArray2.equals(((java.lang.Object)(doubleArray1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray2, 0.01);
    }
}

