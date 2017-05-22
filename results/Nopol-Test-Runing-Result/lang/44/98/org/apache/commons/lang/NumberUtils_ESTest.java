package org.apache.commons.lang;


public class NumberUtils_ESTest extends org.apache.commons.lang.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0{]4S");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-156), (-1408), (-1081938325));
        org.junit.Assert.assertEquals((-156), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(412L, (-4378L), 462L);
        org.junit.Assert.assertEquals(462L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt(((java.lang.String)(null)), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("c37&.", 100);
        org.junit.Assert.assertEquals(100, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("--Minimum abbreviation width is 4");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("-4");
        org.junit.Assert.assertEquals((-4), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(1639L, 1639L, 299L);
        org.junit.Assert.assertEquals(299L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(264, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(1, 1, 1);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(0)), ((long)(0)), (-2795L));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("-0");
        org.junit.Assert.assertEquals(0L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("-4");
        org.junit.Assert.assertEquals((-4L), ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0");
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("9");
        org.junit.Assert.assertEquals(9, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-4");
        org.junit.Assert.assertEquals((-4), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("-0");
        org.junit.Assert.assertEquals((-0.0F), ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("8");
        org.junit.Assert.assertEquals(8.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("-4");
        org.junit.Assert.assertEquals((-4.0F), ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("7");
        org.junit.Assert.assertEquals(7.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-4");
        org.junit.Assert.assertEquals((-4.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("-0");
        org.junit.Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("7");
        org.junit.Assert.assertEquals(7, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("-4");
        org.junit.Assert.assertEquals((-4), bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("-0");
        org.junit.Assert.assertEquals(0, bigDecimal0.shortValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createNumber("L");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat("Search and Replace array lengths don't match: ");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble("--");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("94");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("", (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("3L");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-L");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("f");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("d");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("E");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0E7");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(" ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("+m56}T");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("eog");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0-jHL:Bz");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x0Ez,P|Ap_");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x4");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0xf");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("D");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0xa'(u@0]mq");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0Ec");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(1555.934F, (-1.0F));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-861.6098F), 0.0F);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(((float)(-1)), ((float)(-1)));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(((double)(88.0F)), ((double)(0)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-13.571361195054514), 1.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(1.0, 1.0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-1408), 0, 3301);
        org.junit.Assert.assertEquals(3301, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(-1868)), 1L, 462L);
        org.junit.Assert.assertEquals(462L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum((-4378L), (-4378L), (-4378L));
        org.junit.Assert.assertEquals((-4378L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(0, (-4084), 2324);
        org.junit.Assert.assertEquals((-4084), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-1), 344, (-710));
        org.junit.Assert.assertEquals((-710), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(((long)(0)), (-1446L), 0L);
        org.junit.Assert.assertEquals((-1446L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(412L, 462L, (-3745L));
        org.junit.Assert.assertEquals((-3745L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        java.lang.Long long0 = ((java.lang.Long)(org.apache.commons.lang.NumberUtils.createNumber("1L")));
        org.junit.Assert.assertEquals(1L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        java.lang.Long long0 = ((java.lang.Long)(org.apache.commons.lang.NumberUtils.createNumber("-1L")));
        org.junit.Assert.assertEquals((-1L), ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber("--oL^xfvr");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("9");
        org.junit.Assert.assertEquals(9L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("3");
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("94");
        org.junit.Assert.assertEquals(94, bigDecimal0.shortValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("0");
        org.junit.Assert.assertEquals(0.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.apache.commons.lang.NumberUtils numberUtils0 = new org.apache.commons.lang.NumberUtils();
    }
}

