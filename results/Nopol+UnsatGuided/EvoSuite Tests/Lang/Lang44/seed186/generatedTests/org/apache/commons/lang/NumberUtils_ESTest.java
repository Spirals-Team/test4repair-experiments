/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 06:31:49 GMT 2017
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
      boolean boolean0 = NumberUtils.isNumber("-0x9");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0yhz8<DFc[A:Ql*f+P");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      long long0 = NumberUtils.maximum(1667L, 0L, 206L);
      assertEquals(1667L, long0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = NumberUtils.minimum(286, 773, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      try { 
        NumberUtils.createNumber("pwg|g*Esp");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // pwg|g*Esp is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      try { 
        NumberUtils.createNumber("{ogtLdP}x_c&]:)3");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"{ogtLdP}\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("W-jYuLj tp:>/BiEd", 102);
      assertEquals(102, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.stringToInt(":WqQu0", (-620));
      assertEquals((-620), int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("8");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = NumberUtils.minimum(206L, (long) 0, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      long long0 = NumberUtils.minimum(634L, 2952L, 655L);
      assertEquals(634L, long0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = NumberUtils.minimum(2001, 2001, 2001);
      assertEquals(2001, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, (-1544), (-1544));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("0x8");
      assertEquals(8, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("0.");
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("1");
      assertEquals(1.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("0e9");
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("1");
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
      assertEquals(0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("3");
      assertEquals(3, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("0e9");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("8");
      assertEquals(8, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("a");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"a\"
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
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("y53S7}-VXPx?");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
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
        NumberUtils.createBigDecimal("gT}t3G<.F=+O{A");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
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
      boolean boolean0 = NumberUtils.isDigits("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
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
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0xe");
      assertEquals((-14), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0eb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("----#9j*^G&Fe~o bGwwK");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E@fh0Z>YeO6Q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2e+x[C*gZU");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xCannot pad a negative amount: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x0.hz8<DFc[A:Ql*f+P");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x7f");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("09e9");
      assertTrue(boolean0);
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
      int int0 = NumberUtils.compare((float) 0, 0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = NumberUtils.compare((float) (-1), (-177.8F));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0F, 2644.4666F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = NumberUtils.compare(-0.0F, (float) 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = NumberUtils.compare(0.7194093465805054, (-2496.67704));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0, (double) 102);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.compare((-1512.26598008), (-1512.26598008));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 0, 941);
      assertEquals(941, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = NumberUtils.maximum(0, 279, 215);
      assertEquals(279, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 0L, 1400L);
      assertEquals(1400L, long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = NumberUtils.maximum((-729L), 0L, (-625L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      long long0 = NumberUtils.maximum((-74L), (-74L), (-74L));
      assertEquals((-74L), long0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = NumberUtils.minimum(0, (-854), 1);
      assertEquals((-854), int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = NumberUtils.minimum(624L, 1L, (long) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.minimum((-1096L), (-1096L), (-1096L));
      assertEquals((-1096L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber("0e9");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.hz8<DFBQc[A:Ql*f+2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Float float0 = (Float)NumberUtils.createNumber("7f");
      assertEquals(7.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      try { 
        NumberUtils.createNumber("#>DVJL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // #>DVJL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Long long0 = (Long)NumberUtils.createNumber("3L");
      assertEquals(3L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-Rk+84i7lmX.L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -Rk+84i7lmX.L is not a valid number.
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
      BigDecimal bigDecimal0 = (BigDecimal)NumberUtils.createNumber("0f");
      assertEquals(0, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      try { 
        NumberUtils.createNumber("|VT$,d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // |VT$,d is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("L");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        NumberUtils.createNumber("_qY69~eIW#%yD)vD");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // _qY69~eIW#%yD)vD is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0eb");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eb is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        NumberUtils.createNumber("e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // e is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      try { 
        NumberUtils.createNumber("\"\" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // \"\" is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      try { 
        NumberUtils.createNumber("._rTURYXKPtE}J@@8E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ._rTURYXKPtE}J@@8E is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0.z8<DFc[AQl*f+P");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0.z8<DFc[AQl*f+P is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--2e+x[C*gZU");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
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
  public void test095()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger(".cfXuj$w.B'QJRdz@o");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \".\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Long long0 = NumberUtils.createLong("1");
      assertEquals(1L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0xe");
      assertEquals((-14), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("lRB tj^PCRGE]ow");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      try { 
        NumberUtils.createNumber("F");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // F is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("09e9");
      assertEquals(9.0E9, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Float float0 = (Float)NumberUtils.createNumber("09e9");
      assertEquals(8.9999995E9F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}
