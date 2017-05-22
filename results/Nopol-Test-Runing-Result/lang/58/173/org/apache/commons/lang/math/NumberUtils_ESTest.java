package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(1)), ((byte)(-44)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)(1793)), 0L, 0L);
        org.junit.Assert.assertEquals(1793L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(1291)), ((short)(-1)));
        org.junit.Assert.assertEquals(((short)(-1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        float[] floatArray1 = new float[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        long[] longArray0 = new long[0];
        long[] longArray1 = new long[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[1] = 10;
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        int[] intArray1 = new int[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        short[] shortArray1 = new short[6];
        shortArray1[0] = ((short)(21));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        short[] shortArray1 = new short[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("", (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("6");
        org.junit.Assert.assertEquals(6L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("B6p_J '", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("6");
        org.junit.Assert.assertEquals(6, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("org.apache.commons.lang.math.NumberUtils", 268.89F);
        org.junit.Assert.assertEquals(268.89F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(":N|*s;@FK=D}MR", (-2871.7F));
        org.junit.Assert.assertEquals((-2871.7F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("2");
        org.junit.Assert.assertEquals(2.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(":", 1.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (-1092));
        org.junit.Assert.assertEquals((-1092), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(2));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(2)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        shortArray0[0] = ((short)((byte)(-28)));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-28)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        longArray0[0] = ((long)(2266));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(2266L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        longArray0[2] = -1062L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-1062L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 2136;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(2136, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = 268.89F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(268.89F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        float[] floatArray0 = new float[5];
        floatArray0[0] = ((float)((byte)(-52)));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-52.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)((short)(65)));
        doubleArray0[1] = ((double)(1));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(2));
        byteArray0[1] = ((byte)(5));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(2)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1121)), ((short)(1121)), ((short)(1121)));
        org.junit.Assert.assertEquals(((short)(1121)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(2277L, 2277L, 2277L);
        org.junit.Assert.assertEquals(2277L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 1821, 1821);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((byte)(57))), ((int)((byte)(48))), ((int)((byte)(62))));
        org.junit.Assert.assertEquals(48, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)((short)(65))), ((float)(0)), 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-226.599F), ((float)(0)), 761.3678F);
        org.junit.Assert.assertEquals((-226.599F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(1145.646, 1145.646, 1.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(2)), ((byte)(43)), ((byte)(68)));
        org.junit.Assert.assertEquals(((byte)(2)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(-161));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-161)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[0] = -4795L;
        longArray0[1] = -2593L;
        longArray0[2] = -744L;
        longArray0[3] = -1701L;
        longArray0[4] = -1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = -1298;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1298), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        floatArray0[0] = ((float)(-1));
        floatArray0[1] = ((float)(-1));
        floatArray0[2] = ((float)(-1));
        floatArray0[3] = -1.0F;
        floatArray0[4] = ((float)(-1));
        floatArray0[5] = ((float)(-1));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)(2136));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(2136.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(-1.0F));
        doubleArray0[1] = ((double)((byte)(-104)));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = ((byte)(75));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(75)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = ((byte)(-88));
        byteArray0[1] = ((byte)(-88));
        byteArray0[2] = ((byte)(-88));
        byteArray0[3] = ((byte)(-78));
        byteArray0[4] = ((byte)(-88));
        byteArray0[5] = ((byte)(-88));
        byteArray0[6] = ((byte)(-88));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-78)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(-2207)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-2721), 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, 0.0F, (-1417.41F));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-1.0F), (-287.55F), (-1.0F));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, 0.0, 383.7696473);
        org.junit.Assert.assertEquals(383.7696473, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-1.0), (-561.93624), (-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(111)), ((byte)(111)), ((byte)(111)));
        org.junit.Assert.assertEquals(((byte)(111)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("2")));
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(2, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("-0xA")));
        org.junit.Assert.assertEquals((-10), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits(".}O[Kpvq)to7,(id}|");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble("8");
        org.junit.Assert.assertEquals(8.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat("8");
        org.junit.Assert.assertEquals(8.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), (-1329.7241563785783));
        org.junit.Assert.assertEquals((-1329.7241563785783), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("--", ((float)((byte)(0))));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), ((long)(0)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("8", (-830));
        org.junit.Assert.assertEquals(8, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(".*;]$i\\NAe*a6~P");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("L");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(" ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--.\"ez-~_pmNTm");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("EI");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("3+gC");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("2");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xqO9d");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("m6cSA|4<& .");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("2");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(1311.6168F, ((float)(numberUtils0.SHORT_ONE)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-4374.8945F), 439.3898F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1.0F), (-1.0F));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(1433.0, 0.0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)(-1.0F)), 1691.16409816857);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)(0)), ((double)(0)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-44)), ((byte)(-1)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-1)), ((byte)(-1)), ((byte)(-1)));
        org.junit.Assert.assertEquals(((byte)(-1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(0)), ((short)(21)));
        org.junit.Assert.assertEquals(((short)(21)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-3065)), ((short)(-2010)), ((short)(-2896)));
        org.junit.Assert.assertEquals(((short)(-2010)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 0, 206);
        org.junit.Assert.assertEquals(206, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-1092), (-1), (-1092));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(2543, (-1), (-1));
        org.junit.Assert.assertEquals(2543, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)(-159)), 0L, 1601L);
        org.junit.Assert.assertEquals(1601L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)((short)(-4795))), ((long)((short)(-4795))), (-2017L));
        org.junit.Assert.assertEquals((-2017L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(101)), ((byte)(-23)), ((byte)(-52)));
        org.junit.Assert.assertEquals(((byte)(-52)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1)), ((short)(1)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(-4795)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(-4795)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min((-2662), (-2662), (-3131));
        org.junit.Assert.assertEquals((-3131), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, (-2558), (-2558));
        org.junit.Assert.assertEquals((-2558), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(1367L, 1367L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)(423)), ((long)((byte)(-37))), 1353L);
        org.junit.Assert.assertEquals((-37L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min((-2888L), 740L, (-1L));
        org.junit.Assert.assertEquals((-2888L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        float[] floatArray0 = new float[5];
        floatArray0[2] = ((float)(1));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        float[] floatArray0 = new float[5];
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -1626.789524;
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byteArray0[0] = ((byte)(-88));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        shortArray0[2] = ((short)(120));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(120)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 503;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(503, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test131() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        longArray0[3] = 3759L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(3759L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        floatArray0[0] = 1.0F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = ((double)(numberUtils0.INTEGER_MINUS_ONE));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        shortArray0[0] = ((short)((byte)(1)));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        intArray0[3] = ((int)((byte)(-68)));
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-68), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        longArray0[0] = 1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[14];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        long[] longArray1 = new long[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        long[] longArray0 = new long[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        long[] longArray0 = new long[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, ((long[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[2] = ((int)((short)(-4795)));
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        int[] intArray0 = new int[16];
        int[] intArray1 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, ((int[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        shortArray0[0] = ((short)(21));
        short[] shortArray1 = new short[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        short[] shortArray1 = new short[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        short[] shortArray0 = new short[0];
        short[] shortArray1 = new short[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), shortArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, ((short[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        byteArray1[0] = ((byte)(-28));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[15];
        byte[] byteArray1 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), ((byte[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
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
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger("-0");
        org.junit.Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong("4");
        org.junit.Assert.assertEquals(4L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test189() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)(null)));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test193() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("-0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber("---0x");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("-0xMinimum abbreviation width with offset is 7");
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("", 1375L);
        org.junit.Assert.assertEquals(1375L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(((float)(1501L)), ((float)(1501L)), 0.0F);
        org.junit.Assert.assertEquals(1501.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, 0.0, (-1853.713393796));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min((-1049.4484931051197), (-1049.4484931051197), 1.0);
        org.junit.Assert.assertEquals((-1049.4484931051197), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(2314.6477F, 2314.6477F, 2314.6477F);
        org.junit.Assert.assertEquals(2314.6477F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(".*;]$i\\NAe*a6~P");
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 899);
        org.junit.Assert.assertEquals(899, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        byte[] byteArray0 = new byte[5];
        byteArray0[3] = ((byte)(numberUtils0.BYTE_MINUS_ONE));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }
}

