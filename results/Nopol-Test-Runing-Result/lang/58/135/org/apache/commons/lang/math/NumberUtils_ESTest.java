package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(" is not a valid number.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(-19)), ((byte)(-19)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(932, 0, 932);
        org.junit.Assert.assertEquals(932, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(0L, (-1L), (-2130L));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min((-170), 0, (-170));
        org.junit.Assert.assertEquals((-170), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[4] = -348L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[1] = ((byte)(76));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[1] = ((float)(-1));
        float[] floatArray1 = new float[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        float[] floatArray1 = new float[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        long[] longArray1 = new long[2];
        longArray0[0] = 1900L;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long[] longArray1 = new long[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        int[] intArray1 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        short[] shortArray1 = new short[8];
        shortArray1[4] = ((short)(1001));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[7];
        byte[] byteArray1 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("9", (-271L));
        org.junit.Assert.assertEquals(9L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("Y0oI(E)", (-2280L));
        org.junit.Assert.assertEquals((-2280L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("8");
        org.junit.Assert.assertEquals(8L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("0x", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("?/PX3DN@(:3e", ((float)(0L)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("8", (-689.6542F));
        org.junit.Assert.assertEquals(8.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("?/PX3DN@(:3e", 6129.70684);
        org.junit.Assert.assertEquals(6129.70684, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("4F");
        org.junit.Assert.assertEquals(4.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("3*6\"[eO", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        shortArray0[0] = ((short)(1850));
        shortArray0[1] = ((short)(8192));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(1850)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        shortArray0[1] = ((short)(-2254));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-2254)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        longArray0[0] = 2L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(2L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[1] = -458L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-458L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 171;
        intArray0[1] = 100;
        intArray0[2] = 76;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(76, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = -1;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = ((float)(1));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 3916.9775796;
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(3916.9775796, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(19));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(19)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(-101));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-101)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)((byte)(16))), ((short)((byte)(16))), ((short)((byte)(16))));
        org.junit.Assert.assertEquals(((short)(16)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)((short)(68))), 3144L, ((long)((short)(68))));
        org.junit.Assert.assertEquals(68L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(0.0F, 0.0F, 846.2F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-1.0F), (-1.0F), (-1.0F));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)(777L)), ((double)(777L)), ((double)(777L)));
        org.junit.Assert.assertEquals(777.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(-2668));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-2668)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        longArray0[0] = 1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        longArray0[0] = ((long)(-1));
        longArray0[1] = ((long)(-1));
        longArray0[2] = ((long)(-1));
        longArray0[3] = ((long)(-1));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        intArray0[2] = 45;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(45, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = -1;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = 1213.8865F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(1213.8865F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = -2571.4F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-2571.4F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -772.8251978358096;
        doubleArray0[1] = -772.8251978358096;
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-772.8251978358096), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[2] = ((byte)(13));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(13)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(-1));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(-3811)), ((short)(-1920)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-1958L), (-1130L), (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-2559), ((int)((byte)(-58))), ((int)((byte)(-117))));
        org.junit.Assert.assertEquals((-58), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, (-2251.0F), 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max((-2992.31F), (-682.272F), (-682.272F));
        org.junit.Assert.assertEquals((-682.272F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, 0.0, (-2512.8232));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(1532.0, 1532.0, 1532.0);
        org.junit.Assert.assertEquals(1532.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-44)), ((byte)(-44)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-101)), ((byte)(-101)), ((byte)(-101)));
        org.junit.Assert.assertEquals(((byte)(-101)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong("5");
        org.junit.Assert.assertEquals(5L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger("9");
        org.junit.Assert.assertEquals(9, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble("4F");
        org.junit.Assert.assertEquals(4.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger("8");
        org.junit.Assert.assertEquals(8, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(2096.0F, 0.0F);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1884.0347F), (-1884.0347F));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("0x", (-1.0F));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), (-144.01F));
        org.junit.Assert.assertEquals((-144.01F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("", 100);
        org.junit.Assert.assertEquals(100, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("A");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("4+PQA9D*xA$8");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x0;");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x4F");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0P@A!v");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xbnkCA)mw3;W<P.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("EQ+k-p");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--%qQ)&");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("7U\"?Oq#D");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1.0F), 1.0F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)((short)(0))), (-568.985648962));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, 1916.479598102442);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, ((double)(0)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-101)), ((byte)(19)), ((byte)(19)));
        org.junit.Assert.assertEquals(((byte)(19)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(850)), ((short)(928)));
        org.junit.Assert.assertEquals(((short)(928)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(159)), ((short)(1268)), ((short)(1268)));
        org.junit.Assert.assertEquals(((short)(1268)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-2348)), ((short)(-2348)), ((short)(-2348)));
        org.junit.Assert.assertEquals(((short)(-2348)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-1512), (-1512), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)((byte)(-41))), ((long)(0)), ((long)((byte)(43))));
        org.junit.Assert.assertEquals(43L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(25)), ((byte)(25)), ((byte)(1)));
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(numberUtils0.BYTE_MINUS_ONE)), ((byte)(-111)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(-111)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(-41)), ((byte)(43)), ((byte)(-41)));
        org.junit.Assert.assertEquals(((byte)(-41)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)((byte)(45))), ((short)((byte)(45))), ((short)((byte)(0))));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(563)), ((short)(0)), ((short)(1)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)((byte)(-101))), ((short)(0)), ((short)((byte)(-101))));
        org.junit.Assert.assertEquals(((short)(-101)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(0, 0, (-1701));
        org.junit.Assert.assertEquals((-1701), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(2146428282, 0, 2146428282);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(102, 2566, 1411);
        org.junit.Assert.assertEquals(102, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(1L, 1L, (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(1L, (-2228L), 1L);
        org.junit.Assert.assertEquals((-2228L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)((byte)(0))), ((long)((byte)(0))), 3085L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        floatArray0[0] = -1205.14F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = 3745.1478;
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(3745.1478, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byteArray0[0] = ((byte)(-68));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test130() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        shortArray0[1] = ((short)(2));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(2)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = ((int)((short)(-2348)));
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        floatArray0[2] = -2992.31F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-2992.31F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test143() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = ((double)(-1));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test146() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test147() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = ((byte)(66));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        shortArray0[0] = ((short)(43));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 171;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        longArray0[0] = 422L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((double[])(null)), ((double[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = ((float)(8192));
        float[] floatArray1 = new float[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float[] floatArray1 = new float[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        float[] floatArray0 = new float[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((float[])(null)), ((float[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        float[] floatArray0 = new float[4];
        float[] floatArray1 = new float[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = -3316L;
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        long[] longArray1 = new long[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        long[] longArray0 = new long[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, ((long[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        int[] intArray1 = new int[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, ((int[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        shortArray0[4] = ((short)(1001));
        short[] shortArray1 = new short[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        short[] shortArray0 = new short[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        short[] shortArray0 = new short[8];
        short[] shortArray1 = new short[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = ((byte)(102));
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[0];
        byte[] byteArray1 = new byte[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
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
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
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
    public void test192() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createNumber("l");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test193() throws java.lang.Throwable {
        java.lang.Float float0 = ((java.lang.Float)(org.apache.commons.lang.math.NumberUtils.createNumber("4F")));
        org.junit.Assert.assertEquals(4.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber("--");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        java.lang.Float float0 = ((java.lang.Float)(org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)(null)))));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", ((double)(-1884.0347F)));
        org.junit.Assert.assertEquals((-1884.03466796875), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, 0.0F, 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-1.0), (-1.0), (-1.0));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min((-1.0), (-3836.380792), 0.0);
        org.junit.Assert.assertEquals((-3836.380792), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(1.0F, 1.0F, 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("4F");
        org.junit.Assert.assertEquals(4.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test213() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test214() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("^#_A9%f", 2566);
        org.junit.Assert.assertEquals(2566, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test215() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        long[] longArray0 = new long[5];
        longArray0[0] = ((long)(numberUtils0.INTEGER_MINUS_ONE));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }
}

