package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-1), (-1), (-2556));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(2482L, 0L, 0L);
        org.junit.Assert.assertEquals(2482L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(76)), ((byte)(-66)));
        org.junit.Assert.assertEquals(((byte)(-66)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 2, 4702);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(0L, 2728L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[0] = ((short)(-706));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-706)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[0] = ((long)((byte)(-20)));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-20L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        float[] floatArray1 = new float[8];
        floatArray1[0] = ((float)((byte)(88)));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int[] intArray1 = new int[8];
        intArray1[0] = 1431655765;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int[] intArray1 = new int[13];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[2] = ((short)(-317));
        short[] shortArray1 = new short[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        short[] shortArray1 = new short[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = ((byte)(-65));
        byte[] byteArray1 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byte[] byteArray1 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("u8XOxL`B3'Fa", 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("", 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("", 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("b\"/vcU1dGi", 102);
        org.junit.Assert.assertEquals(102, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("12");
        org.junit.Assert.assertEquals(12, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(4401));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(4401)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(numberUtils0.BYTE_MINUS_ONE));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = ((long)(64));
        longArray0[1] = ((long)(64));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(64L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 664;
        intArray0[1] = 664;
        intArray0[2] = 664;
        intArray0[3] = 664;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(664, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        float[] floatArray0 = new float[1];
        floatArray0[0] = ((float)(numberUtils0.INTEGER_ONE));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 383.902910652;
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(383.902910652, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(19));
        byteArray0[1] = ((byte)(18));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(18)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[2] = ((byte)(-39));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-39)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1)), ((short)(1)), ((short)(1)));
        org.junit.Assert.assertEquals(((short)(1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(53L, 53L, 53L);
        org.junit.Assert.assertEquals(53L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)(438)), ((float)(438)), ((float)(438)));
        org.junit.Assert.assertEquals(438.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-1088.4814F), (-1088.4814F), (-1088.4814F));
        org.junit.Assert.assertEquals((-1088.4814F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(1132.2555096, 305.7420924, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(4081.688915, 4081.688915, 4081.688915);
        org.junit.Assert.assertEquals(4081.688915, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(0)), ((byte)(106)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(102)), ((byte)(102)), ((byte)(102)));
        org.junit.Assert.assertEquals(((byte)(102)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[1] = ((short)(2));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(2)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)((byte)(-66)));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-66)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[2] = ((long)((short)(24)));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(24L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = ((long)((byte)(-2)));
        longArray0[1] = -1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = ((int)((byte)(1)));
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = -1643;
        intArray0[1] = -244;
        intArray0[2] = -1;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = ((float)(-1866L));
        floatArray0[1] = ((float)(-1866L));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-1866.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = ((double)(64));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(64.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double)(-1));
        doubleArray0[1] = ((double)(-2L));
        doubleArray0[2] = ((double)(-18.0F));
        doubleArray0[3] = ((double)((byte)(-18)));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(-18));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-18)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(-2534)), ((short)(-1230)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-349)), ((short)(-349)), ((short)(-349)));
        org.junit.Assert.assertEquals(((short)(-349)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-1L), (-1L), (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, (-1), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, 0.0F, (-1.0F));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(((float)((byte)(119))), 1469.0F, 1.0F);
        org.junit.Assert.assertEquals(1469.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-763.9154731453), 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-416.316009703), (-416.316009703), (-416.316009703));
        org.junit.Assert.assertEquals((-416.316009703), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(119)), ((byte)(116)), ((byte)(119)));
        org.junit.Assert.assertEquals(((byte)(119)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-100)), ((byte)(-100)), ((byte)(-100)));
        org.junit.Assert.assertEquals(((byte)(-100)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(1441.6705F, 1441.6705F);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1983.0F), 0.0F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, 0.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)(numberUtils0.INTEGER_ONE)), ((double)(numberUtils0.DOUBLE_ZERO)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger("55");
        org.junit.Assert.assertEquals(55, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble(" \t\r\n\b");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("q?!cOfE!!N/gn");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), (-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(" is not a valid number.", 2076.0);
        org.junit.Assert.assertEquals(2076.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("", (-2368.1926F));
        org.junit.Assert.assertEquals((-2368.1926F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), (-644L));
        org.junit.Assert.assertEquals((-644L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("A blank string is not a valid number", 4141L);
        org.junit.Assert.assertEquals(4141L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), 5677);
        org.junit.Assert.assertEquals(5677, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("", (-914));
        org.junit.Assert.assertEquals((-914), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-V");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("5");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--h7|Z'Q~KZL");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("Eg2BD d=-v}'_PGReV");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(".o>1D1u");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(" \t\r\n\b");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x19'");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-02x|9'");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xCannot pad a negative amount: ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("0#.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((float)(0L)), ((float)(-1866L)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, 1.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-100)), ((byte)(-100)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-1)), ((byte)(0)), ((byte)(-17)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(1)), ((short)(43)));
        org.junit.Assert.assertEquals(((short)(43)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 101, 101);
        org.junit.Assert.assertEquals(101, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-158), (-158), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-505L), (-603L), 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)((byte)(0))), ((long)((byte)(100))), ((long)((byte)(100))));
        org.junit.Assert.assertEquals(100L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(100)), ((byte)(0)), ((byte)(-59)));
        org.junit.Assert.assertEquals(((byte)(-59)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(68)), ((short)(68)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)((byte)(-125))), ((short)(97)));
        org.junit.Assert.assertEquals(((short)(-125)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((byte)(100))), ((int)((byte)(-59))), ((int)((byte)(-59))));
        org.junit.Assert.assertEquals((-59), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(64, 2310, 48);
        org.junit.Assert.assertEquals(48, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(913L, (-1L), 913L);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(4751L, 4751L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[1] = ((float)(102));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(102.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double)(-2134776643));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[5] = ((byte)(113));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(113)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[0] = ((short)(-1120));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = ((int)((byte)(-1)));
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[0] = ((long)((short)(-244)));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        floatArray0[2] = -1146.0F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-1146.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = ((double)(-1.0F));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = ((byte)(89));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        shortArray0[0] = ((short)((byte)(71)));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        intArray0[3] = -2565;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-2565), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[6] = ((long)((byte)(-56)));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-56L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 379.03370266038;
        double[] doubleArray1 = new double[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        floatArray0[1] = ((float)((byte)(88)));
        float[] floatArray1 = new float[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        float[] floatArray1 = new float[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        float[] floatArray1 = new float[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        long[] longArray0 = new long[3];
        longArray0[0] = -552L;
        long[] longArray1 = new long[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        long[] longArray0 = new long[3];
        long[] longArray1 = new long[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), ((long[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = 1431655765;
        int[] intArray1 = new int[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        int[] intArray1 = new int[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        int[] intArray1 = new int[14];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((int[])(null)), intArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[0] = ((short)(24));
        short[] shortArray1 = new short[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        short[] shortArray1 = new short[16];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        short[] shortArray1 = new short[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = ((byte)(88));
        byte[] byteArray1 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byte[] byteArray1 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byte[] byteArray1 = new byte[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigDecimal0);
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigInteger0);
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger("0");
        org.junit.Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)(null)));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("55")));
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(55, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber("-- \t\r\n\b");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("-0x");
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), (-437.89334F));
        org.junit.Assert.assertEquals((-437.89334F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-962.6024F), (-962.6024F), (-1444.4805F));
        org.junit.Assert.assertEquals((-962.6024F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(799.54683529079, 1.0, (-1.0));
        org.junit.Assert.assertEquals(799.54683529079, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)(3135L)), ((double)(-11L)), ((double)(-1)));
        org.junit.Assert.assertEquals((-11.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test215() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(0.0F, 312.445F, 312.445F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("");
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(numberUtils0.SHORT_ZERO)), ((short)(46)), ((short)(68)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }
}

