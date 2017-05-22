package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2853.17833;
        doubleArray0[2] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2853.17833;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[4] = -298.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -2.185039863261519;
        doubleArray1[5] = -2853.17833;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = 2074.3888893121;
        doubleArray0[6] = 1.0986122886681096;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals(0.08325, double0, 0.01);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.2;
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[3] = -2853.2;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-6.286882126005366E-11), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(2);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[3] = -2853.17833;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(5.29449093109058E11, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[2] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = -2853.17833;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-5.29449093109058E11), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 1.2599210498948732);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        doubleArray0[6] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -0.44097834644488515;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals((-2.591370566717889E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        doubleArray0[6] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -0.44097834644488515;
        doubleArray1[1] = -0.44097834644488515;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        doubleArray0[6] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -1791.3498848054287;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals((-4.276178569229072E19), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[2] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -2.185039863261519;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(4.825312750185725E8, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[4] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -2.185039863261519;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = 2074.3888893121;
        doubleArray0[4] = -298.0;
        doubleArray0[2] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -2.185039863261519;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -1791.3498848054287;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -2.185039863261519;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -2.185039863;
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -0.44097834644488515;
        doubleArray1[1] = -2.185039863;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 4.547473508864641E-13;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[2] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 20.08553692318767);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -2.185039863;
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        doubleArray0[6] = -2.185039863;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -0.44097834644488515;
        doubleArray1[1] = -2.185039863;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863));
        org.junit.Assert.assertEquals((-6.968897406091204E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[4] = -298.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = -2.185039863261519;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.1102230246251565E-14;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.1102230246251565E-14);
        org.junit.Assert.assertEquals((-5.286334966596486E23), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.2;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = -2853.2;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(7.143148713844975E8, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(2)));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getNorm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 20.08553692318767);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863));
        eigenDecompositionImpl0.getD();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 109.12110620121);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 20.08553692318767);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

