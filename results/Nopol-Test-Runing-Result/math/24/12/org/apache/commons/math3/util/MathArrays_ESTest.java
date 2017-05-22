package org.apache.commons.math3.util;


public class MathArrays_ESTest extends org.apache.commons.math3.util.MathArrays_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 2);
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray1, 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        float[] floatArray1 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        float[] floatArray1 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-662.489349), (-662.489349), (-662.489349), (-662.489349), 0.0, 1.34217729E8, (-662.489349), 1102.22);
        org.junit.Assert.assertEquals(147575.2648221075, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1.34217729E8, java.lang.Double.NaN, (-2024.2), 1.34217729E8, (-2024.2), (-738.3));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = java.lang.Double.NEGATIVE_INFINITY;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 3.834E-20;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(3.834E-20, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = -2489.0723;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 1.6736043137862533E7;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[22];
        integerArray0[0] = ((java.lang.Integer)(-403));
        integerArray0[1] = ((java.lang.Integer)(-403));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[22];
        integerArray0[0] = ((java.lang.Integer)(-403));
        integerArray0[1] = ((java.lang.Integer)(-403));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = 226;
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = 140;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = 2;
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection[] mathArrays_OrderDirectionArray0 = org.apache.commons.math3.util.MathArrays.OrderDirection.values();
        org.junit.Assert.assertNotNull(mathArrays_OrderDirectionArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -3299.2591300559416;
        doubleArray0[1] = -296.95912096234;
        doubleArray0[2] = 2550.19;
        double[][] doubleArray1 = new double[1][4];
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, doubleArray1);
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ -3299.2591300559416 , -296.95912096234 , 0.0 , 2550.19 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.34217729E8;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-249.25258));
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals((-3.3454115234990818E10), double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.34217729E8 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1281088.9322451379, 0.0, 1856.511307205, 0.0, (-16.424), 0.0, (-1368.979871664899), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, (-1.0), 0.0, 0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-8.8433455776), (-8.8433455776), (-8.8433455776), 225.943, (-8.8433455776), 1.34217729E8);
        org.junit.Assert.assertEquals((-1.186935680074934E9), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, (-1729.004794808596));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int[] intArray1 = new int[1];
        intArray1[0] = -1875;
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray1, intArray0);
        org.junit.Assert.assertEquals(1875, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 134217729;
        int[] intArray1 = new int[7];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals(134217729, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 217;
        intArray0[2] = 2147483639;
        int[] intArray1 = new int[5];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals((-2147483440), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[1] = -169;
        int[] intArray1 = new int[5];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray1);
        org.junit.Assert.assertEquals(169.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 473.8727179763;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-2596.51));
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals(3070.3827179763002, double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ -0.0 , -2596.51 , -0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 1062);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{ 0 , 0 }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test066() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = java.lang.Double.NaN;
        doubleArray0[1] = 2117.135986103;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 0.0);
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = ((double)(-403));
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 1.44888888888888883E18);
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.44888888888888883E18 , -0.0 , -0.0 , -0.0 , -0.0 }, doubleArray1, 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[5][5];
        doubleArray0[4] = null;
        double[] doubleArray1 = new double[0];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0[4], doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = ((double)(-403));
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 1.44888888888888883E18);
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 1.44888888888888883E18 , -0.0 , -0.0 , -0.0 , -0.0 }, doubleArray1, 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        floatArray0[1] = 1207.8536F;
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        float[] floatArray0 = new float[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = java.lang.Float.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        float[] floatArray1 = new float[0];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(java.lang.Double.NaN, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1.0), 0.0, (-1.0), 0.0, 0.0, 4175.5967211616025, 1.34217729E8, (-1399.6114554));
        org.junit.Assert.assertEquals((-1.878526710261728E11), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-738.3), (-738.3), (-1.0), java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-569.9101605020343), 0.0, 3562.0, (-309.045267411418));
        org.junit.Assert.assertEquals((-1100819.242519471), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[4][8];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = 5.669184079525E-24;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(5.669184079525E-24, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[6][8];
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0[3]);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -1.0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = ((double)(-403));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray0 = new double[6][8];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0[2], mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        java.lang.Integer[] integerArray0 = new java.lang.Integer[4];
        java.lang.Integer integer0 = new java.lang.Integer(0);
        integerArray0[0] = integer0;
        integerArray0[1] = integerArray0[0];
        java.lang.Integer integer1 = new java.lang.Integer(134217741);
        integerArray0[2] = integer1;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        stringArray0[1] = "g%w=(f$M6tM2";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[8];
        stringArray0[0] = "kW5[";
        stringArray0[1] = "vector length mismatch: got {0} but expected {1}";
        stringArray0[2] = "NOT_POSITIVE_DEGREES_OF_FREEDOM";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[7];
        stringArray0[0] = " go~09.Z~";
        stringArray0[1] = "h&4A<e>2HW";
        stringArray0[2] = "M";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[5];
        java.lang.Integer integer0 = new java.lang.Integer(20);
        integerArray0[0] = integer0;
        integerArray0[1] = integerArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        java.lang.Integer[] integerArray0 = new java.lang.Integer[2];
        integerArray0[0] = ((java.lang.Integer)(27));
        integerArray0[1] = ((java.lang.Integer)(intArray0[1]));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        double[][] doubleArray0 = new double[6][8];
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0[5], doubleArray0[3]);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(((double[])(null)), mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

