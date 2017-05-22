package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1036547906456;
        doubleArray0[3] = -1446.2721;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        doubleArray1[6] = 3260.1036547906456;
        doubleArray1[7] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-1.742844015523475E10), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 3.02056511208756;
        doubleArray0[1] = 3.02056511208756;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-851.0606));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , ((double)(2140570617)));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-851.0606));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = 1.9326762412674725E-12;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-3.7352374535597656E-24), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 77.06908815460635;
        doubleArray0[1] = 808.89;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(62340.41471737953, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 9.0;
        doubleArray0[4] = 279.49221762596;
        doubleArray0[8] = 32.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        doubleArray1[6] = 3260.1036547906456;
        doubleArray1[7] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1036547906456;
        doubleArray0[6] = 279.49221762596;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 3260.1036547906456;
        doubleArray1[5] = 3260.1036547906456;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3260.1036547906456);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 32.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 1.0;
        doubleArray0[2] = 9.0;
        doubleArray0[3] = -1446.2721;
        doubleArray0[5] = 1.05;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        doubleArray1[6] = 1.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1036547906456;
        doubleArray0[7] = 741.36401957089;
        doubleArray0[8] = 32.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        doubleArray1[6] = 3260.1036547906456;
        doubleArray1[7] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals(2.024852254178469E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 9.0;
        doubleArray0[4] = 279.49221762596;
        doubleArray0[7] = 741.36401957089;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1037;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 741.36401957089;
        doubleArray1[7] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.762195691083631);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = -1446.2721;
        doubleArray0[5] = 1.05;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        doubleArray1[6] = 3260.1036547906456;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1036547906456;
        doubleArray0[2] = 9.0;
        doubleArray0[3] = -1446.2721;
        doubleArray0[7] = 741.36401957089;
        doubleArray0[8] = 32.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 9.0;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 3.762195691083631;
        doubleArray1[5] = 3.626860407847019;
        doubleArray1[6] = 3260.1036547906456;
        doubleArray1[7] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-1.8364341305426903E20), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1037;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1037;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.762195691083631);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1036547906456;
        doubleArray0[3] = -1446.2721;
        doubleArray0[6] = 3.626860407847019;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1036547906456;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.626860407847019;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.626860407847019);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1037;
        doubleArray0[6] = 3260.1037;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1037;
        doubleArray1[4] = 9.0;
        doubleArray1[5] = 3.762195691083631;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.762195691083631);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3260.1037;
        doubleArray0[3] = -1446.2721;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.492217626;
        doubleArray1[2] = 741.36401957089;
        doubleArray1[3] = 3260.1037;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 741.36401957089;
        doubleArray1[7] = 741.36401957089;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.762195691083631);
        org.junit.Assert.assertEquals((-1.2715153786637725E30), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 3.762195691083631;
        doubleArray1[1] = 279.49221762596;
        doubleArray1[2] = 32.0;
        doubleArray0[2] = 3260.1036547906456;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 4.0;
        doubleArray0[1] = 1403.2;
        doubleArray0[2] = -851.0606;
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-851.0606));
        org.junit.Assert.assertEquals((-4776832.935679115), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 4.0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(2)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 4.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 4.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , java.lang.Double.NEGATIVE_INFINITY);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 3.762195691083631);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

