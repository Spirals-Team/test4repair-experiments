/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 11:07:09 GMT 2017
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0zwPN");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 59, 0);
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), (-96), (-96));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      try { 
        NumberUtils.createNumber("\n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 
         //  is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      try { 
        NumberUtils.createNumber("i#c*:O7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"i#c*:O7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", 3458);
      assertEquals(3458, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", (-2857));
      assertEquals((-2857), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("4");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = NumberUtils.minimum(1L, 1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = NumberUtils.minimum(101, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.minimum(2543, 2543, 2543);
      assertEquals(2543, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1L), (-1L), (-205L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Long long0 = NumberUtils.createLong("0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("5");
      assertEquals(5, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0x3");
      assertEquals((-3), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-0");
      assertEquals(-0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("3");
      assertEquals(3.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("0e3");
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("3");
      assertEquals(3.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("0");
      assertEquals(0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal(".2");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("+8");
      assertEquals(8, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-9");
      assertEquals(-9, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("0x&:}(J.,2ecm0^q=7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0x&:}(J.,2ecm0^q=7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("cX3");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"cX3\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("@46");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("-0xez+Z3_h-ZO");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("DjIS*,J");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"DjIS*,J\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-9");
      assertEquals((-9.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+E8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5EaX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("ez+Z3m]_h-ZO");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x\"\" is not a valid number.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x0e3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xC{@' ;]g}YaCNw@pKG");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0F");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("---0x)Y,LNF5>/2e%l=,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0F, (-1567.198F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = NumberUtils.compare((-271.8847F), (float) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = NumberUtils.compare((-271.8847F), (-271.8847F));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = NumberUtils.compare((-606.769738), (-2311.300520341));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = NumberUtils.compare(1555.0, 2266.11280587);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0, 0.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), (-1), 2579);
      assertEquals(2579, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1398), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long long0 = NumberUtils.maximum((-2215L), (-1L), 28L);
      assertEquals(28L, long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      long long0 = NumberUtils.maximum((long) 2579, 1L, (long) (-1));
      assertEquals(2579L, long0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = NumberUtils.minimum(3052, 3052, (-221));
      assertEquals((-221), int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = NumberUtils.minimum(1214, (-1007703032), 1214);
      assertEquals((-1007703032), int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = NumberUtils.minimum((-1007703032), 1555, (-1007703032));
      assertEquals((-1007703032), int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, (-1L), 913L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = NumberUtils.minimum((long) 1, 28L, (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber("0e3");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      try { 
        NumberUtils.createNumber("LL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // LL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      try { 
        NumberUtils.createNumber("n:(J.Y2rcm0^ql");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // n:(J.Y2rcm0^ql is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Srings must not benull");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Srings must not benull is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      try { 
        NumberUtils.createNumber("$4yJfN V?f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // $4yJfN V?f is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      try { 
        NumberUtils.createNumber("K/fQB(a/BVEd");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // K/fQB(a/BVEd is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Long long0 = (Long)NumberUtils.createNumber("0L");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber("0F");
      assertEquals(0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e\n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e
         //  is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("^exq)}&1ju2`E");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      try { 
        NumberUtils.createNumber("&:}(J.,2ecm0^q=7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Float float0 = (Float)NumberUtils.createNumber(".2");
      assertEquals(0.2F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber("XrgOapache.commons.lang.StringUtils");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // XrgOapache.commons.lang.StringUtils is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0x3");
      assertEquals((-3), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0x");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("---0x)Y,LNF5>/2e%l=,");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("9");
      assertEquals(9, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Long long0 = NumberUtils.createLong("+8");
      assertEquals(8L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("3");
      assertEquals(3, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("-0xez+Z3_h-ZO");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("\"\" is not a valid number.", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      try { 
        NumberUtils.createNumber("rDlU%{&D");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // rDlU%{&D is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("'5MxCg_`p,[!r:.Ne ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}
