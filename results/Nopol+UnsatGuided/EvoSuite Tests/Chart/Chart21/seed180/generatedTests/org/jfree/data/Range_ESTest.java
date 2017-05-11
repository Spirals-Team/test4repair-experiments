/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 16:57:36 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Range_ESTest extends Range_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Range range0 = new Range((-5268.2379), (-5268.2379));
      range0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range((-3426.635944589), (-3426.635944589));
      Range range1 = new Range((-3426.635944589), 183.614099284693);
      boolean boolean0 = range0.equals(range1);
      assertFalse(boolean0);
      assertEquals((-1621.5109226521533), range1.getCentralValue(), 0.01);
      assertFalse(range1.equals((Object)range0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range(1206.57, 1206.57);
      Range range1 = new Range((-1474.0539038), 0.0);
      boolean boolean0 = range0.equals(range1);
      assertFalse(boolean0);
      assertEquals((-737.0269519), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      Range range1 = Range.expandToInclude(range0, (-614.3));
      assertEquals((-845.886621909), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      boolean boolean0 = range0.intersects((-614.3), 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      boolean boolean0 = range0.intersects(0.0, (-1.0));
      assertFalse(boolean0);
      assertEquals(1691.773243818, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range(10.013709202430618, 10.013709202430618);
      boolean boolean0 = range0.intersects(1.0, 1.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range((-423.16), (-423.16));
      boolean boolean0 = range0.intersects((-423.16), (-423.16));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 1097.5786028569491, false);
      assertEquals(1097.5786028569491, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 0.0, false);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range((-584.57817), 1.0);
      double double0 = range0.getUpperBound();
      assertEquals((-291.789085), range0.getCentralValue(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      Range range1 = Range.shift(range0, (-614.3), true);
      double double0 = range1.getUpperBound();
      assertEquals((-1460.1866219090002), range1.getCentralValue(), 0.01);
      assertEquals((-614.3), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range(1206.57, 1206.57);
      double double0 = range0.getLowerBound();
      assertEquals(1206.57, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range((-3426.635944589), (-3426.635944589));
      double double0 = range0.getLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range((-584.57817), 1.0);
      Range range1 = Range.expandToInclude(range0, 1703.6475874770556);
      double double0 = range1.getCentralValue();
      assertEquals(559.5347087385278, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = new Range((-1613.3962920580325), 0.0);
      double double0 = range0.getCentralValue();
      assertEquals((-806.6981460290162), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range((-672.3519490348114), (-672.3519490348114));
      assertEquals(0.0, range0.getLength(), 0.01);
      
      Range range1 = Range.expand(range0, (-672.3519490348114), (-672.3519490348114));
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = new Range(10.013709202430618, 10.013709202430618);
      Range range1 = Range.expand(range0, (-395.06), 10.013709202430618);
      assertEquals(10.013709202430618, range1.getCentralValue(), 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      Range range1 = Range.expand(range0, 0.0, 598.7);
      Range range2 = Range.shift(range1, (-1691.773243818));
      assertEquals(1014556.4143176548, range2.getLength(), 0.01);
      assertEquals(1691.773243818, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range(1206.57, 1206.57);
      double double0 = range0.constrain((-501.7896296206333));
      assertEquals(1206.57, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = Range.combine((Range) null, (Range) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Range range0 = new Range(10.013709202430618, 10.013709202430618);
      Range range1 = Range.combine(range0, range0);
      assertEquals(10.013709202430618, range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Range range0 = new Range((-1613.3962920580325), 0.0);
      Range range1 = Range.shift(range0, 4215.0);
      Range range2 = Range.combine(range1, range0);
      assertEquals(4215.0, range1.getLength(), 0.01);
      assertEquals(5828.3962920580325, range2.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, (-9.571030015489704), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, (-796.9354310175302));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = null;
      try {
        range0 = new Range(2000.3147756004832, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (2000.3147756004832) <= upper (0.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      double double0 = range0.getUpperBound();
      assertEquals(1691.773243818, range0.getLength(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      double double0 = range0.getLength();
      assertEquals(1691.773243818, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(1691.773243818, range0.getLength(), 0.01);
      assertEquals((-1691.773243818), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range((-3426.635944589), (-3426.635944589));
      Range range1 = new Range((-3426.635944589), 183.614099284693);
      boolean boolean0 = range1.equals(range0);
      assertFalse(boolean0);
      assertFalse(range0.equals((Object)range1));
      assertEquals((-3426.635944589), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.shift(range0, (-1.0));
      boolean boolean0 = range1.equals(range0);
      assertEquals((-2.0), range1.getLowerBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      boolean boolean0 = range0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-845.886621909), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range((-3426.635944589), (-3426.635944589));
      boolean boolean0 = range0.equals(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range((-1691.773243818), 0.0);
      Range range1 = Range.shift(range0, 0.0);
      assertEquals((-845.886621909), range1.getCentralValue(), 0.01);
      assertEquals((-1691.773243818), range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.expand((Range) null, (-1048.1961), (-1394.7403229450715));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expandToInclude(range0, 2171.3589487031);
      assertEquals(2171.3589487031, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expandToInclude(range0, 0.0);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, (-1199.3065115502));
      assertEquals((-1199.3065115502), range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = new Range((-672.3519490348114), (-672.3519490348114));
      Range range1 = Range.combine(range0, (Range) null);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertNotNull(range1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.combine((Range) null, range0);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.constrain((-0.5427741208024233));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = new Range((-1613.3962920580325), 0.0);
      double double0 = range0.constrain(1.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1613.3962920580325), range0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range((-672.3519490348114), (-672.3519490348114));
      double double0 = range0.constrain((-672.3519490348114));
      assertEquals((-672.3519490348114), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range((-1613.3962920580325), 0.0);
      boolean boolean0 = range0.intersects((-773.082), (-1613.3962920580325));
      assertEquals(1613.3962920580325, range0.getLength(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = new Range((-4051.012557608839), 2171.3589487031);
      boolean boolean0 = range0.intersects(0.0, 0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range(10.013709202430618, 10.013709202430618);
      Range range1 = Range.expandToInclude(range0, 2.0);
      boolean boolean0 = range1.intersects(0.0, 10.013709202430618);
      assertEquals(6.006854601215309, range1.getCentralValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, (-4051.012557608839), true);
      boolean boolean0 = range1.intersects(0.0, 0.0);
      assertEquals((-4051.012557608839), range1.getCentralValue(), 0.01);
      assertFalse(boolean0);
      assertEquals((-4051.012557608839), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = new Range(0.0, 397.1);
      boolean boolean0 = range0.contains(0.0);
      assertTrue(boolean0);
      assertEquals(0.0, range0.getLowerBound(), 0.01);
      assertEquals(397.1, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = new Range((-3426.635944589), (-3426.635944589));
      boolean boolean0 = range0.contains(0.0);
      assertFalse(boolean0);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Range range0 = new Range(2.0, 2.0);
      assertEquals(2.0, range0.getUpperBound(), 0.01);
      
      Range range1 = Range.shift(range0, 2.0);
      boolean boolean0 = range1.contains(2.0);
      assertEquals(4.0, range1.getCentralValue(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Range range0 = new Range(0.0, 1737.5);
      // Undeclared exception!
      try { 
        Range.expand(range0, 2.0, (-2405.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (-3475.0) <= upper (-4176950.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      String string0 = range0.toString();
      assertEquals("Range[0.0,0.0]", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 0.0);
      assertEquals(0.0, range1.getLowerBound(), 0.01);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getCentralValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expand(range0, 2171.3589487031, 2171.3589487031);
      assertEquals(0.0, range1.getLength(), 0.01);
      assertEquals(0.0, range0.getLength(), 0.01);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }
}
