package org.apache.commons.lang;


public class NumberUtils_ESTest extends org.apache.commons.lang.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0}j");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(4543, 3568, 43);
        org.junit.Assert.assertEquals(4543, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-2), (-260), (-260));
        org.junit.Assert.assertEquals((-260), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(2026, 2026, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum((-3638L), 0L, (-2669L));
        org.junit.Assert.assertEquals((-3638L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("?b=feHYP", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt(((java.lang.String)(null)), 4543);
        org.junit.Assert.assertEquals(4543, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("1");
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(0L, ((long)(0)), 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(2142, 1604, 65);
        org.junit.Assert.assertEquals(65, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-3237), (-475), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("1");
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0xEd");
        org.junit.Assert.assertEquals((-237), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0x1");
        org.junit.Assert.assertEquals((-1), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("-0");
        org.junit.Assert.assertEquals((-0.0F), ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("6");
        org.junit.Assert.assertEquals(6.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-0");
        org.junit.Assert.assertEquals((-0.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("3");
        org.junit.Assert.assertEquals(3.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-5d");
        org.junit.Assert.assertEquals((-5.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("0");
        org.junit.Assert.assertEquals(0, bigInteger0.shortValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("1");
        org.junit.Assert.assertEquals(1, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("-0");
        org.junit.Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("1");
        org.junit.Assert.assertEquals(1, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("0x0x5b");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("L");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("F");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("5d");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-e");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("--");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("--Minimum abbreviation width is 4");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("+haDS(5MP0ltTROLV]Y");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(".EeO}\"a)-:,");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0=x?l{~cVpN/");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x5b");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x.>eO3\"a)-:,");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0xF");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x0x5b");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0E.>eO3\"a)-,");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(".5EeO}\"a)-:,");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("f");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("1");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-6.3992405F), (-6.3992405F));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-6.3992405F), 0.0F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(242.944F, 1.0F);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(261.9427, (-472.5464122548423));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-1806.0), 0.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(0.0, 0.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(1, 1, 2906);
        org.junit.Assert.assertEquals(2906, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-1806), (-1806), (-1806));
        org.junit.Assert.assertEquals((-1806), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(-403)), (-2492L), ((long)(438)));
        org.junit.Assert.assertEquals(438L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum((-1480L), ((long)(0)), (-1480L));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum((-283L), (-283L), (-283L));
        org.junit.Assert.assertEquals((-283L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-2), (-260), 0);
        org.junit.Assert.assertEquals((-260), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(1, 57, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(5L, 0L, (-13L));
        org.junit.Assert.assertEquals((-13L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(((long)(1)), 1458L, ((long)(1)));
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        java.lang.Double double0 = ((java.lang.Double)(org.apache.commons.lang.NumberUtils.createNumber("5d")));
        org.junit.Assert.assertEquals(5.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createNumber("L");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0x5b")));
        org.junit.Assert.assertEquals((-91), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("0x5b")));
        org.junit.Assert.assertEquals(91, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber("--OIl");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("3");
        org.junit.Assert.assertEquals(3L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("0");
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt(";d");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("T(\"*[dxrwj#k_", (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble("f");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test96() throws java.lang.Throwable {
        org.apache.commons.lang.NumberUtils numberUtils0 = new org.apache.commons.lang.NumberUtils();
    }
}

