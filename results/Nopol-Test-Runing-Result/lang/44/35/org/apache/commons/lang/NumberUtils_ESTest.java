package org.apache.commons.lang;


public class NumberUtils_ESTest extends org.apache.commons.lang.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0XUa\"([V7C`T`,B");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-4378), 1036, 4347);
        org.junit.Assert.assertEquals(4347, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(498L, (-1610L), (-1610L));
        org.junit.Assert.assertEquals((-1610L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt(((java.lang.String)(null)), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt(((java.lang.String)(null)), (-5040));
        org.junit.Assert.assertEquals((-5040), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("4");
        org.junit.Assert.assertEquals(4, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(((long)(0)), ((long)(0)), 5L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(3835L, 3835L, 736L);
        org.junit.Assert.assertEquals(736L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(2672, 0, 2672);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(1794, 1794, 1794);
        org.junit.Assert.assertEquals(1794, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum((-1L), (-1L), (-1L));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-1020), (-1020), (-1020));
        org.junit.Assert.assertEquals((-1020), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("-0");
        org.junit.Assert.assertEquals(0L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("3");
        org.junit.Assert.assertEquals(3L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0");
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0xE");
        org.junit.Assert.assertEquals((-14), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("-0");
        org.junit.Assert.assertEquals((-0.0F), ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("3");
        org.junit.Assert.assertEquals(3.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-0");
        org.junit.Assert.assertEquals((-0.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-3");
        org.junit.Assert.assertEquals((-3.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal(".5");
        org.junit.Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("7");
        org.junit.Assert.assertEquals(7, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createNumber("{@}Ux?Ek_om mXe1");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble("0xStrings must not be null");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("9");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("46/y:~'w");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("7");
        org.junit.Assert.assertEquals(7.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("F");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("f");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("2D");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("E");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("e");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("3");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("--");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("--3}y&V,k|uHc5grK");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("+%f1:K6*");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("EG%[_TKQ=<e6^U");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0eP");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0xbCX[na.+\"OJ0J?;A{");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x0xbCX[na.+\"OJ0J?;A{");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0xE");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("5L");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-l");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(0.0F, (-3297.0F));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(((float)(-1)), ((float)(0)));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(((float)(-1)), ((float)(-1)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(0.0, 0.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-1706.6180685052213), 1462.38935);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(((double)(0L)), ((double)(-1713)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-1018), (-1018), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(300, 1, 0);
        org.junit.Assert.assertEquals(300, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(1)), (-486L), ((long)(300)));
        org.junit.Assert.assertEquals(300L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(0L, 1L, 0L);
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(0L, (-486L), ((long)(0)));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(0, 0, (-382));
        org.junit.Assert.assertEquals((-382), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-1), 0, 1);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum((-1713L), (-1L), 611L);
        org.junit.Assert.assertEquals((-1713L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(736L, (-1L), ((long)(-4378)));
        org.junit.Assert.assertEquals((-4378L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        java.lang.Long long0 = ((java.lang.Long)(org.apache.commons.lang.NumberUtils.createNumber("5L")));
        org.junit.Assert.assertEquals(5L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        java.lang.Double double0 = ((java.lang.Double)(org.apache.commons.lang.NumberUtils.createNumber("2D")));
        org.junit.Assert.assertEquals(2.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        java.lang.Float float0 = ((java.lang.Float)(org.apache.commons.lang.NumberUtils.createNumber(".5")));
        org.junit.Assert.assertEquals(0.5F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0xE")));
        org.junit.Assert.assertEquals((-14), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber("--");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("7");
        org.junit.Assert.assertEquals(7, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("-0");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("Fijr", 1);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test97() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat("-0x");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test98() throws java.lang.Throwable {
        org.apache.commons.lang.NumberUtils numberUtils0 = new org.apache.commons.lang.NumberUtils();
    }
}

