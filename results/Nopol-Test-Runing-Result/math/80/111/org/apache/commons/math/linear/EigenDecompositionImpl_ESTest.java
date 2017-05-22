package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 1.0E-13;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 1.0E-13;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1859.41750753663);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 9.596465810589535;
        doubleArray1[5] = 9.596465810589535;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 9.596465810589535);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(9.596465810589535, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(6);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-0.08325), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(0)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1870.516;
        doubleArray0[1] = 1.0E-13;
        doubleArray0[2] = 2312.720040947729;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = -941.76753330995;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.002659135110580052, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2312.720040947729;
        doubleArray0[3] = 0.08325;
        doubleArray0[4] = -2291.85307536;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[5] = 1870.516;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-1.0700040410609774E10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1870.516);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 6.283185307179586;
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 6.283185307179586);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(6.283185307179586, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1870.516;
        doubleArray0[6] = 3555.9144914071;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 3555.9144914071;
        doubleArray1[3] = -941.76753330995;
        doubleArray1[4] = 1.0E-13;
        doubleArray1[5] = 1.0E-13;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 9.596465810589535;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 9.596465810589535;
        doubleArray1[2] = 9.596465810589535;
        doubleArray1[3] = 9.596465810589535;
        doubleArray1[4] = 9.596465810589535;
        doubleArray1[5] = 9.596465810589535;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 9.596465810589535);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 1870.516;
        doubleArray1[3] = 0.5403023058681398;
        doubleArray1[4] = 21461.127010282264;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 0.08325;
        doubleArray0[6] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 3565.736535848443;
        doubleArray1[3] = 1870.516;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2312.720040947729;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[0] = 2312.720040947729;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 1870.516;
        doubleArray1[3] = 0.5403023058681398;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 1870.516;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 0.08325;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2312.720040947729;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[4] = 2312.720040947729;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1870.516;
        doubleArray0[2] = -2291.85307536;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 2312.720040947729;
        doubleArray1[3] = 1.0E-13;
        doubleArray1[4] = 21461.127010282264;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 2312.720040947729;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = 3555.9144914071;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 3555.9144914071;
        doubleArray1[3] = -941.76753330995;
        doubleArray1[4] = 1.0E-13;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 3555.9144914071;
        doubleArray1[3] = -941.76753330995;
        doubleArray1[4] = 1.0E-13;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 1.0E-13;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1870.516;
        doubleArray0[1] = 1.0E-13;
        doubleArray0[3] = 0.08325;
        double[] doubleArray1 = new double[6];
        doubleArray1[4] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-2291.85307536));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = java.lang.Double.POSITIVE_INFINITY;
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[4] = 0.08325;
        doubleArray1[5] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 6.283185307179586);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1882.2332592741268);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1882.2332592741268);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1870.516);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1882.2332592741268);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

