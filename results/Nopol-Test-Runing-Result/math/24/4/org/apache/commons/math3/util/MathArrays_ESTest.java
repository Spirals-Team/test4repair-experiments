package org.apache.commons.math3.util;


public class MathArrays_ESTest extends org.apache.commons.math3.util.MathArrays_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        float[] floatArray1 = new float[14];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, (-488.9749963), (-1130.103));
        org.junit.Assert.assertEquals(552592.110243619, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1.86285714285714278E18;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(1.86285714285714278E18, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = 3.834E-20;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(3.834E-20, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.34217729E8;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.34217729E8 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[4];
        java.lang.Double double0 = new java.lang.Double(8.83937750756523E7);
        doubleArray0[0] = double0;
        java.lang.Double double1 = new java.lang.Double((-1615.02415805));
        doubleArray0[1] = double1;
        doubleArray0[2] = doubleArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[8];
        stringArray0[0] = "minimal step size ({1,number,0.00E00}) reached, integration needs {0,number,0.00E00}";
        stringArray0[1] = "644";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 134217729;
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = -125;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection[] mathArrays_OrderDirectionArray0 = org.apache.commons.math3.util.MathArrays.OrderDirection.values();
        org.junit.Assert.assertNotNull(mathArrays_OrderDirectionArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.valueOf("DECREASING");
        org.junit.Assert.assertEquals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING, mathArrays_OrderDirection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 3450.0886671619;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-2428.2834));
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -2428.2834 , -0.0 , -0.0 , -0.0 }, doubleArray1, 0.01);
        org.junit.Assert.assertEquals((-8377793.038997366), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, 1.34217729E8, 0.0, 1.34217729E8, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-581.675646415468), 1.34217729E8, (-1009.9), 3.834E-20, 0.0, (-2060.3337070352054), (-581.675646415468), (-2060.3337070352054));
        org.junit.Assert.assertEquals((-7.806998583055023E10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, (-463.2497873711), 0.0, 0.0, 0.0, (-1016.8113252716116));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1.0, 1.0, (-913.2140246382438), 6.52E17, 3.6725170580355583E-9, 1748.381);
        org.junit.Assert.assertEquals((-5.95415544064135E20), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-230.345), 1.34217729E8, 5250.1799, (-42.54033041218359));
        org.junit.Assert.assertEquals((-3.091660613089267E10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[1] = -2046;
        int[] intArray1 = new int[6];
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray1);
        org.junit.Assert.assertEquals(2046, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        double[] doubleArray0 = new double[20];
        doubleArray0[1] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        intArray0[0] = 2806;
        int[] intArray1 = new int[6];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray1, intArray0);
        org.junit.Assert.assertEquals(2806, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -855.42635801157;
        double[] doubleArray1 = new double[1];
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals(855.42635801157, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = -125;
        int[] intArray1 = new int[5];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray1);
        org.junit.Assert.assertEquals(125.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2.092571258544922;
        double[] doubleArray1 = new double[4];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals(2.092571258544922, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, false, false);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 0);
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray1, mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 1.0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -244.196551967;
        doubleArray0[3] = java.lang.Double.NaN;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 1.34217729E8);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.34217729E8 , -0.0 , -0.0 , java.lang.Double.NaN , -0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -3183.93377;
        double[] doubleArray1 = new double[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -3183.93377;
        double[] doubleArray1 = new double[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        float[] floatArray1 = new float[14];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[1] = java.lang.Float.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        float[] floatArray1 = new float[1];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, java.lang.Double.NaN, 0.0, 0.0, 30.09, 0.0, java.lang.Double.NaN, 1.021);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(((double)(0)), ((double)(-839)), 0.11113807559013367, java.lang.Double.NaN, ((double)(-839)), (-776.32429));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1386.29), (-1386.29), (-1386.29), (-1386.29), (-1386.29), 1.0);
        org.junit.Assert.assertEquals(3842213.6382, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(java.lang.Double.NaN, 2101.498, 715.846, 1646.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1.0, 0.0, 0.0, ((double)(0.0F)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1.7976931348623157E308;
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.7976931348623157E308 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[1][0];
        doubleArray1[0] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[1][9];
        double[] doubleArray1 = new double[9];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray1, mathArrays_OrderDirection0, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[4] = 1.55276224058132E-39;
        doubleArray0[5] = 1.55276224058132E-39;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(2.1959374197709376E-39, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = 3.26E18;
        doubleArray0[6] = 3.26E18;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(4.6103362133362903E18, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(134217729));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = -360.07162808;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -1819.7479;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[4];
        java.lang.Double double0 = new java.lang.Double(1354.68463);
        doubleArray0[0] = double0;
        doubleArray0[1] = doubleArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[8];
        stringArray0[0] = "";
        stringArray0[1] = "Z";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[9];
        stringArray0[0] = "";
        stringArray0[1] = "";
        stringArray0[2] = "";
        stringArray0[3] = "vector must have at least one element";
        stringArray0[4] = "org.apache.commons.math3.util.MathArrays$OrderDirection";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = ":'VWnZC<t#] {E^PP>Q";
        stringArray0[1] = "NOT_POSITIVE_PERMUTATION";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "B";
        stringArray0[1] = "B";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test131() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[][] doubleArray1 = new double[9][1];
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(((double[])(null)), mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 888);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }
}

