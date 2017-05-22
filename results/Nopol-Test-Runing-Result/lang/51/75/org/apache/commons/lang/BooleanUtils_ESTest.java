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
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("r8");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        java.lang.Integer integer0 = java.lang.Integer.getInteger(((java.lang.String)(null)), (-2433));
        java.lang.Integer integer1 = new java.lang.Integer((-2433));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer1, integer0);
        org.junit.Assert.assertTrue(integer2.equals(((java.lang.Object)(integer0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertEquals(1, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = new java.lang.Integer(0);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)), integer0, integer0, integer1);
        org.junit.Assert.assertTrue(integer2.equals(((java.lang.Object)(integer0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-1369));
        java.lang.Integer integer1 = new java.lang.Integer((-1369));
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer1);
        org.junit.Assert.assertTrue(integer2.equals(((java.lang.Object)(integer0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("{X%C9*SW#");
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0);
        java.lang.Integer integer1 = new java.lang.Integer(221);
        java.lang.Integer integer2 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true, integer0, integer1);
        org.junit.Assert.assertEquals(0, ((int)(integer2)));
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("{X%C9*SW#");
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 0, 0, (-238));
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-787));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertTrue(boolean0);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, (-2020), (-2020), 2237);
        org.junit.Assert.assertEquals((-2020), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, (-434), 0);
        org.junit.Assert.assertEquals((-434), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-3104));
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
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(false);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean0);
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("off", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, ((java.lang.String)(null)), ((java.lang.String)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, "", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(false);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, ">):P<@r", ((java.lang.String)(null)), "");
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(19);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, integer0, integer0);
        org.junit.Assert.assertEquals(19, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf(true);
        java.lang.Integer integer0 = new java.lang.Integer(2212);
        java.lang.Integer integer1 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
        org.junit.Assert.assertEquals(2212, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false, (-2055), 0);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        boolean boolean0 = true;
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[1] = true;
        booleanArray0[2] = boolean0;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[4];
        booleanArray0[1] = true;
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        boolean[] booleanArray0 = new boolean[2];
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(true, "T~/", ((java.lang.String)(null)));
        org.junit.Assert.assertEquals("T~/", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test028() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(false, "", "LQ.?Tq-@t[2e1");
        org.junit.Assert.assertEquals("LQ.?Tq-@t[2e1", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test029() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(((java.lang.Boolean)(null)), "", "", "");
        org.junit.Assert.assertEquals("", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test030() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test031() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("{X%C9*SW#");
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test034() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[1];
        booleanArray0[0] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(550);
        org.junit.Assert.assertTrue(boolean0);
        java.lang.Boolean[] booleanArray0 = new java.lang.Boolean[2];
        booleanArray0[0] = boolean0;
        booleanArray0[1] = boolean0;
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.xor(booleanArray0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.TRUE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toString(boolean0, "lCv(g>l<-pRIp<1", "lCv(g>l<-pRIp<1", "%! ]{Vm");
        org.junit.Assert.assertEquals("lCv(g>l<-pRIp<1", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("no", "r#Z TO5", "no");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test040() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("gX282", "gX282", "gX282");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), ((java.lang.String)(null)), "G\"<=");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test043() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)), ", Length: ", ((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("yes");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test046() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test047() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("PGp");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.String)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean("true");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(", Length: ");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test051() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("", "1# Mw8k!B7'VRX5", "1# Mw8k!B7'VRX5", "");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test053() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("au+mFP<Nw", "au+mFP<Nw", "au+mFP<Nw", "au+mFP<Nw");
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test055() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "", ((java.lang.String)(null)), "7u2Ke~wkf!ja?`r");
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, 2233, 820, 820);
        org.junit.Assert.assertEquals(820, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), ((java.lang.String)(null)), "yes", ((java.lang.String)(null)));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test057() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.String)(null)), "M@)", ", Length: ", ((java.lang.String)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test058() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("|&^WLi8Lb'", "|Ht+uU@\"r-;(", "|&^WLi8Lb'", "38");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test059() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("no");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
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
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject("|&^WLi8Lb'");
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2276);
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(boolean0, (-1077), (-1732), (-1077));
        org.junit.Assert.assertEquals((-1077), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test068() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(((java.lang.Boolean)(null)), (-301), 0, 1152);
        org.junit.Assert.assertEquals(1152, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test069() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true, 85, 85);
        org.junit.Assert.assertEquals(85, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test070() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(true);
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        int int0 = org.apache.commons.lang.BooleanUtils.toInteger(false);
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(46);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Integer integer1 = new java.lang.Integer(115);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer1, integer0, integer0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-2056));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer((-2056));
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-2056));
        org.junit.Assert.assertTrue(boolean0);
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(boolean0, ((java.lang.Integer)(null)), ((java.lang.Integer)(null)), ((java.lang.Integer)(null)));
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)), integer0, integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test080() throws java.lang.Throwable {
        java.lang.Integer integer0 = java.lang.Integer.valueOf(2913);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 101, 0, 0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertNotNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(115, 115, 115, 0);
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(boolean0);
        org.junit.Assert.assertEquals("on", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0, 402, 402, 0);
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(false);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
        java.lang.Integer integer1 = new java.lang.Integer((-2262));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer1, integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), ((java.lang.Integer)(null)), integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Integer)(null)), integer0, ((java.lang.Integer)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        java.lang.Integer integer0 = org.apache.commons.lang.BooleanUtils.toIntegerObject(true);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(integer0, integer0, integer0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test091() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0, 2251, 0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean((-3514), (-3514), (-3005));
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(0);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(((java.lang.Integer)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(1303);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(4780);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, true);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(((java.lang.Boolean)(null)), false);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        java.lang.Integer integer0 = new java.lang.Integer(46);
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(integer0);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBoolean(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.toBoolean(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(false);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test106() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test107() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isFalse(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test108() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isFalse(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test109() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(true);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertFalse(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test110() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject(2276);
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test111() throws java.lang.Throwable {
        boolean boolean0 = org.apache.commons.lang.BooleanUtils.isTrue(((java.lang.Boolean)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test112() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        boolean boolean1 = org.apache.commons.lang.BooleanUtils.isNotTrue(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test113() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = new java.lang.Boolean(false);
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        org.junit.Assert.assertTrue(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test114() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.negate(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test115() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = org.apache.commons.lang.BooleanUtils.toBooleanObject((-1542));
        java.lang.Boolean boolean1 = org.apache.commons.lang.BooleanUtils.negate(boolean0);
        org.junit.Assert.assertFalse(boolean1);
        org.junit.Assert.assertNotNull(boolean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test116() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(((java.lang.Boolean)(null)));
        org.junit.Assert.assertNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test117() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringOnOff(false);
        org.junit.Assert.assertEquals("off", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test118() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.FALSE;
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(boolean0);
        org.junit.Assert.assertNotNull(string0);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test119() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringTrueFalse(false);
        org.junit.Assert.assertEquals("false", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test120() throws java.lang.Throwable {
        org.apache.commons.lang.BooleanUtils booleanUtils0 = new org.apache.commons.lang.BooleanUtils();
    }

    @org.junit.Test(timeout = 4000)
    public void test121() throws java.lang.Throwable {
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(true);
        org.junit.Assert.assertEquals("yes", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test122() throws java.lang.Throwable {
        java.lang.Boolean boolean0 = java.lang.Boolean.valueOf("odzLf_Ls#l");
        java.lang.String string0 = org.apache.commons.lang.BooleanUtils.toStringYesNo(boolean0);
        org.junit.Assert.assertEquals("no", string0);
        org.junit.Assert.assertNotNull(string0);
    }
}

