package org.apache.commons.lang;


public class NumberUtils_ESTest extends org.apache.commons.lang.NumberUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum((-783L), ((long)(0)), (-783L));
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-802), 1733, 1733);
        org.junit.Assert.assertEquals((-802), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(105L, 0L, 105L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(0L, 32L, 2099L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("+MNx", 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("VY", (-807));
        org.junit.Assert.assertEquals((-807), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("92");
        org.junit.Assert.assertEquals(92, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(2096L, 2096L, 1967L);
        org.junit.Assert.assertEquals(1967L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(100, 70, 100);
        org.junit.Assert.assertEquals(70, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(((long)(-1)), (-1715L), ((long)(-1)));
        org.junit.Assert.assertEquals((-1L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-282), (-282), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0")));
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("1");
        org.junit.Assert.assertEquals(1L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("7");
        org.junit.Assert.assertEquals(7, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("-0x2");
        org.junit.Assert.assertEquals((-2), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("2");
        org.junit.Assert.assertEquals(2.0F, ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("8");
        org.junit.Assert.assertEquals(8.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-40");
        org.junit.Assert.assertEquals((-40.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("-0");
        org.junit.Assert.assertEquals(0, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.math.BigInteger bigInteger0 = org.apache.commons.lang.NumberUtils.createBigInteger("6");
        org.junit.Assert.assertEquals(6, bigInteger0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("2");
        org.junit.Assert.assertEquals(2, bigDecimal0.shortValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createNumber("Y|Aa0F`e E$N6/tb");
            org.junit.Assert.fail("Expecting exception: StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat("SEA> .E%}");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createFloat(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble("UjW");
            org.junit.Assert.fail("Expecting exception: NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        try {
            org.apache.commons.lang.NumberUtils.createDouble(((java.lang.String)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("-0");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        java.math.BigDecimal bigDecimal0 = org.apache.commons.lang.NumberUtils.createBigDecimal("0");
        org.junit.Assert.assertEquals(0, bigDecimal0.byteValue());
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        java.lang.Float float0 = org.apache.commons.lang.NumberUtils.createFloat("-0");
        org.junit.Assert.assertEquals((-0.0F), ((float)(float0)), 0.01F);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("2", 101);
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        java.lang.Double double0 = org.apache.commons.lang.NumberUtils.createDouble("-0");
        org.junit.Assert.assertEquals((-0.0), ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("L");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("F");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("D");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("6e");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(")");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("--^Q\"Iip 5h+I*v*");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("+MNx");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("e0");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("4E.d18q2c");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("...");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber(" is not a valid number.");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0xe|gGmobJBE{%rs ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0x\n");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0xF");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0ax");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("0x0xString& must nt be nuol");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("-");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isNumber("d");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("2");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits("");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.NumberUtils.isDigits(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(0.0F, 0.0F);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-275.21408F), ((float)(1)));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-275.21408F), ((float)(-2734L)));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(1239.754089918, 1239.754089918);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare((-2774.874), 0.0);
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.compare(((double)(0)), (-12.455841238309581));
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-1), (-1), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum((-802), 1733, (-802));
        org.junit.Assert.assertEquals(1733, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.maximum(2153, 1, 2153);
        org.junit.Assert.assertEquals(2153, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(69L, (-1176L), ((long)(1860)));
        org.junit.Assert.assertEquals(1860L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.maximum(0L, 0L, 0L);
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum(100, 1, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-64), (-2357), (-2357));
        org.junit.Assert.assertEquals((-2357), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.minimum((-64), (-64), (-64));
        org.junit.Assert.assertEquals((-64), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum((-1L), (-1L), (-1474L));
        org.junit.Assert.assertEquals((-1474L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        long long0 = org.apache.commons.lang.NumberUtils.minimum(853L, (-1293L), (-1293L));
        org.junit.Assert.assertEquals((-1293L), long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("92")));
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(92, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("-0x2")));
        org.junit.Assert.assertEquals((-2), ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        java.lang.Integer integer0 = ((java.lang.Integer)(org.apache.commons.lang.NumberUtils.createNumber("0xF")));
        org.junit.Assert.assertEquals(15, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber("---,x..J");
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        java.lang.Number number0 = org.apache.commons.lang.NumberUtils.createNumber(((java.lang.String)(null)));
        org.junit.Assert.assertNull(number0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        java.lang.Long long0 = org.apache.commons.lang.NumberUtils.createLong("-0");
        org.junit.Assert.assertEquals(0L, ((long)(long0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.NumberUtils.createInteger("0");
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.NumberUtils.stringToInt("d");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.apache.commons.lang.NumberUtils numberUtils0 = new org.apache.commons.lang.NumberUtils();
    }
}

