package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(26)), ((byte)(0)), ((byte)(26)));
        org.junit.Assert.assertEquals(((byte)(26)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-758L), (-3094L), (-3094L));
        org.junit.Assert.assertEquals((-758L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(58)), ((byte)(59)), ((byte)(59)));
        org.junit.Assert.assertEquals(((byte)(58)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(2334)), ((short)(-1961)), ((short)(2334)));
        org.junit.Assert.assertEquals(((short)(-1961)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[4] = ((short)(-1));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = ((double)(numberUtils0.FLOAT_MINUS_ONE));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[2] = ((byte)(112));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        float[] floatArray1 = new float[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        long[] longArray0 = new long[9];
        long[] longArray1 = new long[9];
        longArray1[0] = ((long)(3797));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        int[] intArray1 = new int[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byte[] byteArray1 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray1, byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("-0x", (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("-0x\'|0Ow\"Mhu3mgQ#!");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("", 463);
        org.junit.Assert.assertEquals(463, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("iz>F_ocJ/+OCXb", 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("XGQT>Bp1MmD/", (-1.0F));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(";+ACQSfM3", 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("Bp#Q@GRd]c$/n", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)), (-2418));
        org.junit.Assert.assertEquals((-2418), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(100));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(100)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[3] = ((short)(-782));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-782)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[0] = ((long)(1));
        longArray0[1] = ((long)(1));
        longArray0[2] = ((long)(1));
        longArray0[3] = ((long)(1));
        longArray0[4] = ((long)(1));
        longArray0[5] = ((long)(1));
        longArray0[6] = ((long)(1));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        longArray0[1] = ((long)((short)(-44)));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-44L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 1170;
        intArray0[1] = 1575;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(1170, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = 186.93703F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(186.93703F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = ((double)(2096));
        doubleArray0[1] = ((double)(2096));
        doubleArray0[2] = ((double)(2096));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(2096.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(1));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[3] = ((byte)(-49));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-49)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(4759)), ((short)((byte)(106))), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1967)), ((short)(1967)), ((short)(1967)));
        org.junit.Assert.assertEquals(((short)(1967)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(1L, ((long)(361)), ((long)(127)));
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)(97)), ((float)(97)), ((float)(97)));
        org.junit.Assert.assertEquals(97.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-3021.7F), (-274.128F), (-1.0F));
        org.junit.Assert.assertEquals((-3021.7F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)(0.0F)), ((double)(1.0F)), ((double)(1.0F)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(288.7537, 288.7537, 288.7537);
        org.junit.Assert.assertEquals(288.7537, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(6)), ((byte)(6)), ((byte)(6)));
        org.junit.Assert.assertEquals(((byte)(6)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short[] shortArray0 = new short[6];
        shortArray0[5] = ((short)(numberUtils0.BYTE_ONE));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(-4161));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-4161)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        longArray0[2] = ((long)((byte)(104)));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(104L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        long[] longArray0 = new long[3];
        longArray0[0] = ((long)((byte)(-44)));
        longArray0[1] = ((long)((byte)(-44)));
        longArray0[2] = ((long)((byte)(-44)));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-44L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        intArray0[0] = -1;
        intArray0[1] = -1;
        intArray0[2] = -1;
        intArray0[3] = -1;
        intArray0[4] = -1;
        intArray0[5] = -1;
        intArray0[6] = -1;
        intArray0[7] = -1;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[0] = ((float)(-238L));
        floatArray0[1] = ((float)(-238L));
        floatArray0[2] = ((float)(-238L));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-238.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)(numberUtils0.SHORT_MINUS_ONE));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(-116));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-116)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1024)), ((short)(-1024)), ((short)(-1024)));
        org.junit.Assert.assertEquals(((short)(-1024)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 0, (-936));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-3021.7F), (-3021.7F), 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(1971.0F, 0.0F, 2274.8118F);
        org.junit.Assert.assertEquals(2274.8118F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, (-1.0), ((double)(0.0F)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-49.949966003), (-49.949966003), (-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-1)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("-0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger("2");
        org.junit.Assert.assertEquals(2, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble("7");
        org.junit.Assert.assertEquals(7.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble("org.apache.commons.lang.math.NumberUtils");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("\n");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), ((double)((byte)(-71))));
        org.junit.Assert.assertEquals((-71.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("fJa", ((double)(1097.056F)));
        org.junit.Assert.assertEquals(1097.0560302734375, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("Bp#Q@GRd]c$/n", 1L);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), (-1135));
        org.junit.Assert.assertEquals((-1135), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("", ((int)((short)(0))));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("d");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("\n");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--Array cannot be empty.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x7'o");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0xF*k");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0e-GSYEq03MI:{fN'fc");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("BB(hx/vTgS*");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xCannot pad a negative amount: ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("2");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("0x6\"5F(9]C9~*]N<6lUn");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(476.67456F, 476.67456F);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-4186.8213F), 0.0F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1.0F), (-1405.997F));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, (-1736.182));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1411.8429), 569.53144222929);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, 0.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(0)), ((byte)(81)));
        org.junit.Assert.assertEquals(((byte)(81)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-9)), ((byte)(1)), ((byte)(-9)));
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-39)), ((byte)(-39)), ((byte)(-39)));
        org.junit.Assert.assertEquals(((byte)(-39)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1188)), ((short)(-551)), ((short)(1214)));
        org.junit.Assert.assertEquals(((short)(1214)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(2651)), ((short)(2785)), ((short)(-850)));
        org.junit.Assert.assertEquals(((short)(2785)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(numberUtils0.BYTE_ZERO)), ((short)(numberUtils0.SHORT_MINUS_ONE)), ((short)(numberUtils0.BYTE_ZERO)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(((int)((short)(536))), 100, 808);
        org.junit.Assert.assertEquals(808, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(76, 3797, 137);
        org.junit.Assert.assertEquals(3797, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-1), (-1), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-1L), 2465L, 0L);
        org.junit.Assert.assertEquals(2465L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-2401L), (-2401L), (-238L));
        org.junit.Assert.assertEquals((-238L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(100)), ((byte)(100)), ((byte)(-109)));
        org.junit.Assert.assertEquals(((byte)(-109)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(99)), ((byte)(-94)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(-94)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1)), ((short)(4767)), ((short)(-2250)));
        org.junit.Assert.assertEquals(((short)(-2250)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(3708, 3708, 1906);
        org.junit.Assert.assertEquals(1906, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((byte)(106))), (-1), ((int)((byte)(106))));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(361, 2011, 2011);
        org.junit.Assert.assertEquals(361, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)(1841)), ((long)(361)), ((long)(0)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min((-2512L), (-2512L), (-1679L));
        org.junit.Assert.assertEquals((-2512L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[4] = 476.67456F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(476.67456F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 1.0;
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[1] = ((byte)(31));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(31)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test128() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        int[] intArray0 = new int[9];
        intArray0[1] = ((int)(numberUtils0.INTEGER_ONE));
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test131() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[0] = -2512L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        floatArray0[1] = -186.7F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-186.7F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test136() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[0] = ((short)(3050));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        intArray0[1] = ((int)((byte)(-51)));
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-51), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        longArray0[0] = 1218L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        float[] floatArray1 = new float[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        float[] floatArray1 = new float[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        long[] longArray0 = new long[9];
        longArray0[0] = ((long)((short)(1214)));
        long[] longArray1 = new long[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        long[] longArray0 = new long[9];
        long[] longArray1 = new long[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), ((long[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, ((int[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((int[])(null)), ((int[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        int[] intArray1 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        shortArray0[0] = ((short)(-2489));
        short[] shortArray1 = new short[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, ((short[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), ((short[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        short[] shortArray1 = new short[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = ((byte)(31));
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byte[] byteArray1 = new byte[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, ((byte[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigDecimal0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigInteger0);
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)(null)));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createNumber("l");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
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
    public void test200() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("2")));
        org.junit.Assert.assertEquals(2, ((int)(integer0)));
        org.junit.Assert.assertNotNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-186.7F), (-186.7F), (-186.7F));
        org.junit.Assert.assertEquals((-186.7F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("7");
        org.junit.Assert.assertEquals(7L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, (-1971.4307767369478), ((double)(69)));
        org.junit.Assert.assertEquals(69.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)((byte)(-39))), ((double)((byte)(-39))), 0.0);
        org.junit.Assert.assertEquals((-39.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)(0)), ((float)(0)), ((float)(0)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("2");
        org.junit.Assert.assertEquals(2.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("iz>F_ocJ/+OCXb", 1);
        org.junit.Assert.assertEquals(1, int0);
    }
}

