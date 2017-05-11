/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 19 01:30:06 GMT 2017
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OpenIntToDoubleHashMap_ESTest extends OpenIntToDoubleHashMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1009.199812407);
      openIntToDoubleHashMap0.put(20, 1009.199812407);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      double double0 = openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(1009.199812407, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(4390.0);
      openIntToDoubleHashMap0.put(0, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1009.199812407);
      openIntToDoubleHashMap0.put(20, 1009.199812407);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2);
      openIntToDoubleHashMap0.put(20, (-1.0));
      openIntToDoubleHashMap0.put(573, Double.NaN);
      openIntToDoubleHashMap0.put(2, 0.375);
      assertEquals(3, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2);
      openIntToDoubleHashMap0.put(2, 455.01826934);
      double double0 = openIntToDoubleHashMap0.get(573);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((double) 12);
      openIntToDoubleHashMap0.put(12, (-1.0));
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(0, (-0.1428571423679182));
      double double0 = openIntToDoubleHashMap0.remove(0);
      assertEquals(0, openIntToDoubleHashMap0.size());
      assertEquals((-0.1428571423679182), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((double) 12);
      openIntToDoubleHashMap0.put(12, (-1.0));
      double double0 = openIntToDoubleHashMap0.put(12, (-1.0));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2), (-2));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.remove((-1029));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -235869357
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-198), (-198));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.put((-198), (-198));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -235868201
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(3050, 0.0);
      openIntToDoubleHashMap0.iterator();
      // Undeclared exception!
      openIntToDoubleHashMap0.iterator();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1741));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.get(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-2689), (-2307.0909765342));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.containsKey(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((OpenIntToDoubleHashMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(Integer.MAX_VALUE, Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(Integer.MIN_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.put(0, 12);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertTrue(openIntToDoubleHashMap_Iterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((double) 12);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(12, (-1.0));
      try { 
        openIntToDoubleHashMap_Iterator0.advance();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // map has been modified while iterating
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, 0);
      try { 
        openIntToDoubleHashMap_Iterator0.value();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // map has been modified while iterating
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      try { 
        openIntToDoubleHashMap_Iterator0.value();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1009.199812407);
      openIntToDoubleHashMap0.put(20, 1009.199812407);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-0.585073434265508));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      try { 
        openIntToDoubleHashMap_Iterator0.key();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(0, 1074.550494233481);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((double) 12);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.put(0, 12);
      double double0 = openIntToDoubleHashMap0.remove(0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(12.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      double double0 = openIntToDoubleHashMap0.remove(12);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      double double0 = openIntToDoubleHashMap0.remove(1471);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.put(0, 1471);
      openIntToDoubleHashMap0.remove(8);
      openIntToDoubleHashMap0.put(1430, (-0.1428571423679182));
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.put(0, 1471);
      openIntToDoubleHashMap0.remove(8);
      double double0 = openIntToDoubleHashMap0.put(0, (-0.1428571423679182));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(1471.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2);
      openIntToDoubleHashMap0.put(2, 455.01826934);
      openIntToDoubleHashMap0.put(20, (-1.0));
      double double0 = openIntToDoubleHashMap0.put(573, Double.NaN);
      assertEquals(3, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.put(0, 1471);
      double double0 = openIntToDoubleHashMap0.put(0, Double.NaN);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(1471.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put((-4), 0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      
      openIntToDoubleHashMap0.put(1430, Double.NaN);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1430);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(1978, (-2923.255));
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(64);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put((-1840), (-1.0));
      boolean boolean0 = openIntToDoubleHashMap0.containsKey((-1840));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey((-1268));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      try { 
        openIntToDoubleHashMap_Iterator0.advance();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // iterator exhausted
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2);
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.put(0, 1471);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(1471.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put((-4), 0);
      try { 
        openIntToDoubleHashMap_Iterator0.key();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // map has been modified while iterating
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put((-575), (-575));
      double double0 = openIntToDoubleHashMap0.get((-575));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-575.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
      assertEquals(0, openIntToDoubleHashMap1.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(8, 0);
      openIntToDoubleHashMap0.remove(8);
      double double0 = openIntToDoubleHashMap0.put(0, (-0.1428571423679182));
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }
}
