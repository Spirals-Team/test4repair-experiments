/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 23:31:19 GMT 2017
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EuclideanIntegerPoint_ESTest extends EuclideanIntegerPoint_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      euclideanIntegerPoint0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[4];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = new int[4];
      intArray1[1] = (-27);
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
      assertFalse(boolean0);
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[8];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = new int[4];
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 3954;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      linkedList0.add(euclideanIntegerPoint0);
      EuclideanIntegerPoint euclideanIntegerPoint1 = euclideanIntegerPoint0.centroidOf(linkedList0);
      assertTrue(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint((int[]) null);
      int[] intArray0 = euclideanIntegerPoint0.getPoint();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = euclideanIntegerPoint0.getPoint();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = new int[4];
      intArray1[1] = 7;
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      double double0 = euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint1);
      assertEquals(7.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint((int[]) null);
      // Undeclared exception!
      try { 
        euclideanIntegerPoint0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint((int[]) null);
      // Undeclared exception!
      try { 
        euclideanIntegerPoint0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint((int[]) null);
      // Undeclared exception!
      try { 
        euclideanIntegerPoint0.equals(euclideanIntegerPoint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[0];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      // Undeclared exception!
      try { 
        euclideanIntegerPoint0.distanceFrom((EuclideanIntegerPoint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = new int[5];
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      // Undeclared exception!
      try { 
        euclideanIntegerPoint1.distanceFrom(euclideanIntegerPoint0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint((int[]) null);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      // Undeclared exception!
      try { 
        euclideanIntegerPoint0.centroidOf(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      int[] intArray1 = new int[6];
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      linkedList0.add(euclideanIntegerPoint0);
      // Undeclared exception!
      try { 
        euclideanIntegerPoint1.centroidOf(linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[3];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = euclideanIntegerPoint0.getPoint();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      String string0 = euclideanIntegerPoint0.toString();
      assertEquals("(0,0)", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = new int[4];
      intArray1[1] = 7;
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
      assertFalse(boolean0);
      assertFalse(euclideanIntegerPoint1.equals((Object)euclideanIntegerPoint0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[8];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      int[] intArray1 = new int[9];
      EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
      boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[1];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      boolean boolean0 = euclideanIntegerPoint0.equals(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[4];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      LinkedList<EuclideanIntegerPoint> linkedList0 = new LinkedList<EuclideanIntegerPoint>();
      // Undeclared exception!
      try { 
        euclideanIntegerPoint0.centroidOf(linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.math.stat.clustering.EuclideanIntegerPoint", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[2];
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint0);
  }
}
