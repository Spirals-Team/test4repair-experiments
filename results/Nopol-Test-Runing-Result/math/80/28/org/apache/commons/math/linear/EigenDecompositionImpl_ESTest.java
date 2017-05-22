package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        doubleArray0[1] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[0] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1.1102230246251565E-14;
        doubleArray0[3] = 1.1102230246251565E-14;
        doubleArray0[6] = 1.0986122886681096;
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(1.1102230246251565E-14, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        doubleArray0[4] = -298.0;
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals((-298.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(2)));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[2] = 1.1102230246251565E-14;
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[5] = -1791.3498848054287;
        doubleArray0[6] = 5.563853238645008E8;
        double[] doubleArray1 = new double[6];
        doubleArray0[4] = 1.1102230246251565E-14;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 45.5263296062519);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(1.6734941228090178E-12, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        doubleArray0[1] = -0.9863392590717683;
        doubleArray0[4] = -298.0;
        doubleArray0[5] = -1791.3498848054287;
        doubleArray0[6] = 1.0986122886681096;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 20.08553692318767);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-5.296112642839033E15), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[4] = -298.0;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 18.451348250750993;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 0.014631227719162608;
        doubleArray0[4] = -298.0;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.014631227719162608;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = 0.014631227719162608;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(247074.285604174, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = 2.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.014631227719162608;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = 0.014631227719162608;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = 0.014631227719162608;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-1.7873110870257863E-5), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        doubleArray0[2] = -1318.3217716;
        doubleArray0[4] = -298.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = -1318.3217716;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals(6.9742472061032776E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 2074.3888893121;
        doubleArray0[4] = -298.0;
        doubleArray0[6] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 2074.3888893121;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1791.3498848054287));
        org.junit.Assert.assertEquals((-6.3480076455775155E17), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[4] = -2853.17833;
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = 0.014631227719162608;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals(9.6357662352395328E17, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[2] = -2.185039863261519;
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[4] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 2074.3888893121;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = 2074.3888893121;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-1.6314088162310497E24), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 2074.3888893121;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = 2074.3888893121;
        doubleArray1[4] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2853.17833;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[4] = -298.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = -2.185039863261519;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1.1102230246251565E-14;
        doubleArray1[2] = -298.0;
        doubleArray1[3] = -2853.17833;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = 1.1102230246251565E-14;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2853.17833;
        doubleArray0[3] = 2074.3888893121;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = -2853.17833;
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = -1791.3498848054287;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -2.185039863261519;
        doubleArray0[2] = -2.185039863261519;
        doubleArray0[3] = -2.185039863261519;
        doubleArray0[4] = -2.185039863261519;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -1791.3498848054287;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[4] = -2853.17833;
        doubleArray0[1] = 2.0;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 2.0;
        doubleArray1[2] = 0.9950547536867305;
        doubleArray1[3] = -2853.17833;
        doubleArray1[4] = 0.014631227719162608;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = -1791.3498848054287;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = -1791.3498848054287;
        doubleArray1[3] = -298.0;
        doubleArray1[4] = 1.1102230246251565E-14;
        doubleArray1[5] = 1.0986122886681096;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 20.08553692318767);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
        eigenDecompositionImpl0.getVT();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 20.08553692318767);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 0.0);
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
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 1.0986122886681096);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-2.185039863261519));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.0986122886681096);
        eigenDecompositionImpl0.getImagEigenvalue(2);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 45.5263296062519);
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

