package org.apache.commons.lang;


public class BooleanUtils_ESTest extends org.apache.commons.lang.BooleanUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("cNK");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("0x");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("{}");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(false);
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = new java.lang.Integer(0);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer1, ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(integer2.equals(((java.lang.Object)(integer0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, ((java.lang.Integer)(null)), integer0, integer0);
        org.junit.Assert.assertNull(integer1);
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-2895));
        java.lang.Integer integer1 = java.lang.Integer.valueOf((-996));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer1);
        org.junit.Assert.assertEquals((-996), ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, 2652, 0);
        org.junit.Assert.assertEquals(2652, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)(null)), (-3541), 3145, 3145);
        org.junit.Assert.assertEquals(3145, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 79, 216);
        org.junit.Assert.assertEquals(79, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1514));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-2866));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2664);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean0);
        org.junit.Assert.assertEquals("true", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer0);
        org.junit.Assert.assertEquals(1, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        java.lang.Integer integer0 = java.lang.Integer.getInteger("The Array must not be null", 2038);
        java.lang.Integer integer1 = new java.lang.Integer((-2963));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer0, integer0, integer1);
        org.junit.Assert.assertEquals((-2963), ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[1] = true;
        booleanArray0[3] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, "", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, "o8!C vKHY", "o8!C vKHY");
        org.junit.Assert.assertEquals("o8!C vKHY", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(true);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "?eldr$-2`Qv{|HgSa{", "6#k;3", "6#k;3");
        org.junit.Assert.assertEquals("?eldr$-2`Qv{|HgSa{", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)(null)), ((java.lang.String)(null)), ", Length: 0", "");
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(((java.lang.String)(null)));
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, ((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("4pChS6i[!&rAV}:W");
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.isTrue(boolean1);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[3];
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("4pChS6i[!&rAV}:W");
        booleanArray0[0] = boolean0;
        booleanArray0[1] = booleanArray0[0];
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        booleanArray0[2] = boolean1;
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[5];
        booleanArray0[2] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[3];
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("\"/N#OF", "\"/N#OF", "", "M");
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[8];
        booleanArray0[0] = boolean0;
        booleanArray0[1] = booleanArray0[0];
        booleanArray0[2] = boolean0;
        booleanArray0[3] = boolean0;
        booleanArray0[4] = boolean0;
        booleanArray0[5] = boolean0;
        booleanArray0[6] = boolean0;
        booleanArray0[7] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(false);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean0);
        org.junit.Assert.assertEquals("no", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("r750", "$XjY;'C!An", "r750");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("on", "on", "true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), "true", ((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("N|7");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("yes");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("vZ|$q)^");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("vZ|$q)^", ":i", ":i", "vZ|$q)^");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "R", "y%xp", ((java.lang.String)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("j{idv\'\"//&UOB;!NyA");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        java.lang.Integer integer0 = java.lang.Integer.getInteger("The Array must not be null", 2038);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer0, integer0, integer0);
        org.junit.Assert.assertEquals(2038, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-2895));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer0);
        org.junit.Assert.assertEquals((-2895), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-174));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, (-3223), (-174), 44);
        org.junit.Assert.assertEquals((-3223), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)(null)), 0, 3511, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("UeBWW*CSe#N", "Index: ", "UeBWW*CSe#N", "[F");
        org.junit.Assert.assertFalse(boolean0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, (-2043), (-2043), 0);
        org.junit.Assert.assertEquals((-2043), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("{}");
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((boolean)(boolean0)), (-2895), (-996));
        org.junit.Assert.assertEquals((-996), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("\"/N#OF", "\"/N#OF", "", "M");
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        java.lang.Integer integer1 = java.lang.Integer.getInteger("The Array must not be null");
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        java.lang.Integer integer0 = java.lang.Integer.valueOf(114);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(83, 0, 475, 83);
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        java.lang.Integer integer1 = new java.lang.Integer(83);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer1, integer0, integer0, integer1);
        org.junit.Assert.assertNull(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2282, 85, 2282, 85);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(474, 474, (-1943), (-1943));
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean0);
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("on", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
        java.lang.Integer integer1 = new java.lang.Integer(227);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer1, integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1306055080));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "on", ((java.lang.String)(null)), "0x");
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer0, integer0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(101, 101, 101);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(69, 101, 69);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(48);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(101);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)(null)), false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("{}");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("E&(m4|v{&");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(83);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isNotFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("Lc-8jiZ,Z");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)), "");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[3];
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isTrue(booleanArray0[0]);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(((java.lang.String)(null)));
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(true);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        org.junit.Assert.assertFalse(boolean1);
        org.junit.Assert.assertNotNull(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(true);
        org.junit.Assert.assertEquals("on", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        org.apache.commons.lang.BooleanUtils booleanUtils0 = new org.apache.commons.lang.BooleanUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(true);
        org.junit.Assert.assertEquals("yes", string0);
    }
}

