package org.apache.commons.lang.math;


public class NumberUtils_ESTest extends org.apache.commons.lang.math.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(")47UjWApD M0");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(1085)), ((short)(879)), ((short)(879)));
        org.junit.Assert.assertEquals(((short)(1085)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(3134L, ((long)((short)(-9))), ((long)((short)(-9))));
        org.junit.Assert.assertEquals(3134L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(-120)), ((byte)(65)), ((byte)(-120)));
        org.junit.Assert.assertEquals(((byte)(-120)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min((-1), ((int)((short)(1085))), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min((-1492L), 40L, 1L);
        org.junit.Assert.assertEquals((-1492L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1.0;
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = ((double)((short)(436)));
        double[] doubleArray1 = new double[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long[] longArray1 = new long[7];
        longArray1[1] = ((long)(186));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        long[] longArray1 = new long[0];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        int[] intArray1 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        short[] shortArray1 = new short[3];
        shortArray1[0] = ((short)(2687));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        short[] shortArray1 = new short[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byte[] byteArray1 = new byte[9];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("", ((long)(-593)));
        org.junit.Assert.assertEquals((-593L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("8");
        org.junit.Assert.assertEquals(8L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("", (-2575));
        org.junit.Assert.assertEquals((-2575), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("yUpAmMh&_P", 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("Minimum abbreviation width is 4");
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", ((double)(-550L)));
        org.junit.Assert.assertEquals((-550.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("L[2)Q2", 65);
        org.junit.Assert.assertEquals(65, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        shortArray0[0] = ((short)(10049));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(10049)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = 29L;
        longArray0[1] = 29L;
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(29L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        longArray0[6] = ((long)((byte)(-1)));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 65;
        intArray0[1] = 65;
        intArray0[2] = 1;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = -458;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals((-458), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        float[] floatArray0 = new float[8];
        floatArray0[0] = ((float)(3));
        floatArray0[1] = ((float)(3));
        floatArray0[2] = ((float)(3));
        floatArray0[3] = ((float)(3));
        floatArray0[4] = ((float)(3));
        floatArray0[5] = ((float)(3));
        floatArray0[6] = ((float)(3));
        floatArray0[7] = ((float)(3));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(3.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[1] = ((float)(-4565434767655029558L));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals((-4.56543479E18F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(1));
        doubleArray0[1] = ((double)(1));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[3];
        byteArray0[0] = ((byte)(26));
        byteArray0[1] = ((byte)(109));
        byteArray0[2] = ((byte)(8));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(8)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(3637)), ((short)(3637)), ((short)(3637)));
        org.junit.Assert.assertEquals(((short)(3637)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(700L, 40L, 1L);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(2748, 2748, 621);
        org.junit.Assert.assertEquals(621, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(0.0F, 2667.0F, 0.0F);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min((-1.0F), (-1.0F), ((float)(65)));
        org.junit.Assert.assertEquals((-1.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(0.0, 2527.7541783903594, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(((double)(579L)), 1385.92051396, ((double)(579L)));
        org.junit.Assert.assertEquals(579.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(110)), ((byte)(0)), ((byte)(110)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        shortArray0[0] = ((short)(-2400));
        shortArray0[1] = ((short)(-4819));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(-2400)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        longArray0[0] = ((long)((byte)(1)));
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        long[] longArray0 = new long[2];
        longArray0[0] = -409L;
        longArray0[1] = -1L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        intArray0[0] = -1860;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals((-1860), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[0] = ((float)((byte)(46)));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(46.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        float[] floatArray0 = new float[1];
        floatArray0[0] = ((float)(-3494L));
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals((-3494.0F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)((short)(-9)));
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals((-9.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byteArray0[0] = ((byte)(-31));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-31)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max(((long)((byte)(-31))), 2491L, ((long)((byte)(-31))));
        org.junit.Assert.assertEquals(2491L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(0.0F, 0.0F, (-1313.63F));
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.max(((float)((short)(-3692))), (-660.4017F), (-517.297F));
        org.junit.Assert.assertEquals((-517.297F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(0.0, 0.0, 0.0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(((double)(-1.0F)), ((double)(-1.0F)), ((double)(-1336.8F)));
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(-114)), ((byte)(-8)));
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-32)), ((byte)(-32)), ((byte)(-32)));
        org.junit.Assert.assertEquals(((byte)(-32)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("0xu<=?F_M~&m1s");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-2600.6337639154854), (-2600.6337639154854));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((double)(-1492L)), 1.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.math.NumberUtils.createFloat("Array cannot be empty.");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)), 1.0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble("", ((double)(0L)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("L[2)Q2", 703.776F);
        org.junit.Assert.assertEquals(703.776F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)), ((long)(0)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt("<w<>M W:", 46);
        org.junit.Assert.assertEquals(46, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(".4");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--.4u~P]Jn_tB8]4");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("9aR");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("--");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0xcSN%bY-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-0x-0xUC?gjv-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1231.6266F), (-1343.0474F));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1.0F), 1349.2046F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare(((float)(-469L)), ((float)(-469L)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.compare((-1.0), (-1404.13530332608));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(0)), ((byte)(66)), ((byte)(-1)));
        org.junit.Assert.assertEquals(((byte)(66)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(((byte)(-1)), ((byte)(numberUtils0.BYTE_MINUS_ONE)), ((byte)(numberUtils0.BYTE_ONE)));
        org.junit.Assert.assertEquals(((byte)(1)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1166)), ((short)(-1166)), ((short)(-306)));
        org.junit.Assert.assertEquals(((short)(-306)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(-1)), ((short)(1)), ((short)(1)));
        org.junit.Assert.assertEquals(((short)(1)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.max(((short)(0)), ((short)(0)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(1, 0, 65);
        org.junit.Assert.assertEquals(65, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max((-1389), (-1), (-344));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.max(0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-3633L), (-3633L), 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.max((-3010L), (-1L), (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(101)), ((byte)(97)), ((byte)(101)));
        org.junit.Assert.assertEquals(((byte)(97)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(((byte)(68)), ((byte)(68)), ((byte)(-71)));
        org.junit.Assert.assertEquals(((byte)(-71)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(-8)), ((short)(-3692)));
        org.junit.Assert.assertEquals(((short)(-3692)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(1)), ((short)(0)), ((short)(0)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        short short0 = org.apache.commons.lang.math.NumberUtils.min(((short)(0)), ((short)(299)), ((short)(299)));
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min(((int)((short)(2541))), 46, ((int)((short)(0))));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.min((-593), (-593), 2610);
        org.junit.Assert.assertEquals((-593), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min(1698L, 1L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.min((-1737L), (-1737L), (-1737L));
        org.junit.Assert.assertEquals((-1737L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        floatArray0[0] = -2391.5198F;
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        float[] floatArray0 = new float[2];
        float float0 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = 2659.9638187;
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(2659.9638187, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        double double0 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = ((byte)(70));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(70)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        shortArray0[2] = ((short)(1840));
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(1840)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        short[] shortArray0 = new short[4];
        short short0 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        intArray0[1] = 3014;
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(3014, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        int[] intArray0 = new int[4];
        int int0 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[0] = -3494L;
        long long0 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test129() throws java.lang.Throwable {
        float[] floatArray0 = new float[9];
        floatArray0[0] = ((float)(3695L));
        float float0 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
        org.junit.Assert.assertEquals(0.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test132() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = ((double)(numberUtils0.DOUBLE_MINUS_ONE));
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test134() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        double double0 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test135() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[9];
        byteArray0[1] = ((byte)(-81));
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(-81)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test138() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[8];
        byte byte0 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
        org.junit.Assert.assertEquals(((byte)(0)), byte0);
    }

    @org.junit.Test(timeout = 4000)
    public void test139() throws java.lang.Throwable {
        short[] shortArray0 = new short[25];
        shortArray0[2] = ((short)(-2309));
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(-2309)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test140() throws java.lang.Throwable {
        short[] shortArray0 = new short[7];
        short short0 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
        org.junit.Assert.assertEquals(((short)(0)), short0);
    }

    @org.junit.Test(timeout = 4000)
    public void test142() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[0] = 65;
        int int0 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test145() throws java.lang.Throwable {
        long[] longArray0 = new long[8];
        longArray0[0] = ((long)((byte)(1)));
        long long0 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test148() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(-2391.5198F));
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test149() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test150() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, ((double[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test151() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test152() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test153() throws java.lang.Throwable {
        float[] floatArray0 = new float[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, ((float[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test154() throws java.lang.Throwable {
        float[] floatArray0 = new float[21];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test155() throws java.lang.Throwable {
        float[] floatArray0 = new float[3];
        float[] floatArray1 = new float[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test156() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        longArray0[4] = ((long)(186));
        long[] longArray1 = new long[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test157() throws java.lang.Throwable {
        long[] longArray0 = new long[0];
        long[] longArray1 = new long[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test158() throws java.lang.Throwable {
        long[] longArray0 = new long[7];
        long[] longArray1 = new long[7];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test159() throws java.lang.Throwable {
        long[] longArray0 = new long[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test160() throws java.lang.Throwable {
        long[] longArray0 = new long[4];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((long[])(null)), longArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test161() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = ((int)((short)(-2994)));
        int[] intArray1 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test162() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        int[] intArray1 = new int[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test163() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        int[] intArray1 = new int[6];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test164() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test165() throws java.lang.Throwable {
        int[] intArray0 = new int[8];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, ((int[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test166() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        shortArray0[0] = ((short)(64));
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test167() throws java.lang.Throwable {
        short[] shortArray0 = new short[9];
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test168() throws java.lang.Throwable {
        short[] shortArray0 = new short[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, ((short[])(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test169() throws java.lang.Throwable {
        short[] shortArray0 = new short[3];
        short[] shortArray1 = new short[3];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test170() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test171() throws java.lang.Throwable {
        short[] shortArray0 = new short[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((short[])(null)), shortArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test172() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        byteArray1[0] = ((byte)(68));
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test173() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[6];
        byte[] byteArray1 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test174() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[5];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(((byte[])(null)), byteArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test175() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[2];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test176() throws java.lang.Throwable {
        byte[] byteArray0 = new byte[1];
        byte[] byteArray1 = new byte[1];
        boolean boolean0 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test178() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.math.NumberUtils.createBigDecimal(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigDecimal0);
    }

    @org.junit.Test(timeout = 4000)
    public void test179() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.math.NumberUtils.createBigInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(bigInteger0);
    }

    @org.junit.Test(timeout = 4000)
    public void test180() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.createLong(((java.lang.String)(null)));
        org.junit.Assert.assertNull(long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test181() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.math.NumberUtils.createInteger(((java.lang.String)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test182() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.createDouble(((java.lang.String)(null)));
        org.junit.Assert.assertNull(double0);
    }

    @org.junit.Test(timeout = 4000)
    public void test183() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.createFloat(((java.lang.String)(null)));
        org.junit.Assert.assertNull(float0);
    }

    @org.junit.Test(timeout = 4000)
    public void test195() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber("--qbb");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test197() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.math.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test199() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test200() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat(((java.lang.String)(null)), (-3505.791F));
        org.junit.Assert.assertEquals((-3505.791F), float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test201() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong("", 204L);
        org.junit.Assert.assertEquals(204L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test202() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.toInt(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test203() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.math.NumberUtils.toLong(((java.lang.String)(null)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test204() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.max(4540.24179767217, (-414.574), 4540.24179767217);
        org.junit.Assert.assertEquals(4540.24179767217, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test205() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.min(0.0, (-1.0), 2991.55041900633);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test206() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.min(((float)(46)), 1.0F, 2042.0F);
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test207() throws java.lang.Throwable {
        float float0 = org.apache.commons.lang.math.NumberUtils.toFloat("92");
        org.junit.Assert.assertEquals(92.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test208() throws java.lang.Throwable {
        double double0 = org.apache.commons.lang.math.NumberUtils.toDouble(".4");
        org.junit.Assert.assertEquals(0.4, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test209() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("A blank string is not a valid number", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test210() throws java.lang.Throwable {
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
        float float0 = org.apache.commons.lang.math.NumberUtils.max(((float)(numberUtils0.BYTE_ZERO)), ((float)(numberUtils0.BYTE_ONE)), ((float)(numberUtils0.LONG_ONE)));
        org.junit.Assert.assertEquals(1.0F, float0, 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test211() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.math.NumberUtils.stringToInt("0x.4u~P]Jn_tB8]4");
        org.junit.Assert.assertEquals(0, int0);
    }
}

