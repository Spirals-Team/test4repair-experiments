package org.apache.commons.lang;


public class BooleanUtils_ESTest extends org.apache.commons.lang.BooleanUtils_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[9];
        booleanArray0[7] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("off");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(":M");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("");
        java.lang.Integer integer0 = new java.lang.Integer((-302));
        java.lang.Integer integer1 = new java.lang.Integer((-302));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer1, integer0, integer0);
        org.junit.Assert.assertTrue(integer2.equals(((java.lang.Object)(integer1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(false);
        java.lang.Integer integer0 = new java.lang.Integer(65);
        java.lang.Integer integer1 = new java.lang.Integer(3017);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer1);
        org.junit.Assert.assertEquals(65, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(101, 101, (-885), (-885));
        java.lang.Integer integer0 = new java.lang.Integer((-885));
        java.lang.Integer integer1 = new java.lang.Integer((-885));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer1);
        org.junit.Assert.assertTrue(integer2.equals(((java.lang.Object)(integer1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = new java.lang.Integer(111);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer1, integer0, integer0);
        org.junit.Assert.assertEquals(0, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = new java.lang.Integer(111);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer1, integer0, integer1);
        org.junit.Assert.assertEquals(111, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = new java.lang.Integer((-2085));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer1, integer0);
        org.junit.Assert.assertEquals(0, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 84, 116, 65);
        org.junit.Assert.assertEquals(84, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false, 300, 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-109));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(1371);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1276));
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer0);
        org.junit.Assert.assertEquals((-1276), ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer0);
        org.junit.Assert.assertEquals(1, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(483);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer0);
        org.junit.Assert.assertEquals(483, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("The String did not match either specified value");
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-1321), (-1321));
        org.junit.Assert.assertEquals((-1321), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("");
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, (-302), (-302), 1116);
        org.junit.Assert.assertEquals((-302), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, "[jq)I:vIoQ'wVP?_R1", "[jq)I:vIoQ'wVP?_R1");
        org.junit.Assert.assertEquals("[jq)I:vIoQ'wVP?_R1", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, "", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-302));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, ((java.lang.String)(null)), ((java.lang.String)(null)), "bZgdn@N1K]ph");
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)(null)), "u[eU}%bqDY~9edb", "u[eU}%bqDY~9edb", "yes");
        org.junit.Assert.assertEquals("yes", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("");
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, ((java.lang.String)(null)), ((java.lang.String)(null)), "bZgdn@N1K]ph");
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(false);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isTrue(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(((java.lang.String)(null)));
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[1];
        booleanArray0[0] = boolean1;
        java.lang.Boolean boolean2 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean2);
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("no");
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[5];
        booleanArray0[0] = boolean0;
        booleanArray0[1] = boolean0;
        booleanArray0[2] = boolean0;
        booleanArray0[3] = boolean0;
        booleanArray0[4] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test037() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[9];
        booleanArray0[0] = true;
        booleanArray0[1] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[9];
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test041() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("The Array must not be null", "The Array must not be null", ", Length: ");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test044() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), "Array cannot be empty.", ((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), ((java.lang.String)(null)), "1Ala7e+");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("yes", "{}", "yes");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("114");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("ufilp}m0");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("yes");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test052() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test054() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("{}");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("gn$", "on", "on", "gn$");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("The array must not contain any null elements", "', has a length less than 2", "The array must not contain any null elements", "n:u*f=snNB}");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "$#W#.d", "$#W#.d", ((java.lang.String)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test060() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), ((java.lang.String)(null)), "Ufilp}m0", "Ufilp}m0");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test061() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "", ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no");
        org.junit.Assert.assertFalse(boolean0);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "", "", "&V*k!,np.-hI}}T!");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("yes");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test064() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("off");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("on");
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("false");
        org.junit.Assert.assertNotNull(boolean0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("Ufilp}m0");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, 100, 0);
        org.junit.Assert.assertEquals(100, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)(null)), (-1131), (-2173), 2350);
        org.junit.Assert.assertEquals(2350, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, 0, (-3171));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 0, 65);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false, 2299, 2299);
        org.junit.Assert.assertEquals(2299, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean("");
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
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-109));
        java.lang.Integer integer1 = new java.lang.Integer(0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-697));
        java.lang.Integer integer1 = new java.lang.Integer(43);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2037, 2037, 120, 120);
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1786));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(100, 0, 0, 100);
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 338, 0, 101);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-727));
        java.lang.Integer integer1 = new java.lang.Integer(338);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer1, integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(1);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-727));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer0, integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-588), 120, (-588));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-881), (-881), 4010);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
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
        java.lang.Integer integer0 = new java.lang.Integer(84);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertNotNull(boolean0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(43);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-3020));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)(null)), false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("0M;0o3");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("0M;0o3");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "", "", "");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-697));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean0);
        org.junit.Assert.assertEquals("on", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(true);
        org.junit.Assert.assertEquals("on", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean0);
        org.junit.Assert.assertEquals("false", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test123() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(false);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test124() throws java.lang.Throwable {
        org.apache.commons.lang.BooleanUtils booleanUtils0 = new org.apache.commons.lang.BooleanUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test125() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(false);
        org.junit.Assert.assertEquals("no", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test126() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean0);
        org.junit.Assert.assertEquals("no", string0);
        org.junit.Assert.assertNotNull(string0);
    }
}

