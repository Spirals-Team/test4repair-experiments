package org.apache.commons.math3.util;


public class MathArrays_ESTest extends org.apache.commons.math3.util.MathArrays_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -1966.0;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-1966.0));
        org.junit.Assert.assertArrayEquals(new double[]{ -1966.0 , 0.0 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float[] floatArray1 = new float[8];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, (-175.24322554798), (-175.24322554798), (-175.24322554798), 0.0, 3.834E-20, (-1.0));
        org.junit.Assert.assertEquals(30710.188100460186, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -9.138002603383259E21;
        doubleArray0[6] = -9.138002603383259E21;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(1.2923087214705256E22, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 3.834E-20;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(3.834E-20, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[3];
        java.lang.Double double0 = new java.lang.Double(0.0);
        doubleArray0[0] = double0;
        java.lang.Double double1 = new java.lang.Double((-4060.8161948708957));
        doubleArray0[1] = double1;
        doubleArray0[2] = doubleArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[6];
        stringArray0[0] = "org.apache.commons.math3.util.MathArrays$OrderDirection";
        stringArray0[1] = "7";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = -316;
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[1] = 133;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = -558.325761;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection[] mathArrays_OrderDirectionArray0 = org.apache.commons.math3.util.MathArrays.OrderDirection.values();
        org.junit.Assert.assertNotNull(mathArrays_OrderDirectionArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.valueOf("DECREASING");
        org.junit.Assert.assertEquals(org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING, mathArrays_OrderDirection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -2368.18256;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[3][6];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        double[] doubleArray2 = new double[2];
        doubleArray2[1] = 2147.730197208206;
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray2);
        org.junit.Assert.assertEquals((-5086217.196613834), double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , -2368.18256 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 1.35047392E8, 563.3, 0.0, 0.0, (-2692.4), 59.43350061195977, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(563.3, 563.3, 563.3, 563.3, 563.3, (-2692.4), 59.43350061195977, 563.3);
        org.junit.Assert.assertEquals((-848536.2491052831), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-2958.903562376557), 71.0131975, (-4108.13704047778), 1.0, (-400.571276868325), 60.272152398);
        org.junit.Assert.assertEquals((-238372.63314464694), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1.304E19, (-1329.0708436), 0.0, 1.304E19);
        org.junit.Assert.assertEquals((-1.7331083800544E22), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = -316;
        int[] intArray1 = new int[2];
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray1);
        org.junit.Assert.assertEquals(316, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)(java.lang.Float.NEGATIVE_INFINITY));
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[1] = -1;
        int[] intArray1 = new int[9];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 2146473463;
        intArray0[3] = 2147476880;
        int[] intArray1 = new int[5];
        intArray1[2] = 2147476880;
        intArray1[3] = 2147476880;
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals((-1016953), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)(java.lang.Float.NEGATIVE_INFINITY));
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 606;
        int[] intArray1 = new int[8];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray1);
        org.junit.Assert.assertEquals(606.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = -558.325761;
        double[] doubleArray1 = new double[4];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals(558.325761, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, true, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)), mathArrays_OrderDirection0, true);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(((double[])(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        try {
            org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[8][5];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        doubleArray1[4] = doubleArray0;
        doubleArray1[5] = doubleArray0;
        doubleArray1[6] = doubleArray0;
        doubleArray1[7] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 177.1897;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = -805.83115;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = 781.0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 2940);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = java.lang.Double.NaN;
        doubleArray0[1] = 2441.0;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, 1420.0149556612478);
        org.junit.Assert.assertArrayEquals(new double[]{ java.lang.Double.NaN , 1420.0149556612478 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 0.6299605249474366;
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[8];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = java.lang.Double.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[0] = ((float)(-1862));
        float[] floatArray1 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[2] = java.lang.Float.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        float[] floatArray1 = new float[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1184.79896, 1184.79896, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, 1.0, (-1.0), 1.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, java.lang.Double.NaN, 370.347026050024);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-2660.6), (-2660.6), (-2660.6), 683.8003391, 683.8003391, 683.8003391);
        org.junit.Assert.assertEquals(5727056.081543814, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(java.lang.Double.NaN, 1184.79896, 1184.79896, (-1.0));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[][] doubleArray1 = new double[0][8];
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -9.138002603383259E21;
        doubleArray0[4] = 1.304E19;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(9.138011907468671E21, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 370.347026050024;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[4];
        java.lang.Integer integer0 = new java.lang.Integer((-1827));
        integerArray0[0] = integer0;
        integerArray0[1] = integer0;
        integerArray0[2] = integer0;
        java.lang.Integer integer1 = new java.lang.Integer(15);
        integerArray0[3] = integer1;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[3];
        java.lang.Double double0 = new java.lang.Double(0.0);
        doubleArray0[0] = double0;
        doubleArray0[1] = doubleArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[5];
        doubleArray0[0] = ((java.lang.Double)(-3964.315559));
        doubleArray0[1] = ((java.lang.Double)(-3964.315559));
        java.lang.Double double0 = new java.lang.Double(0.0);
        doubleArray0[2] = double0;
        doubleArray0[3] = ((java.lang.Double)(-3964.315559));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "";
        stringArray0[1] = "{>U5ldL,QZG`45g4";
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[6];
        java.lang.Double double0 = new java.lang.Double(1.34217729E8);
        doubleArray0[0] = double0;
        doubleArray0[1] = doubleArray0[0];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        try {
            org.apache.commons.math3.util.MathArrays.isMonotonic(((double[])(null)), mathArrays_OrderDirection0, false);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{ 0 , 0 , 0 }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }
}

