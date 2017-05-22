package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(0)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(-3633)), ((short)(-3633)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(0)), ((byte)(85)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(0)), ((byte)(70)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(0)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((byte)(0))), ((int)((byte)(0))), ((int)((byte)(0))));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[1] = -2056.779F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        floatArray0[2] = ((float)((short)(2077)));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        float[] floatArray0 = new float[18];
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        long[] longArray1 = new long[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int[] intArray1 = new int[4];
        intArray1[0] = 557;
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        int[] intArray1 = new int[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        short[] shortArray1 = new short[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[6];
        byte[] byteArray1 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("FbC", 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("8");
        org.junit.Assert.assertEquals(8L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("N23", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("(>'~WJ3&>C|[>", 2221);
        org.junit.Assert.assertEquals(2221, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("-0x", 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("8");
        org.junit.Assert.assertEquals(8.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("Exk", (-2087.729195236));
        org.junit.Assert.assertEquals((-2087.729195236), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("!b0GMB8BP*m)/5", (-1479));
        org.junit.Assert.assertEquals((-1479), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[0] = ((short)((byte)(18)));
        shortArray0[1] = ((short)((byte)(18)));
        shortArray0[2] = ((short)((byte)(57)));
        shortArray0[3] = ((short)((byte)(18)));
        shortArray0[4] = ((short)((byte)(96)));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(18)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[3] = ((short)(-252));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-252)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        long[] longArray0 = new long[1];
        longArray0[0] = 1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = ((int)((short)(1927)));
        intArray0[1] = ((int)((short)(1927)));
        intArray0[2] = ((int)((short)(97)));
        intArray0[3] = ((int)((short)(1927)));
        intArray0[4] = ((int)((short)(1927)));
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(97, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = -666;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-666), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = ((float)((short)(45)));
        floatArray0[1] = 1.0F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        float[] floatArray0 = new float[7];
        floatArray0[6] = -995.36F;
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-995.36F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = ((double)(2207L));
        doubleArray0[1] = ((double)(996L));
        doubleArray0[2] = ((double)(100L));
        doubleArray0[3] = ((double)(2207L));
        doubleArray0[4] = ((double)(2088L));
        doubleArray0[5] = ((double)(650L));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(100.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(1));
        byteArray0[1] = ((byte)(1));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        byteArray0[0] = ((byte)(-78));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-78)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(882L, ((long)((byte)(43))), 500L);
        org.junit.Assert.assertEquals(43L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((short)(0))), 1, ((int)((short)(0))));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min((-2273), 100, 100);
        org.junit.Assert.assertEquals((-2273), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(1.0F, 0.0F, 1.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(1159.94F, 1159.94F, 1159.94F);
        org.junit.Assert.assertEquals(1159.94F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)(0L)), ((double)(0L)), 1.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)((byte)(97))), 2556.621289022634, ((double)((byte)(97))));
        org.junit.Assert.assertEquals(97.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        shortArray0[0] = ((short)(97));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(97)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        shortArray0[0] = ((short)(-700));
        shortArray0[1] = ((short)(-31));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-31)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        longArray0[0] = ((long)(-1));
        longArray0[1] = ((long)(-1));
        longArray0[2] = ((long)(-1));
        longArray0[3] = ((long)(-1));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = -1924;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1924), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = 1.0F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        java.lang.Short short0 = new java.lang.Short(((short)(-2808)));
        float[] floatArray0 = new float[3];
        floatArray0[0] = ((float)(short0));
        floatArray0[1] = ((float)((short)(-2808)));
        floatArray0[2] = ((float)((short)(-2808)));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-2808.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(-10L));
        doubleArray0[1] = ((double)(-2069L));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-10.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(1));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(-7));
        byteArray0[1] = ((byte)(-3));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-3)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-4)), ((short)(-4)), ((short)(-912)));
        org.junit.Assert.assertEquals(((short)(-4)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-1821L), (-1821L), (-1821L));
        org.junit.Assert.assertEquals((-1821L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-657), (-981), (-657));
        org.junit.Assert.assertEquals((-657), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(1.0F, 1.0F, 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(((float)(-3671L)), (-1.0F), ((float)(-1L)));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max((-1083.40971), 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(((double)((short)(-1549))), ((double)((short)(-1549))), ((double)((short)(-1422))));
        org.junit.Assert.assertEquals((-1422.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(0)), ((byte)(43)));
        org.junit.Assert.assertEquals(((byte)(43)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-65)), ((byte)(-7)), ((byte)(-4)));
        org.junit.Assert.assertEquals(((byte)(-4)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble("8");
        org.junit.Assert.assertEquals(8.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)((short)(127))), ((double)(-2808.0F)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(0.0, 0.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)((short)(-427))), 0.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong("-0");
        org.junit.Assert.assertEquals(0L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger("-0");
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble("`zTiRt9xV");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), ((double)(46)));
        org.junit.Assert.assertEquals(46.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), ((float)(-1L)));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("\'Z{Yc$PIQWdixRn/\"", (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), (-2096));
        org.junit.Assert.assertEquals((-2096), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("L");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--.e0");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("+tT60");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("Et3");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("2,(?tI]^ 6");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(".e0");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x1 5g}KLjZh");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("+");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("0xb_");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xCiA mHbwZHyHqkg");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("0xCiA mHbwZHyHqkg");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(646.8204F, 646.8204F);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1971.66F), (-1.0F));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1035.2212F), (-1177.61F));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double)(882L));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-63)), ((byte)(0)), ((byte)(-63)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-18)), ((byte)(-92)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-2808)), ((short)(-2808)), ((short)(127)));
        org.junit.Assert.assertEquals(((short)(127)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-2939)), ((short)(0)), ((short)(-2939)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(3, ((int)((short)(571))), ((int)((short)(0))));
        org.junit.Assert.assertEquals(571, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-4621), (-4621), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-3431L), ((long)(0)), ((long)(183)));
        org.junit.Assert.assertEquals(183L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)(0)), (-2457L), (-1L));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(9)), ((byte)(9)), ((byte)(-1)));
        org.junit.Assert.assertEquals(((byte)(-1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(43)), ((byte)(0)), ((byte)(0)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(12)), ((byte)(12)), ((byte)(12)));
        org.junit.Assert.assertEquals(((byte)(12)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(-1461)), ((short)(-2939)));
        org.junit.Assert.assertEquals(((short)(-2939)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(97)), ((short)(4)), ((short)(1927)));
        org.junit.Assert.assertEquals(((short)(4)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(4909)), ((short)(numberUtils0.BYTE_ONE)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(3011, 48, ((int)((byte)(43))));
        org.junit.Assert.assertEquals(43, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)((byte)(0))), ((long)((byte)(0))), (-1090L));
        org.junit.Assert.assertEquals((-1090L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(((long)(-4621)), ((long)(0)), 0L);
        org.junit.Assert.assertEquals((-4621L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        floatArray0[0] = -68.17195F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = ((double)(3));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(3.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = ((byte)(-7));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        shortArray0[0] = ((short)((byte)(-7)));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 557;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(557, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test133() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        longArray0[1] = ((long)(48));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(48L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = ((double)((short)(-2808)));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-2808.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test141() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[0] = ((byte)(43));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        short[] shortArray0 = new short[5];
        shortArray0[0] = ((short)(2466));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        int[] intArray0 = new int[5];
        intArray0[0] = ((int)((short)(1927)));
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        longArray0[1] = -2069L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-2069L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        long[] longArray0 = new long[6];
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = ((double)((byte)(43)));
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((double[])(null)), doubleArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
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
        float[] floatArray0 = new float[7];
        float[] floatArray1 = new float[20];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((float[])(null)), floatArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        long[] longArray0 = new long[5];
        long[] longArray1 = new long[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = 43;
        int[] intArray1 = new int[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        int[] intArray1 = new int[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((int[])(null)), intArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int[] intArray1 = new int[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, ((short[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), ((short[])(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        short[] shortArray1 = new short[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test177() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byte[] byteArray1 = new byte[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
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
    public void test183() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test184() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test185() throws java.lang.Throwable {
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
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(".e0");
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(" is not a valid number.", 1.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), 1776L);
        org.junit.Assert.assertEquals(1776L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, 0.0F, 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("[n{gCTOJ");
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min((-2488.1939540281073), 1499.57, 1499.57);
        org.junit.Assert.assertEquals((-2488.1939540281073), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-1.0F), (-1413.0F), ((float)((byte)(43))));
        org.junit.Assert.assertEquals((-1413.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 46);
        org.junit.Assert.assertEquals(46, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        double double0 = org.apache.commons.lang.math.NumberUtils.max(((double)(-1.0F)), ((double)(numberUtils0.DOUBLE_ONE)), 1.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test212() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("RA");
        org.junit.Assert.assertEquals(0, int0);
    }
}

