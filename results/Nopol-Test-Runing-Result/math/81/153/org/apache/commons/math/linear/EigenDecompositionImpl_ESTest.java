package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[0] = -644.5031261176058;
        double[] doubleArray1 = new double[6];
        doubleArray0[6] = 496.6;
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = -30.512618757617673;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals(3.582383056849495E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[4] = 1498004.0700769452;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(1498004.0700769452, double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(1)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2707.87337722134;
        doubleArray0[1] = -2707.87337722134;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -2707.87337722134;
        doubleArray1[4] = 1497972.6158999146;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(1.2064828649347467E26, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2707.87337722134;
        doubleArray0[1] = -1207.5;
        doubleArray0[2] = -2707.87337722134;
        doubleArray0[3] = -4664106.23241592;
        double[] doubleArray1 = new double[5];
        doubleArray1[4] = 1497972.6158999146;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 4233277.84414509);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-9.266591669444911E28), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 496.6;
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[3] = 925049.4489271459;
        doubleArray0[4] = -469.00625;
        doubleArray0[6] = -644.922506803;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 496.6;
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = 5.533767888239384E-16;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals(8.56979271276942E25, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[3] = 10.0178749274099;
        doubleArray0[4] = -469.00625;
        doubleArray0[0] = -644.5031261176058;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 496.6;
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = -30.512618757617673;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals((-3.717619304254368E21), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[3] = 10.0178749274099;
        doubleArray0[4] = -469.00625;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = -30.512618757617673;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4664106.23241592;
        doubleArray0[4] = 1497972.6158999146;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -2707.87337722134;
        doubleArray1[2] = -2707.87337722134;
        doubleArray1[3] = -2707.87337722134;
        doubleArray1[4] = 1497972.6158999146;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[6] = 496.6;
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[3] = 10.0178749274099;
        doubleArray0[4] = -469.00625;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 496.6;
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = -30.512618757617673;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals((-3.8924818362390656E20), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -4664106.23241592;
        doubleArray0[4] = 1497972.6158999146;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -4484.85057141;
        doubleArray1[1] = -2707.8734;
        doubleArray1[2] = -2707.8734;
        doubleArray1[3] = -1207.5;
        doubleArray1[4] = 1497972.6158999146;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 5.533767888366015E-16);
        org.junit.Assert.assertEquals((-3.309484988825496E26), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 925049.4489271459;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = -30.512618757617673;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -2707.87337722134;
        doubleArray1[3] = -2707.87337722134;
        doubleArray1[4] = 1498004.0700769452;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[4] = 1764.8191;
        doubleArray0[5] = 1764.8191;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 496.6;
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        doubleArray1[4] = 496.6;
        doubleArray1[5] = 1764.8191;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-469.00625));
        org.junit.Assert.assertEquals((-2.2132866926353987E24), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 1498004.0700769452;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1498004.0700769452;
        doubleArray1[1] = 0.333;
        doubleArray1[2] = 1498004.0700769452;
        doubleArray1[3] = 0.333;
        doubleArray1[4] = 1498004.0700769452;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1498004.0700769452);
        org.junit.Assert.assertEquals((-1.1299987421678287E37), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2707.87337722134;
        doubleArray0[2] = -2707.87337722134;
        doubleArray0[1] = 1498004.0700769452;
        doubleArray0[5] = -2707.87337722134;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -2707.87337722134;
        doubleArray1[3] = -2707.87337722134;
        doubleArray1[4] = 1498004.0700769452;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        org.junit.Assert.assertEquals(3.3840888358796297E31, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2707.87337722134;
        doubleArray0[1] = -2707.87337722134;
        doubleArray0[2] = -2707.87337722134;
        doubleArray0[3] = -4664106.23241592;
        doubleArray0[4] = -2707.87337722134;
        doubleArray0[5] = -4664106.23241592;
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = -2707.87337722134;
        doubleArray1[4] = -2707.87337722134;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        org.junit.Assert.assertEquals(1.1615096231081582E27, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2707.87337722134;
        doubleArray0[1] = -2707.87337722134;
        doubleArray0[2] = -2707.87337722134;
        doubleArray0[3] = -2707.87337722134;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -2707.87337722134;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 496.6;
        doubleArray1[1] = -469.00625;
        doubleArray1[2] = -469.00625;
        doubleArray1[3] = 1764.8191;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[3] = 10.0178749274099;
        doubleArray0[4] = -469.00625;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 496.6;
        doubleArray1[1] = -469.00625;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1764.8191;
        doubleArray0[2] = 925049.4489271459;
        doubleArray0[3] = 10.0178749274099;
        doubleArray0[4] = -469.00625;
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2724.406004));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 4233277.84414509);
        eigenDecompositionImpl0.getImagEigenvalue(3);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2707.87337722134));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

