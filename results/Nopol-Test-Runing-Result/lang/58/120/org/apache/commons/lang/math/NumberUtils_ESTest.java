package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("'k");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(714)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(714)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-330)), ((short)(-1181)), ((short)(97)));
        org.junit.Assert.assertEquals(((short)(97)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)(0)), 463L, 0L);
        org.junit.Assert.assertEquals(463L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(0L, (-2341L), ((long)(1)));
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        floatArray0[1] = 1.0F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = ((byte)(-72));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-72)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[4];
        floatArray1[2] = -1701.1124F;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[10];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long[] longArray1 = new long[7];
        longArray1[0] = -1763L;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        long[] longArray1 = new long[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int[] intArray1 = new int[8];
        intArray1[3] = -2600;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        int[] intArray1 = new int[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        short[] shortArray0 = new short[0];
        short[] shortArray1 = new short[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byte[] byteArray1 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("-0x8@L9G1!IVFPC=3Fvx", 2648L);
        org.junit.Assert.assertEquals(2648L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("C[qeR", (-1522L));
        org.junit.Assert.assertEquals((-1522L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("3");
        org.junit.Assert.assertEquals(3L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("B~a|xyH?97>1Wq51", 100);
        org.junit.Assert.assertEquals(100, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("Iq6\"d-BO1<rxqa)zD", (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("", 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", ((double)(1634)));
        org.junit.Assert.assertEquals(1634.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("9");
        org.junit.Assert.assertEquals(9.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 1);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("I]d4.B_PBniNW`Up", (-577));
        org.junit.Assert.assertEquals((-577), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(545));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(545)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        shortArray0[1] = ((short)(-1));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = ((long)(1));
        longArray0[1] = ((long)(1));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 1442;
        intArray0[1] = 1491;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(1442, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = 2451.71F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(2451.71F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = ((double)((byte)(51)));
        doubleArray0[1] = ((double)((byte)(3)));
        doubleArray0[2] = ((double)((byte)(51)));
        doubleArray0[3] = ((double)((byte)(3)));
        doubleArray0[4] = ((double)((byte)(3)));
        doubleArray0[5] = ((double)((byte)(51)));
        doubleArray0[6] = ((double)((byte)(3)));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(3.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = ((double)(-577));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-577.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(97));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(97)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(-1579)), ((short)(-1579)), ((short)(-1579)));
        org.junit.Assert.assertEquals(((short)(-1579)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(0L, 456L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(3672L, 3672L, 3672L);
        org.junit.Assert.assertEquals(3672L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 2, 4344);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(68, 68, 68);
        org.junit.Assert.assertEquals(68, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)(0)), 1666.218F, 457.1F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-605.3F), (-605.3F), (-605.3F));
        org.junit.Assert.assertEquals((-605.3F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(0.0, 0.0, 1501.903524033787);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(2799.76031697, 2799.76031697, 2799.76031697);
        org.junit.Assert.assertEquals(2799.76031697, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(37)), ((byte)(37)), ((byte)(37)));
        org.junit.Assert.assertEquals(((byte)(37)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(-1)), ((byte)(0)), ((byte)(37)));
        org.junit.Assert.assertEquals(((byte)(-1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        shortArray0[0] = ((short)(-1));
        shortArray0[1] = ((short)(-120));
        shortArray0[2] = ((short)(-81));
        shortArray0[3] = ((short)(-1056));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        longArray0[0] = -37L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-37L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = ((int)((short)(-1579)));
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1579), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        floatArray0[2] = 3135.886F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(3135.886F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = -4711.0366F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-4711.0366F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = ((double)(3855));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(3855.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = ((double)(-2618));
        doubleArray0[1] = ((double)(-2618));
        doubleArray0[2] = ((double)(-2618));
        doubleArray0[3] = ((double)(-2618));
        doubleArray0[4] = ((double)(-2618));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-2618.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(-10));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-10)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-2423L), 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 0, (-325));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-10), (-2142753506), (-10));
        org.junit.Assert.assertEquals((-10), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(((float)(0L)), ((float)(0L)), ((float)(0L)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-1.0F), (-1903.0F), 1127.0F);
        org.junit.Assert.assertEquals(1127.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, ((double)(0.0F)), (-4507.64636652));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(((double)(-1.0F)), ((double)(-1.0F)), ((double)(-1.0F)));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-116)), ((byte)(-116)), ((byte)(-116)));
        org.junit.Assert.assertEquals(((byte)(-116)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(1725.0F, 1725.0F);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(278.0F, 1561.02F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)(1)), (-3672.8933077304));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-2780.89), (-2780.89));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)(0L)), 4962.696877634321);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble("v-)jJeJ%i#|4{g");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("7g'X@ooExL#");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), (-3473.99226316));
        org.junit.Assert.assertEquals((-3473.99226316), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("", (-1.0F));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), ((long)(0)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), ((int)((short)(0))));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(".");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("ES7");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xArray cannot be empty.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x67C5cW;yS_SI");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x-0xG<~!G!;+91xmiVq");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-- U");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("p");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0Yx67C5cW;yS_SI");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("7g'X@ooExL#");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(1.0F, ((float)(-453L)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 311.7834005873326;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-126)), ((byte)(-125)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(2)), ((byte)(-61)), ((byte)(1)));
        org.junit.Assert.assertEquals(((byte)(2)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-2886)), ((short)(-2886)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-330)), ((short)(97)), ((short)(97)));
        org.junit.Assert.assertEquals(((short)(97)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1542)), ((short)(-1542)), ((short)(-1542)));
        org.junit.Assert.assertEquals(((short)(-1542)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, ((int)(numberUtils0.SHORT_MINUS_ONE)), ((int)(numberUtils0.BYTE_ONE)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 3855, 152);
        org.junit.Assert.assertEquals(3855, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-1L), (-1L), (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(18)), ((byte)(18)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(103)), ((byte)(0)), ((byte)(79)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(146)), ((short)(1579)), ((short)(76)));
        org.junit.Assert.assertEquals(((short)(76)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(numberUtils0.SHORT_ONE)), ((short)(0)), ((short)(numberUtils0.SHORT_ONE)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(68, 68, (-3725));
        org.junit.Assert.assertEquals((-3725), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, (-2699), 0);
        org.junit.Assert.assertEquals((-2699), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(0L, 0L, (-1594L));
        org.junit.Assert.assertEquals((-1594L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(0L, (-3467L), (-3467L));
        org.junit.Assert.assertEquals((-3467L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min((-4750L), ((long)(1)), (-2341L));
        org.junit.Assert.assertEquals((-4750L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        floatArray0[0] = -4296.13F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = ((double)((short)(-2868)));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[2] = ((byte)(76));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(76)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[1] = ((short)(3820));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(3820)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        intArray0[1] = ((int)((byte)(18)));
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(18, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        long[] longArray0 = new long[9];
        longArray0[4] = ((long)(numberUtils0.LONG_ONE));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        floatArray0[7] = -4465.19F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-4465.19F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 2490.732514;
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[2] = ((byte)(-1));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        shortArray0[0] = ((short)(55));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test149() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[2] = -1875L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-1875L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test153() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = ((double)(1L));
        double[] doubleArray1 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        floatArray0[1] = -1701.1124F;
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[0] = -1L;
        long[] longArray1 = new long[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        long[] longArray0 = new long[0];
        long[] longArray1 = new long[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        long[] longArray0 = new long[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, ((long[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long[] longArray1 = new long[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = -3;
        int[] intArray1 = new int[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((int[])(null)), intArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int[] intArray1 = new int[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        short[] shortArray0 = new short[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, ((short[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        short[] shortArray0 = new short[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), shortArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), ((short[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        short[] shortArray1 = new short[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, ((byte[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigDecimal0);
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigInteger0);
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)(null)));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber("--");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("");
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), ((float)(37L)));
        org.junit.Assert.assertEquals(37.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-1.0F), (-1.0F), (-1.0F));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, 790.0, 0.0);
        org.junit.Assert.assertEquals(790.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min((-953.50622789817), 0.0, (-1676.263458));
        org.junit.Assert.assertEquals((-1676.263458), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(2597.7F, 2597.7F, 1979.4843F);
        org.junit.Assert.assertEquals(1979.4843F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("D9<#wE-:");
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("kz6U;8FQ@%|", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        int[] intArray0 = new int[7];
        intArray0[1] = ((int)(numberUtils0.BYTE_MINUS_ONE));
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("");
        org.junit.Assert.assertEquals(0, int0);
    }
}

