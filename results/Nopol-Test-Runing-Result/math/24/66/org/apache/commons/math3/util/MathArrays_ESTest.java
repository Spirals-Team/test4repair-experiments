package org.apache.commons.math3.util;


public class MathArrays_ESTest extends org.apache.commons.math3.util.MathArrays_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        float[] floatArray1 = new float[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        float[] floatArray0 = new float[5];
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 2488.318, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 2142.1396747344056, 796.940904619);
        org.junit.Assert.assertEquals(1707158.7302030877, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 3.834E-20;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(3.834E-20, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[5];
        stringArray0[0] = "DECREASING";
        stringArray0[1] = "";
        stringArray0[2] = "=\bsg2f ,";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[4];
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        integerArray0[0] = integer0;
        java.lang.Integer integer1 = new java.lang.Integer(19);
        integerArray0[1] = integer1;
        integerArray0[2] = integer0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 4520;
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        intArray0[1] = 2;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.valueOf("DECREASING");
        org.junit.Assert.assertEquals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING, mathArrays_OrderDirection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection[] mathArrays_OrderDirectionArray0 = org.apache.commons.math3.util.MathArrays.OrderDirection.values();
        org.junit.Assert.assertNotNull(mathArrays_OrderDirectionArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 1.0;
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 1.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[3] = -2162.0;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 1.34217729E8);
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals((-2.90178730098E11), double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ -0.0 , -0.0 , -0.0 , 1.34217729E8 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(((double)(0.0F)), ((double)(1.0F)), (-10711.701249439975), ((double)(0.0F)), ((double)(0.0F)), 0.99, ((double)(0.0F)), (-1073.8055593254028));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1033.7971061426), 1582.74, 0.0, 0.0, 1.34217729E8, (-96.016), 0.0, 1.34217729E8);
        org.junit.Assert.assertEquals((-1.2888685699695776E10), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, (-626.04195763), 0.0, 1.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1.0), 0.0, (-1.0), 0.0, 4671.75137616805, (-1.0));
        org.junit.Assert.assertEquals((-4671.75137616805), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1507.4515), (-243.0), (-243.0), 4788.82);
        org.junit.Assert.assertEquals((-797372.5455), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = -1426;
        int[] intArray1 = new int[8];
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray1);
        org.junit.Assert.assertEquals(1426, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 1953.069404;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 1.34217729E8);
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals(1.34215775930596E8, double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 1.34217729E8 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 725;
        int[] intArray1 = new int[2];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray1, intArray0);
        org.junit.Assert.assertEquals(725, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 2145418759;
        int[] intArray1 = new int[5];
        intArray1[2] = 2145418759;
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals((-4129778), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[1] = -277;
        int[] intArray1 = new int[3];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray1);
        org.junit.Assert.assertEquals(277.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[8] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 169);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 0);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 494);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, true, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 1.304E19;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2664.9712259;
        doubleArray0[8] = java.lang.Double.NaN;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 0.0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , java.lang.Double.NaN }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 1888.295618;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-1212.34673742999));
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertArrayEquals(new double[]{ -0.0 , -1212.34673742999 , -0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1.0;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 258.831);
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 258.831 , 0.0 }, doubleArray1, 0.01);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[1] = ((float)(161));
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float[] floatArray1 = new float[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        floatArray0[6] = java.lang.Float.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        float[] floatArray1 = new float[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1.0, 0.0, 1.0, 1.0, 1922.4247200895757, java.lang.Double.NaN, java.lang.Double.NaN, 0.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1200.74518755), (-1200.74518755), (-1200.74518755), (-1200.74518755), (-1200.74518755), 0.0, 0.0, 4759.96530370488);
        org.junit.Assert.assertEquals(2883578.0108489697, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 1048.7, 1433.6530929589, (-522.41142905601), java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1827.71611629522), (-1827.71611629522), (-0.7714222713711291), (-1827.71611629522), (-1827.71611629522), (-0.6962101999375065));
        org.junit.Assert.assertEquals(3343228.617285891, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1218.2581219271024), (-1218.2581219271024), (-1218.2581219271024), java.lang.Double.NaN);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[][] doubleArray1 = new double[4][8];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[2][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.304E19;
        doubleArray0[2] = 1.304E19;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(1.8441344853345161E19, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = 1.0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 0.07073719799518585;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        java.lang.Double[] doubleArray0 = new java.lang.Double[2];
        doubleArray0[0] = ((java.lang.Double)(-2196.9260118542));
        doubleArray0[1] = ((java.lang.Double)(0.9285714285714286));
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[2];
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        integerArray0[0] = integer0;
        integerArray0[1] = integer0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[8];
        stringArray0[0] = "";
        stringArray0[1] = "";
        stringArray0[2] = "out of bounds significance level {0}, must be between {1} and {2}";
        stringArray0[3] = "";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[4];
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        integerArray0[0] = integer0;
        integerArray0[1] = integerArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        java.lang.Integer[] integerArray0 = new java.lang.Integer[3];
        integerArray0[0] = ((java.lang.Integer)(0));
        integerArray0[1] = ((java.lang.Integer)(0));
        integerArray0[2] = ((java.lang.Integer)(0));
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(((double[])(null)), mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }
}

