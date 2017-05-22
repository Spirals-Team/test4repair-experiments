package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0~");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("u'<(u!xi].xG^9GuL");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(-98)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(1)), ((short)(0)), ((short)(1)));
        org.junit.Assert.assertEquals(((short)(1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)((byte)(1))), ((long)((byte)(1))), 0L);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(-33)), ((byte)(0)), ((byte)(41)));
        org.junit.Assert.assertEquals(((byte)(-33)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 108, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = ((byte)(108));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(108)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        shortArray0[0] = ((short)(48));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(48)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[1] = 1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -96.223450137;
        double[] doubleArray1 = new double[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        float[] floatArray1 = new float[3];
        floatArray1[0] = ((float)(70));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        float[] floatArray1 = new float[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long[] longArray1 = new long[21];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = -683;
        int[] intArray1 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        short[] shortArray1 = new short[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = ((byte)(27));
        byte[] byteArray1 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[6];
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("u", 873L);
        org.junit.Assert.assertEquals(873L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("9");
        org.junit.Assert.assertEquals(9L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("nt{1~lw8U.G|AVrVcTC", 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("%{_agb'l", 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("6'vid;Y?JXO'", (-183.00152707));
        org.junit.Assert.assertEquals((-183.00152707), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("4");
        org.junit.Assert.assertEquals(4.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("GD8<Z6WeQXREUp[8}s", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 70);
        org.junit.Assert.assertEquals(70, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(1119));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(1119)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = 4795L;
        longArray0[1] = 583L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(583L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = 108;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(108, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = ((float)((short)(783)));
        floatArray0[1] = 1.0F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        float[] floatArray0 = new float[5];
        floatArray0[1] = -1137.1F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-1137.1F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = 3261.80526;
        doubleArray0[2] = 1.0;
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = ((double)(numberUtils0.DOUBLE_MINUS_ONE));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(120));
        byteArray0[1] = ((byte)(37));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(37)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(70)), ((short)(76)), ((short)(70)));
        org.junit.Assert.assertEquals(((short)(70)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)((byte)(61))), 0L, 158L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(933L, 1914L, 1364L);
        org.junit.Assert.assertEquals(933L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 0, 1);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((short)(3872))), 21, ((int)((short)(550))));
        org.junit.Assert.assertEquals(21, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(215.319F, 215.319F, 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-901.5267F), ((float)((short)(-1261))), (-173.4968F));
        org.junit.Assert.assertEquals((-1261.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(2934.80393991015, 3608.778208245063, 2934.80393991015);
        org.junit.Assert.assertEquals(2934.80393991015, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min((-2332.89336), (-1.0), (-2959.432894743));
        org.junit.Assert.assertEquals((-2959.432894743), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        shortArray0[1] = ((short)(1605));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(1605)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(-2147));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-2147)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        longArray0[0] = ((long)(-1));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[1] = 2;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = ((int)((byte)(-65)));
        intArray0[1] = ((int)((byte)(-34)));
        intArray0[2] = ((int)((byte)(-121)));
        intArray0[3] = -46547694;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-34), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = 1305.859F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(1305.859F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        floatArray0[0] = ((float)((short)(-1)));
        floatArray0[1] = ((float)((short)(-1)));
        floatArray0[2] = ((float)((short)(-1)));
        floatArray0[3] = ((float)((short)(-1)));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = ((double)(-1681));
        doubleArray0[1] = ((double)(-1681));
        doubleArray0[2] = ((double)(-1681));
        doubleArray0[3] = ((double)(-1681));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-1681.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = ((byte)(-17));
        byteArray0[1] = ((byte)(-17));
        byteArray0[2] = ((byte)(-17));
        byteArray0[3] = ((byte)(-17));
        byteArray0[4] = ((byte)(-17));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-17)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1)), ((short)(-1)), ((short)(-1)));
        org.junit.Assert.assertEquals(((short)(-1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-5L), ((long)((byte)(-121))), (-5L));
        org.junit.Assert.assertEquals((-5L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-3541), (-3541), (-3541));
        org.junit.Assert.assertEquals((-3541), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, 0.0F, 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(1.0F, 1.0F, 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(((double)((short)(0))), ((double)(0L)), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(457.129233, 271.0, 457.129233);
        org.junit.Assert.assertEquals(457.129233, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong("4");
        org.junit.Assert.assertEquals(4L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble("9");
        org.junit.Assert.assertEquals(9.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger("4");
        org.junit.Assert.assertEquals(4, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("4");
        org.junit.Assert.assertEquals(4, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0F, (-1182.7594F));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(1.0F, 1.0F);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)((byte)(0))), (-1776.36198089));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, 0.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger("81");
        org.junit.Assert.assertEquals(81, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble("-0xA blak stringis not a vaid numbe");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("UqF*HMWvx^6u*");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("MPN%%Qel7`\"V=fE*/sw", ((double)((short)(70))));
        org.junit.Assert.assertEquals(70.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("", 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), ((float)((short)(-980))));
        org.junit.Assert.assertEquals((-980.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), ((long)((short)(-1052))));
        org.junit.Assert.assertEquals((-1052L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("lyFdT-g~0!", 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("u", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("9");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("+P8-as~u%jc(<>[4'.-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0xg");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0xA blank strng is ot a vald number");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0bjS");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(".");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("---0xA=ray cannot 1e empty.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("81");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("lyFdT-g~0!");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1.0F), 0.0F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1141.5302751119), 370.166155);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(1)), ((byte)(1)), ((byte)(118)));
        org.junit.Assert.assertEquals(((byte)(118)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-122)), ((byte)(0)), ((byte)(-122)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-51)), ((byte)(-51)), ((byte)(-51)));
        org.junit.Assert.assertEquals(((byte)(-51)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1774)), ((short)(-1774)), ((short)(239)));
        org.junit.Assert.assertEquals(((short)(239)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1261)), ((short)(0)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 622, 1945);
        org.junit.Assert.assertEquals(1945, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(468, 0, 0);
        org.junit.Assert.assertEquals(468, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-4467L), 0L, 997L);
        org.junit.Assert.assertEquals(997L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)(0)), ((long)((byte)(-17))), ((long)((byte)(-17))));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(68)), ((byte)(68)), ((byte)(10)));
        org.junit.Assert.assertEquals(((byte)(10)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(-13)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(-13)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1)), ((short)(1)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(-136)), ((short)(-1845)), ((short)(65)));
        org.junit.Assert.assertEquals(((short)(-1845)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)(byteArray0[1])), (-382), (-127));
        org.junit.Assert.assertEquals((-382), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(68, 499, ((int)((byte)(-98))));
        org.junit.Assert.assertEquals((-98), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(2416L, 2416L, (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(1L, (-694L), (-694L));
        org.junit.Assert.assertEquals((-694L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[0] = -844.4F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = ((double)(1305.859F));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(1305.8590087890625, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(-53));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        shortArray0[0] = ((short)(-1885));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = -1;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test136() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test137() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[6] = 1182L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(1182L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        floatArray0[0] = 1534.143F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test144() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)((short)(783)));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[6];
        byteArray0[1] = ((byte)(-73));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-73)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        shortArray0[5] = ((short)(-1953));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-1953)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[3] = -2262;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-2262), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        longArray0[2] = -188L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-188L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)((byte)(7)));
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        double[] doubleArray0 = new double[16];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[1] = 1527.658F;
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        float[] floatArray1 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[1] = -775L;
        long[] longArray1 = new long[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        long[] longArray1 = new long[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, ((long[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = ((int)((byte)(39)));
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        int[] intArray0 = new int[10];
        int[] intArray1 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, ((int[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((int[])(null)), intArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test186() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), shortArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test187() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test188() throws java.lang.Throwable {
        short[] shortArray0 = new short[6];
        short[] shortArray1 = new short[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test189() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        byteArray1[0] = ((byte)(65));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test190() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[17];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test191() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, ((byte[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test192() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test193() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test194() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test196() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigDecimal0);
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigInteger0);
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)(null)));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.math.NumberUtils.createNumber("9")));
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(9, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber("--Vx}yK/Mu7+O6Zc");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test216() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), ((double)((byte)(27))));
        org.junit.Assert.assertEquals(27.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test217() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("");
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test218() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test219() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), 108);
        org.junit.Assert.assertEquals(108, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test220() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-4475.0F), (-137.576F), (-597.212F));
        org.junit.Assert.assertEquals((-137.576F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test221() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-439.62988677), (-439.62988677), (-439.62988677));
        org.junit.Assert.assertEquals((-439.62988677), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test222() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(1809.7365579, 0.0, ((double)(0)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test223() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)(0L)), ((float)((byte)(0))), ((float)(108)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test224() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("0xUS");
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test225() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (-382));
        org.junit.Assert.assertEquals((-382), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test226() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(304)), ((short)(304)), ((short)(numberUtils0.BYTE_ONE)));
        org.junit.Assert.assertEquals(((short)(304)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test227() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("eTe\"w");
        org.junit.Assert.assertEquals(0, int0);
    }
}

