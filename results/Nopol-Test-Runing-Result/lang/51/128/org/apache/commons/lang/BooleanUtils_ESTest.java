package org.apache.commons.lang;


public class BooleanUtils_ESTest extends org.apache.commons.lang.BooleanUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("-0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("4y");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
        org.junit.Assert.assertFalse(boolean0);
        java.lang.Integer integer1 = java.lang.Integer.getInteger("JI/T7ohwb5v^k>A3vBT", 0);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer1, integer0, integer1);
        org.junit.Assert.assertEquals(0, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        java.lang.Integer integer0 = new java.lang.Integer(110);
        java.lang.Integer integer1 = new java.lang.Integer(110);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer1, ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(110, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(65);
        java.lang.Integer integer1 = new java.lang.Integer(54);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer0, integer0, integer1);
        org.junit.Assert.assertEquals(54, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-364));
        java.lang.Integer integer1 = new java.lang.Integer(108);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer1);
        org.junit.Assert.assertEquals(108, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[3];
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)), "");
        org.junit.Assert.assertTrue(boolean0);
        booleanArray0[0] = boolean0;
        booleanArray0[1] = boolean0;
        booleanArray0[2] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean1, (-716), 423, 0);
        org.junit.Assert.assertEquals(423, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(114);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 114, 0, 0);
        org.junit.Assert.assertEquals(114, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 3866, 3866, 0);
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(3432, 65, 3432, 65);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(114);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-2226));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-2425));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, "', is neither of type Map.Entry nor an Array", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "", ((java.lang.String)(null)), "java.lang.Object");
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-3215));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertNull(integer1);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1460));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer0);
        org.junit.Assert.assertEquals((-1460), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer0);
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(4800);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer0);
        org.junit.Assert.assertEquals(4800, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(460);
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("The Array must not be null");
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertNull(integer1);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(2757);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(2757, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 3432, (-3709));
        org.junit.Assert.assertEquals(3432, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-567), 84);
        org.junit.Assert.assertEquals((-567), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, "0x", "0x");
        org.junit.Assert.assertEquals("0x", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "java.lang.Object", "", "no");
        org.junit.Assert.assertEquals("java.lang.Object", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[1];
        booleanArray0[0] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[2] = true;
        booleanArray0[3] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test036() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[2] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[4];
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)(null)), "", "", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("", "/d(.}arPsY=i", "");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("", "", "");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), ((java.lang.String)(null)), "");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), "", ((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("tRst");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("off");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("yes");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("od");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("false");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("{}");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("t}t");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("kox5!v#q(", "off", "/WG'];`PW(Rkm1i2", "kox5!v#q(");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("-0x", "true", "-0x", "-0x");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "off", "/WG'];`PW(Rkm1i2", ((java.lang.String)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "[ 2v\"vj2$x/<~lm", ((java.lang.String)(null)), "6y`?^");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("Array cannot be empty.", "Array cannot be empty.", "--", "--");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no");
        org.junit.Assert.assertNotNull(boolean0);
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[9];
        booleanArray0[0] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "no", "no", "no");
        booleanArray0[1] = boolean1;
        booleanArray0[2] = boolean0;
        booleanArray0[3] = boolean0;
        booleanArray0[4] = boolean0;
        booleanArray0[5] = boolean0;
        booleanArray0[6] = boolean0;
        booleanArray0[7] = boolean0;
        booleanArray0[8] = boolean0;
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("zylHz3:l8");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on");
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-915));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer0, integer0, integer0);
        org.junit.Assert.assertEquals((-915), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)(null)), (-2680), (-2680), (-111));
        org.junit.Assert.assertEquals((-111), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 70);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false, 1, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(((java.lang.String)(null)));
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(114);
        java.lang.Integer integer1 = new java.lang.Integer(2821);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, ((java.lang.Integer)(null)), integer0, integer0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(1394);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(6072, 6072, 6072, (-2206));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1509));
        java.lang.Integer integer1 = java.lang.Integer.getInteger("", (-1));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer1, integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        java.lang.Integer integer0 = java.lang.Integer.getInteger("av:.<>Y");
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1509));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer0, integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-1306), 2, (-1306));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(2942, 2942, 2942);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        java.lang.Integer integer0 = java.lang.Integer.getInteger("false", 0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(85);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)(null)), false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(((java.lang.String)(null)));
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("{}");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(114);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(((java.lang.String)(null)));
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("{}");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("w@Fout>)O[&(");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-248));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isTrue(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(((java.lang.String)(null)));
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean1, false);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        org.junit.Assert.assertFalse(boolean1);
        org.junit.Assert.assertNotNull(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean0);
        org.junit.Assert.assertEquals("on", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(true);
        org.junit.Assert.assertEquals("on", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean0);
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(false);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        org.apache.commons.lang.BooleanUtils booleanUtils0 = new org.apache.commons.lang.BooleanUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(false);
        org.junit.Assert.assertEquals("no", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test127() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(true);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean0);
        org.junit.Assert.assertEquals("yes", string0);
        org.junit.Assert.assertNotNull(string0);
    }
}

