/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 19:31:00 GMT 2017
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
      boolean boolean0 = NumberUtils.isNumber("(!`-g.[!_tBWs@.a@(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = NumberUtils.maximum(60, 60, 17);
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1L), 7L, (-271L));
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      long long0 = NumberUtils.maximum((long) 1985, (-899L), (long) 1985);
      assertEquals(1985L, long0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = NumberUtils.minimum(1, 1985, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      long long0 = NumberUtils.minimum((-2605L), (-2513L), (-2513L));
      assertEquals((-2605L), long0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      try { 
        NumberUtils.createNumber("~T>3G52");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~T>3G52\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("0x", 108);
      assertEquals(108, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("b4.?k:p6", (-1555));
      assertEquals((-1555), int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("40");
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = NumberUtils.minimum(3093, 3093, 3093);
      assertEquals(3093, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = NumberUtils.maximum((-325), (-908), (-325));
      assertEquals((-325), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-2");
      assertEquals((-2), (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Long long0 = NumberUtils.createLong("6");
      assertEquals(6L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0xb");
      assertEquals((-11), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("6");
      assertEquals(6, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-0");
      assertEquals(-0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-.2");
      assertEquals((-0.2F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("40");
      assertEquals(40.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-5");
      assertEquals((-5.0F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-0");
      assertEquals(-0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-.2");
      assertEquals((-0.2), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
      assertEquals(0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("5");
      assertEquals(5, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-.2");
      assertEquals(0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("1");
      assertEquals(1, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("-2");
      assertEquals(-2, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("q}Gz}Ene$^");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("0#b");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0#b\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
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
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
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
  public void test037()  throws Throwable  {
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
  public void test038()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits(" is not a valid number.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("\"\" is not a valid number.", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("E6PW:N|TH=");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"E6PW:N|TH=\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0!X|n w&-6\"u_!f:");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("51+@@A& [P<hg7T");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("eTxY|^B;M>F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0EH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xEf2ev:_Hr@{3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--.0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0#zXL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0Eev:_Hr@{3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("40");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare(2175.8F, 0.0F);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.compare((-2952.1318F), (float) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.compare((float) 0, (float) 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = NumberUtils.compare(2506.0, (-2741.775386591189));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = NumberUtils.compare((-2064.6), (double) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = NumberUtils.compare(119.0, 119.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), 17, 111);
      assertEquals(111, int0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = NumberUtils.maximum((-1906L), (-1581L), 4251L);
      assertEquals(4251L, long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.maximum((-557L), (-557L), (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int int0 = NumberUtils.minimum(61, (-148), (-4));
      assertEquals((-148), int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 0L, (-899L));
      assertEquals((-899L), long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      long long0 = NumberUtils.minimum(33L, (long) (-2107), 0L);
      assertEquals((-2107L), long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      long long0 = NumberUtils.minimum(4251L, 4251L, 4251L);
      assertEquals(4251L, long0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber(".0");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E_Hr@{2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      try { 
        NumberUtils.createNumber("7w0r!tgmb_.F{> l");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 7w0r!tgmb_.F{> l is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      try { 
        NumberUtils.createNumber("f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // f is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      try { 
        NumberUtils.createNumber("E2`Hr@{d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // E2`Hr@{d is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      try { 
        NumberUtils.createNumber("hci<4F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // hci<4F is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        NumberUtils.createNumber("D");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // D is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0EHr@");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0EHr@ is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        NumberUtils.createNumber(",kL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ,kL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      try { 
        NumberUtils.createNumber("^.qCx#eJ@Bq,");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ^.qCx#eJ@Bq, is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Float float0 = (Float)NumberUtils.createNumber("-.2");
      assertEquals((-0.2F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid numbe.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid numbe. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0x&q#E|3_[/:3s::c");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-&q#E|3_[/:3s::c\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("----E2_Hr@{3");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
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
  public void test098()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("7=");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"7=\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("0x9");
      assertEquals(9, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("U,E");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("--.0");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("40");
      assertEquals(40.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("0!X|n w&-6\"u_!f:");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}
