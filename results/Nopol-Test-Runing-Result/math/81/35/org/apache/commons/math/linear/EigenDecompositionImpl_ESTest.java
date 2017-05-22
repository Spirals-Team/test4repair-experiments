package org.apache.commons.math.linear;


public class EigenDecompositionImpl_ESTest extends org.apache.commons.math.linear.EigenDecompositionImpl_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = -265.0;
        doubleArray0[2] = -265.0;
        doubleArray0[3] = -265.0;
        doubleArray0[4] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -0.21601176474152006;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math.linear.ArrayRealVector)(eigenDecompositionImpl0.getEigenvector(0)));
        org.junit.Assert.assertEquals(1.0, arrayRealVector0.getL1Norm(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[4] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -2135.999209;
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals((-1.49502595633001E10), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1685.3342557539204;
        doubleArray0[1] = 1685.3342557539204;
        doubleArray0[2] = 0.06309575215459137;
        doubleArray0[3] = -1016.92;
        doubleArray0[4] = 1454.934012458;
        doubleArray0[6] = 2430.96626;
        doubleArray0[7] = 1.1102230246251565E-16;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 2430.96626;
        doubleArray1[4] = 0.06309575215459137;
        doubleArray1[5] = 2430.96626;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1016.92));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = -1675.8718971;
        double[] doubleArray1 = new double[5];
        doubleArray0[4] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3112.94));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.421274326580074E-25;
        doubleArray0[2] = 1.421274326580074E-25;
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.421274326580074E-25);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 169.1667901;
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3112.94));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        org.junit.Assert.assertEquals(169.1667901, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[4] = -2135.999209;
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1675.8718971));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        org.junit.Assert.assertEquals((-265.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[3] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1675.8718971));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[2] = -265.0;
        doubleArray0[3] = -265.0;
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = -265.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -0.21601176474152006;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals((-8.188772035944467E-4), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(((double[])(null)) , ((double[])(null)) , (-22.155471));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = -1675.8718971;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = -1675.8718971;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1675.8718971));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -2135.999209;
        doubleArray0[5] = -1675.8718971;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1675.8718971;
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = -1675.8718971;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1675.8718971));
        org.junit.Assert.assertEquals(2.3716050150913466E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = -1675.8718971;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1675.8718971;
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = -1675.8718971;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1675.8718971));
        org.junit.Assert.assertEquals((-3.064274367618233E19), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1652.365932844445;
        doubleArray0[3] = 1652.365932844445;
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = -1675.8718971;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1675.8718971;
        doubleArray1[1] = 169.1667901;
        doubleArray1[2] = -3112.94;
        doubleArray1[3] = -1675.8718971;
        doubleArray1[4] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3112.94));
        org.junit.Assert.assertEquals((-6.7693758127826514E18), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -1675.8718971;
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = 1.3371526108585385E-12;
        doubleArray1[3] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.3371526108585385E-12);
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = -265.0;
        doubleArray0[2] = -265.0;
        doubleArray0[3] = -265.0;
        doubleArray0[5] = -265.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.23;
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals((-6.926206730658535E14), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[3] = 1975.1730327974;
        doubleArray0[4] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -2135.999209;
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = 1975.1730327974;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals(1.24998330390811597E18, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1975.207626766362;
        doubleArray0[3] = 1975.207626766362;
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = 1975.207626766362;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -2135.999209;
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = 1975.207626766362;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals(1.4722979718847078E20, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1675.8718970999996;
        doubleArray0[1] = 3041.2711;
        doubleArray0[2] = 0.06309575215459137;
        doubleArray0[3] = -1016.92;
        doubleArray0[6] = 2430.96626;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 2430.96626;
        doubleArray1[4] = 0.06309575215459137;
        doubleArray1[5] = 2430.96626;
        doubleArray1[6] = 3.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1016.92));
        org.junit.Assert.assertEquals(7.143739431512382E23, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -265.0;
        doubleArray0[2] = -265.0;
        doubleArray0[4] = -2135.999209;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -1675.8718971;
        doubleArray1[2] = 1.3371526108585385E-12;
        doubleArray1[3] = -1675.8718971;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.3371526108585385E-12);
        eigenDecompositionImpl0.getV();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -265.0;
        doubleArray0[2] = -265.0;
        doubleArray0[3] = -265.0;
        doubleArray0[5] = -265.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1675.8718970999996;
        doubleArray0[1] = 3041.2711;
        doubleArray0[2] = 0.06309575215459137;
        doubleArray0[3] = -1016.92;
        doubleArray0[4] = 1454.934012458;
        doubleArray0[6] = 2430.96626;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 2430.96626;
        doubleArray1[3] = 2430.96626;
        doubleArray1[4] = 0.06309575215459137;
        doubleArray1[5] = 2430.96626;
        doubleArray1[6] = 3.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1016.92));
        org.junit.Assert.assertEquals((-3.922536237211441E27), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[3] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -2135.999209;
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[3] = 1975.1730327974;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 169.1667901;
        doubleArray1[2] = -3112.94;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3112.94));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[0] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -3112.94;
        doubleArray1[3] = -2135.999209;
        doubleArray1[4] = -0.21601176474152006;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3112.94));
        eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertEquals(4.344295630730214E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = 169.1667901;
        doubleArray0[2] = 1975.1730327974;
        doubleArray0[3] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-265.0));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -265.0;
        doubleArray0[2] = -265.0;
        doubleArray0[3] = -265.0;
        doubleArray0[4] = -2135.999209;
        doubleArray0[5] = -265.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = -0.21601176474152006;
        doubleArray1[4] = -0.21601176474152006;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -0.21601176474152006;
        doubleArray1[2] = -0.21601176474152006;
        doubleArray1[3] = -265.0;
        doubleArray1[4] = -265.0;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -265.0;
        doubleArray0[1] = -265.0;
        doubleArray0[2] = 1975.1730327974;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -3098.9293719575544;
        doubleArray1[4] = -1675.871897;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3098.9293719575544));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-3098.9293719575544));
        org.junit.Assert.assertEquals(1.89407312096535808E18, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 1.421274326580074E-25;
        doubleArray1[3] = 1.421274326580074E-25;
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , 1.421274326580074E-25);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        eigenDecompositionImpl0.getEigenvector(0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        org.junit.Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        eigenDecompositionImpl0.getEigenvector(0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getVT()));
        org.junit.Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-1675.8718971));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        eigenDecompositionImpl0.getEigenvector(0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix1 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getV()));
        org.junit.Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3098.9293719575544));
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(eigenDecompositionImpl0.getD()));
        org.junit.Assert.assertNotNull(array2DRowRealMatrix0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl1 = new org.apache.commons.math.linear.EigenDecompositionImpl(((org.apache.commons.math.linear.RealMatrix)(array2DRowRealMatrix0)) , (-3098.9293719575544));
        eigenDecompositionImpl1.getSolver();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-3112.94));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        eigenDecompositionImpl0.getImagEigenvalue(0);
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl0 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0 , doubleArray1 , (-0.21601176474152006));
        eigenDecompositionImpl0.getImagEigenvalues();
        org.junit.Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

