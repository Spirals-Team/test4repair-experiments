/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 10 20:56:28 GMT 2017
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
      long long0 = NumberUtils.maximum((-783L), (long) 0, (-783L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = NumberUtils.minimum((-802), 1733, 1733);
      assertEquals((-802), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      long long0 = NumberUtils.minimum(105L, 0L, 105L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      long long0 = NumberUtils.minimum(0L, 32L, 2099L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("+MNx", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("VY", (-807));
      assertEquals((-807), int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("92");
      assertEquals(92, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      long long0 = NumberUtils.minimum(2096L, 2096L, 1967L);
      assertEquals(1967L, long0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      int int0 = NumberUtils.minimum(100, 70, 100);
      assertEquals(70, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = NumberUtils.maximum((long) (-1), (-1715L), (long) (-1));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = NumberUtils.maximum((-282), (-282), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Long long0 = NumberUtils.createLong("1");
      assertEquals(1L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("7");
      assertEquals(7, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0x2");
      assertEquals((-2), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("2");
      assertEquals(2.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("8");
      assertEquals(8.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-40");
      assertEquals((-40.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("-0");
      assertEquals(0, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("6");
      assertEquals(6, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("2");
      assertEquals(2, bigDecimal0.shortValue());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createNumber("Y|Aa0F`e E$N6/tb");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createLong("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createInteger("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Zero length string
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
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
  public void test025()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat("SEA> .E%}");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createFloat((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble("UjW");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createDouble((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
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
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigDecimal("0x0xString& must nt be nuol");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
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
  public void test032()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("-0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal("0");
      assertEquals(0, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("-0");
      assertEquals(-0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("2", 101);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-0");
      assertEquals(-0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("6e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(")");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--^Q\"Iip 5h+I*v*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+MNx");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4E.d18q2c");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(" is not a valid number.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xe|gGmobJBE{%rs ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x\n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xF");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0ax");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0xString& must nt be nuol");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      int int0 = NumberUtils.compare(0.0F, 0.0F);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      int int0 = NumberUtils.compare((-275.21408F), (float) 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      int int0 = NumberUtils.compare((-275.21408F), (float) (-2734L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      int int0 = NumberUtils.compare(1239.754089918, 1239.754089918);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      int int0 = NumberUtils.compare((-2774.874), 0.0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      int int0 = NumberUtils.compare((double) 0, (-12.455841238309581));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = NumberUtils.maximum((-1), (-1), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = NumberUtils.maximum((-802), 1733, (-802));
      assertEquals(1733, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = NumberUtils.maximum(2153, 1, 2153);
      assertEquals(2153, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      long long0 = NumberUtils.maximum(69L, (-1176L), (long) 1860);
      assertEquals(1860L, long0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = NumberUtils.maximum(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = NumberUtils.minimum(100, 1, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      int int0 = NumberUtils.minimum((-64), (-2357), (-2357));
      assertEquals((-2357), int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      int int0 = NumberUtils.minimum((-64), (-64), (-64));
      assertEquals((-64), int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      long long0 = NumberUtils.minimum((-1L), (-1L), (-1474L));
      assertEquals((-1474L), long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      long long0 = NumberUtils.minimum(853L, (-1293L), (-1293L));
      assertEquals((-1293L), long0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-.x2");
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
      try { 
        NumberUtils.createNumber("ne%Ex3");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"ne%Ex3\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("92");
      assertNotNull(integer0);
      assertEquals(92, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Strings mu8t not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Strings mu8t not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      try { 
        NumberUtils.createNumber("S)Mobtzn?Uf");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // S)Mobtzn?Uf is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      try { 
        NumberUtils.createNumber("(BC^?_.jk'2L]9 ^d");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // (BC^?_.jk'2L]9 ^d is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      try { 
        NumberUtils.createNumber(",B=Vj_7DL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // ,B=Vj_7DL is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
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
  public void test086()  throws Throwable  {
      try { 
        NumberUtils.createNumber(":0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // :0E is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid nu.ber.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid nu.ber. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".#)Jl");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .#)Jl is not a valid number.
         //
         verifyException("org.apache.commons.lang.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("-0x2");
      assertEquals((-2), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Integer integer0 = (Integer)NumberUtils.createNumber("0xF");
      assertEquals(15, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("---,x..J");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
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
  public void test094()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.createBigInteger("o:bn4'\"`W");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"o:bn4'\"`W\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Long long0 = NumberUtils.createLong("-0");
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("0");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      int int0 = NumberUtils.stringToInt("d");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      try { 
        NumberUtils.createNumber("s!T'vZ*T8CEa<m(7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}
