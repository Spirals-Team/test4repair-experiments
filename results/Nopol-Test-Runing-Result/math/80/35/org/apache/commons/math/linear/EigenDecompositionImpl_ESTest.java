package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1749.237;
        doubleArray0[1] = 1291.15;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray0 , 1291.15);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 169.1667901;
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(169.1667901, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 169.1667901;
        doubleArray0[3] = 169.1667901;
        doubleArray0[0] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[1] = -2135.999209;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        org.junit.Assert.assertEquals((-2225.4100851480744), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 169.1667901;
        doubleArray0[3] = 169.1667901;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[4] = 169.1667901;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(2.343638655200986E13, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = 169.1667901;
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = 169.1667901;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -3134.500829424507;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-1.59152680357704224E17), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , 0.9999999999999998);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[1] = 169.1667901;
        doubleArray1[2] = -3134.500829424507;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = 169.1667901;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-1.05776880583435891E18), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -265.0;
        doubleArray0[2] = 169.1667901;
        doubleArray0[3] = 169.1667901;
        doubleArray0[0] = -2135.999209;
        doubleArray0[5] = -265.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[1] = -2135.999209;
        doubleArray1[2] = -3134.500829424507;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals(1.2146746770013907E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 169.1667901;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -2128.2242892532145;
        doubleArray1[2] = -265.0;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[1] = -2135.999209;
        doubleArray1[2] = -3134.500829424507;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-1.9745072993029872E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -3379.0;
        doubleArray0[3] = -3379.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -3379.0;
        doubleArray1[1] = -2128.2242892532145;
        doubleArray1[2] = -265.0;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0));
        org.junit.Assert.assertEquals(9.0984017140831877E18, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.1520751286298037E-7;
        doubleArray0[3] = 1.1520751286298037E-7;
        doubleArray0[4] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.1520751286298037E-7;
        doubleArray1[1] = -2135.999209;
        doubleArray1[2] = -3134.500829424507;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 168.44365758805836;
        doubleArray0[2] = 168.44365758805836;
        doubleArray0[3] = -265.0;
        doubleArray0[0] = 168.44365758805836;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -265.0;
        doubleArray1[1] = 168.44365758805836;
        doubleArray1[2] = -3134.500829424507;
        doubleArray1[3] = 168.44365758805836;
        doubleArray1[4] = 168.44365758805836;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-1.1755950730146272E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.1520751286298037E-7;
        doubleArray0[2] = 1.1520751286298037E-7;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.1520751286298037E-7;
        doubleArray1[1] = 1.1520751286298037E-7;
        doubleArray1[2] = -3134.500829424507;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = -7.0459103674923024E19;
        doubleArray1[3] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-7.0459103674923024E19));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = -3095.5256219289636;
        doubleArray1[3] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3095.5256219289636));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 169.1667901;
        doubleArray0[3] = 169.1667901;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[1] = -2135.999209;
        doubleArray1[2] = -3134.500829424507;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = 169.1667901;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-8.022881998546924E15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[1] = -2135.999209;
        doubleArray1[2] = -3134.500829424507;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1.1520751286298037E-7;
        doubleArray0[4] = 1.1520751286298037E-7;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.1520751286298037E-7;
        doubleArray1[2] = -3134.500829424507;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1.1520751286298037E-7;
        doubleArray0[4] = 1.1520751286298037E-7;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -3134.500829424507;
        doubleArray1[4] = 1.1520751286298037E-7;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0267037933;
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = -3.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -265.0267037933;
        doubleArray1[3] = 169.1667901;
        doubleArray1[4] = -265.0267037933;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0267037933));
        org.junit.Assert.assertEquals(5.156562945035523E15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -7.0459103674923024E19;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = -3095.5256219289636;
        doubleArray1[3] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3095.5256219289636));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0267037933;
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[5] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -265.0267037933;
        doubleArray1[3] = 169.1667901;
        doubleArray1[4] = -265.0267037933;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0267037933));
        org.junit.Assert.assertEquals((-3.303534811989781E15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -7.0459103674923024E19;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -7.0459103674923024E19;
        doubleArray1[2] = -3095.5256219289636;
        doubleArray1[3] = -1675.157610854672;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3095.5256219289636));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -3379.0;
        doubleArray1[1] = -2128.2242892532145;
        doubleArray1[2] = -265.0;
        doubleArray1[3] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver1 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver1.equals(((java.lang.Object)(decompositionSolver0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0267037933));
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0267037933));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0267037933));
        eigenDecompositionImpl0.getV();
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , 2062.599567);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3134.500829424507));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray2);
    }
}

