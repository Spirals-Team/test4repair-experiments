package org.apache.commons.math3.util;


public class MathArrays_ESTest extends org.apache.commons.math3.util.MathArrays_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        float[] floatArray1 = new float[0];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float[] floatArray1 = new float[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(2409.02, 402.607, (-805.71089), (-805.71089), (-4695.0689), (-805.71089), 411.78683743, 0.0);
        org.junit.Assert.assertEquals(5401926.495434913, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(2491.75832356683, 303.0, 0.0, 0.0, 1.0, 2883.324946);
        org.junit.Assert.assertEquals(757886.0969867494, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1823.55135), (-1823.55135), (-1823.55135), 36.71586904);
        org.junit.Assert.assertEquals(3258386.253532507, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1.700416E38;
        doubleArray0[4] = 2.80150337664E41;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(2.8015038926869075E41, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1.700416E38;
        doubleArray0[2] = 1.700416E38;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(2.404751368876209E38, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 3.834E-20;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(3.834E-20, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -1.0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2738.356465932248;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[7];
        java.lang.Integer integer0 = new java.lang.Integer((-4071));
        integerArray0[0] = integer0;
        java.lang.Integer integer1 = new java.lang.Integer(3045);
        integerArray0[1] = integer1;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[3];
        stringArray0[0] = "";
        stringArray0[1] = "";
        stringArray0[2] = "$VALUES";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[5];
        doubleArray0[0] = ((java.lang.Double)(java.lang.Double.NaN));
        doubleArray0[1] = ((java.lang.Double)(java.lang.Double.NaN));
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = -1163;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = 6.8631578947368422E17;
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -1.0;
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.valueOf("INCREASING");
        org.junit.Assert.assertEquals(org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING, mathArrays_OrderDirection0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.apache.commons.math3.util.MathArrays.OrderDirection[] mathArrays_OrderDirectionArray0 = org.apache.commons.math3.util.MathArrays.OrderDirection.values();
        org.junit.Assert.assertNotNull(mathArrays_OrderDirectionArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[][] doubleArray1 = new double[2][6];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 1.34217729E8;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-424.8805952));
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals((-5.70265085839123E10), double0, 0.01);
        org.junit.Assert.assertArrayEquals(new double[]{ -0.0 , -424.8805952 , -0.0 , -0.0 , -0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1.0, (-1717.538419929869), (-545.208169), (-1331.8845747326945), 0.0, (-545.208169), 793.97, (-1670.2061010069));
        org.junit.Assert.assertEquals((-601656.7261270223), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 167.614, 2485.0, 2485.0, (-482.5886678895544));
        org.junit.Assert.assertEquals((-782712.0497055427), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, (-872.978928), 779.282420609905, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination((-1.0), 402.607, 2409.02, (-2579.6334598));
        org.junit.Assert.assertEquals((-6214791.204327395), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = 94;
        int[] intArray1 = new int[4];
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray1, intArray0);
        org.junit.Assert.assertEquals(94, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        intArray0[0] = -1163;
        int[] intArray1 = new int[9];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals(1163, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[1] = -2146480791;
        intArray0[5] = 2145313437;
        int[] intArray1 = new int[9];
        intArray1[0] = -2146480791;
        intArray1[3] = -2146480791;
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray1);
        org.junit.Assert.assertEquals((-5178782), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 1613.4563;
        double[] doubleArray1 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.distance1(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals(1613.4563, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = -633;
        int[] intArray1 = new int[7];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(intArray0, intArray1);
        org.junit.Assert.assertEquals(633.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = 6.8631578947368422E17;
        double[] doubleArray1 = new double[7];
        double double0 = org.apache.commons.math3.util.MathArrays.distance(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals(6.8631578947368422E17, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 253);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0, 0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{ 0 }, intArray1);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = org.apache.commons.math3.util.MathArrays.copyOf(intArray0);
        org.junit.Assert.assertNotSame(intArray1, intArray0);
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 1564);
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0, 0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.copyOf(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{  }, doubleArray1, 0.01);
        org.junit.Assert.assertNotSame(doubleArray1, doubleArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 2051.310196757518;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2738.356465932248;
        doubleArray0[1] = 1508.61;
        doubleArray0[2] = 1508.61;
        doubleArray0[3] = 818.0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 818.0 , 1508.61 , 1508.61 , 2738.356465932248 }, doubleArray0, 0.01);
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray1[0], mathArrays_OrderDirection0, true, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, false, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.63E18;
        doubleArray0[5] = java.lang.Double.NaN;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-1481.687));
        org.junit.Assert.assertArrayEquals(new double[]{ -1481.687 , -0.0 , -0.0 , -0.0 , -0.0 , java.lang.Double.NaN }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -1.0;
        double[] doubleArray1 = org.apache.commons.math3.util.MathArrays.normalizeArray(doubleArray0, (-1.0));
        org.junit.Assert.assertArrayEquals(new double[]{ -1.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray1, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1635.5346550555478;
        double[] doubleArray1 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = java.lang.Double.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[15];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        floatArray0[0] = 1777.4009F;
        float[] floatArray1 = new float[8];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[5];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equalsIncludingNaN(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[1] = java.lang.Float.NaN;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[8];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(803.0, 0.0, 803.0, 0.0, java.lang.Double.NaN, 0.0, 803.0, 803.0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(24.0, (-5.963956844171991), (-5.963956844171991), java.lang.Double.NaN, 1.0, (-5.963956844171991));
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(0.0, 0.0, 0.0, 1.0, (-1867.3253879), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(1685.15682663, 0.0, java.lang.Double.NaN, 1685.15682663);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double double0 = org.apache.commons.math3.util.MathArrays.linearCombination(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[9][6];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        doubleArray1[4] = doubleArray0;
        doubleArray1[5] = doubleArray0;
        doubleArray1[6] = doubleArray0;
        doubleArray1[7] = doubleArray0;
        doubleArray1[8] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = java.lang.Double.NaN;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = ((double)(1.4E-45F));
        doubleArray0[4] = ((double)(1.4E-45F));
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(1.981735293180747E-45, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 1.700416E38;
        doubleArray0[1] = 1.304E19;
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(1.700416E38, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double double0 = org.apache.commons.math3.util.MathArrays.safeNorm(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2738.356465932248;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[1][1];
        doubleArray1[0] = doubleArray0;
        org.apache.commons.math3.util.MathArrays.sortInPlace(doubleArray0, mathArrays_OrderDirection0, doubleArray1);
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection1 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection1, false, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1.304E19;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true, true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -466.68747258422;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertArrayEquals(new double[]{ -466.68747258422 , 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.util.MathArrays.checkOrder(doubleArray0);
        org.junit.Assert.assertArrayEquals(new double[]{ 0.0 }, doubleArray0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[9];
        stringArray0[0] = "DECREASING";
        stringArray0[1] = ":s8e2(0IlX;6";
        stringArray0[2] = "";
        stringArray0[3] = "OqHT^  ";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        java.lang.Double[] doubleArray0 = new java.lang.Double[5];
        java.lang.Double double0 = new java.lang.Double(2.17333333333333325E18);
        doubleArray0[0] = double0;
        doubleArray0[1] = double0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(doubleArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[15];
        stringArray0[0] = "'bLG8=g]OR|%";
        stringArray0[1] = "'bLG8=g]OR|%";
        stringArray0[2] = "";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = new java.lang.String[9];
        stringArray0[0] = "'bLG8=g]OR|%";
        stringArray0[1] = "x";
        stringArray0[2] = "";
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.INCREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(stringArray0, mathArrays_OrderDirection0, true);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        java.lang.Integer[] integerArray0 = new java.lang.Integer[3];
        java.lang.Integer integer0 = new java.lang.Integer(0);
        integerArray0[0] = integer0;
        integerArray0[1] = integerArray0[0];
        integerArray0[2] = integer0;
        org.apache.commons.math3.util.MathArrays.OrderDirection mathArrays_OrderDirection0 = org.apache.commons.math3.util.MathArrays.OrderDirection.DECREASING;
        boolean boolean0 = org.apache.commons.math3.util.MathArrays.isMonotonic(integerArray0, mathArrays_OrderDirection0, false);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        int int0 = org.apache.commons.math3.util.MathArrays.distanceInf(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double double0 = org.apache.commons.math3.util.MathArrays.distanceInf(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int int0 = org.apache.commons.math3.util.MathArrays.distance1(intArray0, intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }
}

