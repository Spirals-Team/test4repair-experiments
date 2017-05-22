package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 1.1102230246251565E-16;
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        doubleArray0[6] = -73.3117388218676;
        doubleArray0[7] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 680.230418803047;
        doubleArray1[1] = 1.1102230246251565E-16;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 680.230418803047;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals((-1.6090317164996782E25), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -73.3117388218676;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 28.23115434807677;
        doubleArray1[3] = -73.3117388218676;
        doubleArray1[6] = 680.230418803047;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        org.junit.Assert.assertEquals((-28.23115434807677), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        doubleArray0[2] = 680.230418803047;
        doubleArray0[3] = 661.5;
        doubleArray0[7] = 661.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 661.5;
        doubleArray1[5] = 7458749.8391592;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(4.793330499475581E30, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = -2198.36916258092;
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-2198.36916258092), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 4.212097337585874E-10);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl1.getV()));
        org.junit.Assert.assertFalse(array2DRowRealMatrix1.equals(((java.lang.Object)(array2DRowRealMatrix0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        doubleArray0[2] = 680.230418803047;
        doubleArray0[3] = 661.5;
        doubleArray0[7] = 661.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 661.5;
        doubleArray1[3] = 661.5;
        doubleArray1[4] = 1.2599210498948732;
        doubleArray1[5] = 7458749.8391592;
        doubleArray0[5] = 680.230418803047;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(3.0102629746603935E33, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        doubleArray0[2] = 680.230418803047;
        doubleArray0[3] = 661.5;
        doubleArray0[4] = 680.230418803047;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 680.230418803047;
        doubleArray1[1] = 661.5;
        doubleArray1[2] = 680.230418803047;
        doubleArray1[3] = 661.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 28.23115434807677;
        doubleArray0[5] = -73.3117388218676;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 680.230418803047;
        doubleArray1[1] = 28.23115434807677;
        doubleArray1[2] = 9.0;
        doubleArray1[3] = 9.0;
        doubleArray1[4] = 0.6719889895860163;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 7458749.8391592;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 11442.757047036479;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 661.5;
        doubleArray0[4] = 661.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 661.5;
        doubleArray1[3] = 661.5;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 11442.757047036479;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 7458749.8391592;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 656.6473355848584;
        doubleArray1[2] = -73.3117388218676;
        doubleArray1[4] = 0.6719889895860163;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 1.1102230246251565E-16;
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        doubleArray0[7] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 1.1102230246251565E-16;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 661.5;
        doubleArray1[6] = 680.230418803047;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals((-1.2859663510022523E31), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[5] = 661.5;
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 661.5;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[5] = 7458749.8391592;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 6.527610429777095E10;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 6.527610429777095E10;
        doubleArray1[1] = -11.26571687501372;
        doubleArray1[2] = 11472.432374491294;
        doubleArray1[3] = 11472.432374491294;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 661.5;
        doubleArray0[5] = 1.2599210498948732;
        doubleArray0[6] = -73.3117388218676;
        doubleArray0[7] = -73.3117388218676;
        double[] doubleArray1 = new double[7];
        doubleArray1[6] = 7458749.8391592;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 661.5;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals(3.97986846559496E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 661.5;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -11.26571687501372;
        doubleArray0[2] = 6.527610429777095E10;
        doubleArray0[3] = 11472.432374491294;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 6.527610429777095E10;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(4)));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getEigenvector(4);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-73.3117388218676));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getEigenvector(4);
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getRealEigenvalue(4);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        eigenDecompositionImpl0.getImagEigenvalue(4);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1132.960404274019));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertFalse(doubleArray2.equals(((java.lang.Object)(doubleArray0))));
    }
}

