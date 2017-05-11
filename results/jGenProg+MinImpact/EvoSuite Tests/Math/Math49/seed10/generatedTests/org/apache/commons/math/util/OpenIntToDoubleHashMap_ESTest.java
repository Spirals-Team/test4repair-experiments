/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:56:47 GMT 2017
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertFalse(openIntToDoubleHashMap_Iterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertFalse(openIntToDoubleHashMap_Iterator0.hasNext());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, (-1200.7532886717));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put((-5177), 0);
      openIntToDoubleHashMap0.put(1377, 1.7029898543501842E-8);
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      openIntToDoubleHashMap0.put(128, (-7.800414592973399E-9));
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      double double0 = openIntToDoubleHashMap0.remove((-1754));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(20);
      openIntToDoubleHashMap0.put(20, (-1191.2384478308));
      double double0 = openIntToDoubleHashMap0.put(20, 20);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-1191.2384478308), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(1112, (-0.8276761688562593));
      double double0 = openIntToDoubleHashMap0.get(1112);
      assertEquals((-0.8276761688562593), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-3741));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.remove(1024);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1096
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-380));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.put(0, 2285.2017);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2824);
      openIntToDoubleHashMap0.iterator();
      // Undeclared exception!
      openIntToDoubleHashMap0.iterator();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-3365), 0);
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
  public void test12()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1754), 326.466072463173);
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.containsKey((-1754));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -235869786
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
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
  public void test16()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(64);
      openIntToDoubleHashMap0.put(64, 88.12395713);
      openIntToDoubleHashMap0.put(20, 20);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.put(16, 16);
      openIntToDoubleHashMap0.put(12, 0.0);
      assertEquals(3, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, Double.NaN);
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(64);
      openIntToDoubleHashMap0.put(64, 88.12395713);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      double double0 = openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(88.12395713, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(1377, 1.7029898543501842E-8);
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(64);
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(64);
      openIntToDoubleHashMap0.put(64, 88.12395713);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(20);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(20, 20);
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
  public void test24()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(64);
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
  public void test25()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      openIntToDoubleHashMap0.put((-1), (-1));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(20);
      openIntToDoubleHashMap0.put(20, (-1191.2384478308));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(1377, (-2.108820298189199));
      openIntToDoubleHashMap0.put(0, (-1200.7532886717));
      openIntToDoubleHashMap0.put(5, 0);
      openIntToDoubleHashMap0.remove(5);
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      openIntToDoubleHashMap0.remove(0);
      assertEquals(0, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(1377, (-2.108820298189199));
      openIntToDoubleHashMap0.put(0, (-1200.7532886717));
      openIntToDoubleHashMap0.remove(0);
      openIntToDoubleHashMap0.put((-5157), 0);
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.put(12, 0.0);
      openIntToDoubleHashMap0.remove(0);
      openIntToDoubleHashMap0.put(12, 0.0);
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.put(12, 12);
      double double0 = openIntToDoubleHashMap0.put(12, 0.0);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(12.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.put(12, 12);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(12);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(12);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(1112, (-0.8276761688562593));
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1112);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1025);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, Double.NaN);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.get(1636);
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(0, 0);
      openIntToDoubleHashMap0.remove(12);
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(2737, 2737);
      openIntToDoubleHashMap0.put(2047, 0);
      double double0 = openIntToDoubleHashMap0.get(2047);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
  }
}
