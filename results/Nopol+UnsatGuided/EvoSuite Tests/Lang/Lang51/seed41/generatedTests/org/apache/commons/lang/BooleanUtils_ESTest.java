/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 18:46:24 GMT 2017
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[2] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("off");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("2#");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(79, 79, 97, 97);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      Integer integer0 = new Integer(79);
      Integer integer1 = new Integer(79);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean1, integer0, integer1, integer1);
      assertTrue(integer2.equals((Object)integer0));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      assertTrue(boolean1);
      
      Integer integer0 = new Integer(1232);
      Integer integer1 = new Integer(1232);
      BooleanUtils.toIntegerObject(boolean1, integer0, integer1, integer1);
      assertFalse(boolean0.equals((Object)boolean1));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      Integer integer2 = BooleanUtils.toIntegerObject((Boolean) null, integer0, integer0, integer1);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      int int0 = BooleanUtils.toInteger(boolean0, Integer.MAX_VALUE, (-919), 1428);
      assertEquals((-919), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = BooleanUtils.toInteger((Boolean) null, 2, 2, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false, 1356, (-2131));
      assertEquals((-2131), int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(123, (-2147483645), (-2147483645), (-2080));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(0, 1, 1725);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Integer integer0 = Integer.getInteger("false", (-1542));
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-1023));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 0, 0);
      String string0 = BooleanUtils.toStringTrueFalse(boolean0);
      assertEquals("true", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, "no", "");
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      String string0 = BooleanUtils.toString((Boolean) null, "*N6<g~,m", "", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 1887);
      Integer integer1 = BooleanUtils.toIntegerObject(true, integer0, (Integer) null);
      assertEquals(1887, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Integer integer0 = Integer.getInteger("false", (-1542));
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, integer0);
      assertEquals((-1542), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer((-1352));
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0, integer0, integer0, integer0);
      assertEquals((-1352), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      Integer integer2 = BooleanUtils.toIntegerObject(boolean0, integer1, integer1, integer0);
      assertEquals(0, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true, 1938, 89);
      assertEquals(1938, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("{}");
      int int0 = BooleanUtils.toInteger(boolean0, 2626, 2626, 2508);
      assertEquals(2626, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(true);
      int int0 = BooleanUtils.toInteger(boolean0, (-609), 0, (-2727));
      assertEquals((-609), int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      String string0 = BooleanUtils.toString(true, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String string0 = BooleanUtils.toString(false, "m", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      String string0 = BooleanUtils.toString(boolean0, "`:a^n;Ds", (String) null, "");
      assertNotNull(string0);
      assertEquals("`:a^n;Ds", string0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      String string0 = BooleanUtils.toString(boolean0, "{QhwSn@h~ZY7f.UCE/x", (String) null, "e]C?\"");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isFalse((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("{}");
      boolean boolean1 = BooleanUtils.isTrue(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      Integer integer0 = new Integer(117);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      booleanArray0[0] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Boolean[] booleanArray0 = new Boolean[8];
      booleanArray0[0] = boolean0;
      booleanArray0[1] = boolean0;
      booleanArray0[2] = booleanArray0[1];
      booleanArray0[3] = boolean0;
      booleanArray0[4] = boolean0;
      booleanArray0[5] = boolean0;
      booleanArray0[6] = boolean0;
      booleanArray0[7] = boolean0;
      Boolean boolean1 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((Boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Boolean[] booleanArray0 = new Boolean[1];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The array must not contain any null elements
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      boolean boolean0 = BooleanUtils.xor(booleanArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.xor((boolean[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        BooleanUtils.xor(booleanArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array is empty
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("A{Sp", "false", "A{Sp");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean("Array cannot be empty.", "on", "true");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((String) null, "D)&E$vGi", "off");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, (String) null, "Index: ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null, "<%R6-*J~", (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("<%R6-*J~", "<%R6-*J~", (String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("G? j");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yes");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("yej");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("on");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("false");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("{}");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean("Tbj");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on", "?$x++92UN^", "", "on");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject("", "The array must not contain any null elements", "ol.Y9)q(FH?", "lp}3{bh@`o*]9f)=$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The array must not contain any null elements", "true", "The array must not contain any null elements", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((String) null, "=HXb\"-tKt'X*Dawq-[", "=HXb\"-tKt'X*Dawq-[", "<uL!?<[y?Z;rjY$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The String did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "Index: ", "The Array must not be null", (String) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, "oGXxOL[@S]BZ#]o", (String) null, "yv6kb`dmgg`0i");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((String) null, (String) null, (String) null, (String) null);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("The String did not match any specified value", "The String did not match any specified value", "The String did not match any specified value", "org.apache.commons.lang.math.NumberUtils");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("no");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("O8kq+[4aM@F@y_Fq");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("off");
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("on");
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("false");
      assertNotNull(boolean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("true");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Integer integer0 = Integer.getInteger("O8kq+[4aM@F@y_Fq");
      Integer integer1 = BooleanUtils.toIntegerObject((Boolean) null, (Integer) null, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Integer integer1 = BooleanUtils.toIntegerObject(false, integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject((Boolean) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true);
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(true);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      int int0 = BooleanUtils.toInteger(false);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = new Integer(1232);
      Integer integer1 = new Integer(1244);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, (Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(296);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(integer0, integer1, integer1, integer1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Integer integer0 = new Integer(101);
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Integer integer0 = Integer.getInteger("BVA`C", (-2080));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      Integer integer1 = Integer.getInteger("BVA`C", (-2080));
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer1, integer0, (Integer) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(true, (Integer) null, (Integer) null);
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null, integer0, integer0, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBooleanObject(2, (-1602), 0, 68);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match any specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(1507, 0, 1507, 2626);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 193, 944, 0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0, integer0, integer0, integer0);
      Integer integer1 = BooleanUtils.toIntegerObject(boolean0);
      assertNotNull(integer1);
      
      boolean boolean1 = BooleanUtils.toBoolean(integer0, integer1, integer0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", 1887);
      Integer integer1 = new Integer((-1225));
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(integer1, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Integer integer0 = BooleanUtils.toIntegerObject(false);
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean((Integer) null, integer0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, (Integer) null, (Integer) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Integer integer0 = new Integer(100);
      boolean boolean0 = BooleanUtils.toBoolean((Integer) null, integer0, (Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Integer integer0 = new Integer(1159);
      boolean boolean0 = BooleanUtils.toBoolean(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        BooleanUtils.toBoolean(1, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Integer did not match either specified value
         //
         verifyException("org.apache.commons.lang.BooleanUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = BooleanUtils.toBoolean(0, 0, (int) integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((-197), 76, (-197));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = BooleanUtils.toBooleanObject(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((Integer) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean(62);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-149));
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(", Length: 0");
      boolean boolean1 = BooleanUtils.toBooleanDefaultIfNull(boolean0, false);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      boolean boolean0 = BooleanUtils.toBoolean((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      boolean boolean1 = BooleanUtils.toBoolean(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(false);
      boolean boolean1 = BooleanUtils.isFalse(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject((-149));
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      boolean boolean1 = BooleanUtils.isNotFalse(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject(0, 0, 364, (-619));
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      boolean boolean0 = BooleanUtils.isTrue((Boolean) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("{}");
      boolean boolean1 = BooleanUtils.isNotTrue(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.negate((Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      Boolean boolean1 = BooleanUtils.negate(boolean0);
      boolean boolean2 = BooleanUtils.toBoolean(boolean1);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      String string0 = BooleanUtils.toStringOnOff(boolean0);
      assertNotNull(string0);
      assertEquals("off", string0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      String string0 = BooleanUtils.toStringOnOff(true);
      assertEquals("on", string0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse((Boolean) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      String string0 = BooleanUtils.toStringTrueFalse(false);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      BooleanUtils booleanUtils0 = new BooleanUtils();
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      String string0 = BooleanUtils.toStringYesNo(false);
      assertEquals("no", string0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Boolean boolean0 = BooleanUtils.toBooleanObject("yes");
      String string0 = BooleanUtils.toStringYesNo(boolean0);
      assertEquals("yes", string0);
      assertNotNull(string0);
  }
}
