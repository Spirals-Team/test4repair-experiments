package org.apache.commons.lang;


public class BooleanUtils_ESTest extends org.apache.commons.lang.BooleanUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("off");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("--");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(2048);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2048, 76, 2048, (-4037));
        java.lang.Integer integer1 = new java.lang.Integer(120);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer1, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(2048, ((int)(integer2)));
        org.junit.Assert.assertNotNull(integer2);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[2];
        booleanArray0[0] = true;
        java.lang.Integer integer0 = new java.lang.Integer(1228);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(booleanArray0[0])), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(1228, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(57);
        java.lang.Integer integer1 = java.lang.Integer.getInteger("x06QZ`", (-357));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer0, integer0, integer1);
        org.junit.Assert.assertEquals((-357), ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(3409);
        java.lang.Integer integer1 = new java.lang.Integer(298);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer1);
        org.junit.Assert.assertEquals(298, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 110, (-588));
        org.junit.Assert.assertEquals(110, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-4355));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-421));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, "", ((java.lang.String)(null)));
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer0);
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-3147));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer0);
        org.junit.Assert.assertEquals((-3147), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(85);
        java.lang.Integer integer0 = new java.lang.Integer((-2502));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
        org.junit.Assert.assertEquals((-2502), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(java.lang.Integer.MAX_VALUE);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-1), (-1));
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
        org.junit.Assert.assertFalse(boolean0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, 0, (-1695));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[2];
        booleanArray0[0] = true;
        booleanArray0[1] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[3];
        booleanArray0[0] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, ";+YG+ L", "true");
        org.junit.Assert.assertEquals("true", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(1795);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "java.lang.Object", "java.lang.Object", "java.lang.Object");
        org.junit.Assert.assertEquals("java.lang.Object", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "0hM", "Array is empty", "0hM");
        org.junit.Assert.assertEquals("Array is empty", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2048, 76, 2048, (-4037));
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isTrue(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("--");
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[8];
        booleanArray0[0] = boolean0;
        booleanArray0[1] = boolean0;
        booleanArray0[2] = boolean0;
        booleanArray0[3] = boolean0;
        booleanArray0[4] = boolean0;
        java.lang.Boolean boolean1 = java.lang.Boolean.TRUE;
        booleanArray0[5] = boolean1;
        booleanArray0[6] = boolean0;
        booleanArray0[7] = boolean0;
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[6];
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[4];
        booleanArray0[0] = boolean0;
        booleanArray0[1] = boolean0;
        booleanArray0[2] = boolean0;
        booleanArray0[3] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)(null)), "Oq<.c", "", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("{", "{", "{");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), "1bkb{)i=<h", ((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("u|BVi?}0)-Z:J", "true", "u|BVi?}0)-Z:J");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("JQ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("The Array must not be null");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("yes");
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
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("qi");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no", "q2G#D5HHVUb?", "q2G#D5HHVUb?", "no");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("%9Gc%@J^cj", "false", "%9Gc%@J^cj", "%9Gc%@J^cj");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "The String did not match any specified value", "The String did not match any specified value", ((java.lang.String)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "7", ((java.lang.String)(null)), "R!;,Z}7Oxl0J9G/u");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("The String did not match either specified value");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes");
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2508, 0, 2508, 0);
        org.junit.Assert.assertFalse(boolean0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
        org.junit.Assert.assertEquals(1, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), ((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer1);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNotNull(integer1);
        org.junit.Assert.assertEquals(1, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, (-1377), 0);
        org.junit.Assert.assertEquals((-1377), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)(null)), 0, 0, 120);
        org.junit.Assert.assertEquals(120, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(111);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 111, 3817, (-376));
        org.junit.Assert.assertEquals(111, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false, 0, 3740);
        org.junit.Assert.assertEquals(3740, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(false)), integer0, integer0, integer0);
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(3546);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, ((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-2502));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1855), 7, (-1968814417), (-1855));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1983282249));
        java.lang.Integer integer1 = new java.lang.Integer(0);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer1, integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(84);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer0, integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-1476), (-1476), (-421));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0, (-1129), 0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1129));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(java.lang.Integer.MAX_VALUE);
        java.lang.Integer integer0 = new java.lang.Integer(java.lang.Integer.MAX_VALUE);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(boolean0)));
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer1, integer0, ((java.lang.Integer)(null)), integer1);
        org.junit.Assert.assertNull(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean1, true);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)(null)), true);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(java.lang.Integer.MAX_VALUE);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        java.lang.Integer integer0 = new java.lang.Integer((-1719));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, ((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer1);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertNotNull(boolean0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(997, 997, 418, 997);
        org.junit.Assert.assertNotNull(boolean0);
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
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(java.lang.Integer.MAX_VALUE);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        boolean boolean2 = org.apache.commons.lang.BooleanUtils.isTrue(boolean1);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isNotTrue(((java.lang.Boolean)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        org.junit.Assert.assertTrue(boolean1);
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.negate(boolean1);
        org.junit.Assert.assertNotNull(boolean2);
        org.junit.Assert.assertFalse(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean0);
        org.junit.Assert.assertEquals("off", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(false);
        org.junit.Assert.assertEquals("off", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean0);
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(true);
        org.junit.Assert.assertEquals("true", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        org.apache.commons.lang.BooleanUtils booleanUtils0 = new org.apache.commons.lang.BooleanUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        boolean boolean0 = true;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean0);
        org.junit.Assert.assertEquals("yes", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("2rt5~U43#>^*rr", "2rt5~U43#>^*rr", "*r\"X/?X.k\"Ps", "*r\"X/?X.k\"Ps");
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean0);
        org.junit.Assert.assertEquals("yes", string0);
        org.junit.Assert.assertNotNull(string0);
    }
}

