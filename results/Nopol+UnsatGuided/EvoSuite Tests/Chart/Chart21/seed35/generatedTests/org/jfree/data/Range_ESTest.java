/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 23 15:32:17 GMT 2017
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
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = new Range((-1.0), 0.0);
      boolean boolean0 = range1.equals(range0);
      assertFalse(boolean0);
      assertEquals((-1.0), range1.getLowerBound(), 0.01);
      assertFalse(range0.equals((Object)range1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Range range0 = new Range(0.0, 4559.61);
      boolean boolean0 = range0.intersects(1.0, 4559.61);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Range range0 = new Range((-1057.2137483999902), (-1057.2137483999902));
      boolean boolean0 = range0.intersects(1.0, (-2423.076174266593));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1.0);
      Range range1 = Range.shift(range0, 1.0, false);
      boolean boolean0 = range1.intersects(1.0, 1.0);
      assertFalse(boolean0);
      assertEquals(2.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.shift(range0, 0.0, false);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.shift(range0, 0.0);
      assertEquals((-1.0), range1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Range range0 = new Range(0.0, 4559.61);
      double double0 = range0.getUpperBound();
      assertEquals(4559.61, range0.getLength(), 0.01);
      assertEquals(4559.61, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Range range0 = new Range(1356.0, 1356.0);
      double double0 = range0.getLowerBound();
      assertEquals(1356.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      double double0 = range0.getLength();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.getCentralValue();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Range range0 = new Range((-862.00255677448), 2132.7009359);
      double double0 = range0.getCentralValue();
      assertEquals(635.3491895627599, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.expandToInclude(range0, (-778.0));
      assertEquals(777.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expandToInclude(range0, 0.0);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Range range0 = new Range((-862.00255677448), 2132.7009359);
      Range range1 = Range.expand(range0, 2132.7009359, (-105.528));
      boolean boolean0 = range1.equals(range0);
      assertEquals(6073776.574887584, range1.getLength(), 0.01);
      assertFalse(boolean0);
      assertEquals(2994.70349267448, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1.0);
      Range range1 = Range.expand(range0, 1.0, 1.0);
      assertTrue(range1.equals((Object)range0));
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      double double0 = range0.constrain(251.5);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Range range0 = new Range(2.0, 2.0);
      double double0 = range0.constrain(1.0);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Range range0 = Range.combine((Range) null, (Range) null);
      assertNull(range0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.shift(range0, (-1.0), true);
      Range range2 = Range.combine(range1, range0);
      assertEquals((-1.5), range2.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Range range0 = new Range((-1.0), (-1.0));
      Range range1 = Range.combine(range0, range0);
      assertEquals(0.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, (-1603.7993), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.shift((Range) null, (-343.9424523));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Range range0 = new Range(0.0, 745.0);
      Range range1 = Range.shift(range0, 1033.0077);
      boolean boolean0 = range1.contains(1033.0077);
      assertTrue(boolean0);
      assertEquals(745.0, range1.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Range range0 = new Range((-1057.2137483999902), (-1057.2137483999902));
      double double0 = range0.getUpperBound();
      assertEquals((-1057.2137483999902), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      double double0 = range0.getLength();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      double double0 = range0.getLowerBound();
      assertEquals(1.0, range0.getLength(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      Range range1 = Range.shift(range0, (-1.0), true);
      boolean boolean0 = range0.equals(range1);
      assertFalse(boolean0);
      assertEquals((-1.5), range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      boolean boolean0 = range0.equals(range0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        Range.expand((Range) null, 706.9601603679, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'range' argument.
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Range range0 = new Range(1.0, 5151.322176);
      Range range1 = Range.expandToInclude(range0, 478.8437);
      assertEquals(2576.161088, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      Range range1 = Range.expandToInclude(range0, 0.0);
      boolean boolean0 = range0.equals(range1);
      assertEquals(0.0, range1.getUpperBound(), 0.01);
      assertFalse(boolean0);
      assertEquals((-590.52), range1.getLowerBound(), 0.01);
      assertFalse(range1.equals((Object)range0));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Range range0 = new Range(2.0, 2.0);
      Range range1 = Range.combine(range0, (Range) null);
      assertEquals(2.0, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.combine((Range) null, range0);
      assertSame(range1, range0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Range range0 = new Range((-1057.2137483999902), (-1057.2137483999902));
      double double0 = range0.constrain((-2423.076174266593));
      assertEquals((-1057.2137483999902), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Range range0 = new Range((-862.00255677448), 2132.7009359);
      boolean boolean0 = range0.intersects(0.0, (-862.00255677448));
      assertFalse(boolean0);
      assertEquals(635.3491895627599, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range range0 = new Range(1.0, 5151.322176);
      boolean boolean0 = range0.intersects(5151.322176, 780.4512483262588);
      assertFalse(boolean0);
      assertEquals(5150.322176, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      boolean boolean0 = range0.intersects(0.0, 1739.654722272372);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Range range0 = Range.expandToInclude((Range) null, 1.0);
      boolean boolean0 = range0.intersects(1.0, 1.0);
      assertFalse(boolean0);
      assertEquals(1.0, range0.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Range range0 = new Range(0.0, 745.0);
      Range range1 = Range.shift(range0, (-1952.626311971), false);
      boolean boolean0 = range1.intersects((-1714.75544010898), (-1714.75544010898));
      assertEquals(745.0, range0.getUpperBound(), 0.01);
      assertEquals((-976.3131559855), range1.getCentralValue(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      boolean boolean0 = range0.contains(1347.850184098361);
      assertFalse(boolean0);
      assertEquals((-590.52), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      double double0 = range0.constrain((-590.52));
      assertEquals((-590.52), double0, 0.01);
      assertEquals((-590.52), range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      boolean boolean0 = range0.contains((-1763.677));
      assertFalse(boolean0);
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Range range0 = null;
      try {
        range0 = new Range(1.0, (-2572.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (1.0) <= upper (-2572.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      String string0 = range0.toString();
      assertEquals("Range[-590.52,-590.52]", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Range range0 = new Range((-590.52), (-590.52));
      assertEquals((-590.52), range0.getLowerBound(), 0.01);
      
      Range range1 = Range.shift(range0, 1200.143412183749);
      assertEquals(0.0, range1.getCentralValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Range range0 = new Range((-1057.2137483999902), (-1057.2137483999902));
      range0.hashCode();
      assertEquals(0.0, range0.getLength(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Range range0 = new Range((-1.0), 0.0);
      double double0 = range0.getCentralValue();
      assertEquals((-0.5), double0, 0.01);
      assertEquals(0.0, range0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Range range0 = new Range(0.0, 0.0);
      Range range1 = Range.expand(range0, 0.0, (-1177.5999435867568));
      assertEquals(0.0, range1.getLength(), 0.01);
  }
}
