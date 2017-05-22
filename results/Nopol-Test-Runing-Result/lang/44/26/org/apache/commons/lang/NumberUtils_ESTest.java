package org.apache.commons.lang;


public class NumberUtils_ESTest extends org.apache.commons.lang.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(1656)), 287L, ((long)(1656)));
        org.junit.Assert.assertEquals(1656L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(0L, (-109L), 1446L);
        org.junit.Assert.assertEquals(1446L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(2765, (-3284), 2765);
        org.junit.Assert.assertEquals((-3284), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum((-1864L), 1L, (-1864L));
        org.junit.Assert.assertEquals((-1864L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("0", 48);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("0x", 48);
        org.junit.Assert.assertEquals(48, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("7");
        org.junit.Assert.assertEquals(7, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(((long)(0)), ((long)(0)), ((long)(0)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(-1)), 0L, ((long)(-1)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("0");
        org.junit.Assert.assertEquals(0L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("2");
        org.junit.Assert.assertEquals(2L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("2");
        org.junit.Assert.assertEquals(2, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("0");
        org.junit.Assert.assertEquals(0.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("3");
        org.junit.Assert.assertEquals(3.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("0");
        org.junit.Assert.assertEquals(0.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("9");
        org.junit.Assert.assertEquals(9.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("0");
        org.junit.Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("0");
        org.junit.Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("2");
        org.junit.Assert.assertEquals(2, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble("yFK%{btFB7I5");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("0");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("yFK%{btFB7I5");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("r`# dcK0E>&nsrzN", (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0x0");
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("6L");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("4d");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("e");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(" ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("+e`ugjz1jrHB~Ch!E1)");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("eihi2pA");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0Ex");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0xf\"y:76");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x0");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0xCannot pa0 a negative amountX ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0ykx'sCSw3$)ESWLwS");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("L");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("----0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("157");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(4341.135F, 0.0F);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-2271.846F), (-674.9053F));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-3978.0F), (-3978.0F));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(0.0, (-2480.1509883));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-2480.1509883), 0.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(797.72, 797.72);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(0, (-476), 48);
        org.junit.Assert.assertEquals(48, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(0, 2985, (-2154));
        org.junit.Assert.assertEquals(2985, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-617), (-617), (-617));
        org.junit.Assert.assertEquals((-617), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(-1)), ((long)(-1)), (-727L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(1656, 1656, 102);
        org.junit.Assert.assertEquals(102, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(49, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-1438), 2, (-1438));
        org.junit.Assert.assertEquals((-1438), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(1446L, 1446L, (-3978L));
        org.junit.Assert.assertEquals((-3978L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum((-1274L), (-2626L), ((long)(746)));
        org.junit.Assert.assertEquals((-2626L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(735L, 735L, 735L);
        org.junit.Assert.assertEquals(735L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        java.lang.Long long0 = ((java.lang.Long)(org.apache.commons.lang.NumberUtils.createNumber("6L")));
        org.junit.Assert.assertEquals(6L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createNumber("&tfOXHy@e)PSEVaV!G");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0xE6")));
        org.junit.Assert.assertEquals((-230), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("0xE6")));
        org.junit.Assert.assertEquals(230, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber("--0x");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("9");
        org.junit.Assert.assertEquals(9, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("157");
        org.junit.Assert.assertEquals(157.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat("0x");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        org.apache.commons.lang.NumberUtils numberUtils0 = new org.apache.commons.lang.NumberUtils();
    }
}

