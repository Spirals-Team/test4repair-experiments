/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 21:34:06 GMT 2017
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
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-487.23360777682075));
      openIntToDoubleHashMap0.put(0, (-487.23360777682075));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      double double0 = openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-487.23360777682075), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-487.23360777682075));
      openIntToDoubleHashMap0.put(0, (-487.23360777682075));
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      openIntToDoubleHashMap0.put(0, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(5.650007086920087E-9);
      openIntToDoubleHashMap0.put((-55), (-55));
      openIntToDoubleHashMap0.containsKey(1010);
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0.0);
      openIntToDoubleHashMap0.put((-700), (-700));
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-487.23360777682075));
      double double0 = openIntToDoubleHashMap0.get(2294);
      assertEquals((-487.23360777682075), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1668), (-1668));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.remove(3000);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2836
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1), (-1));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.put(4, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1581);
      openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.iterator();
      // Undeclared exception!
      openIntToDoubleHashMap0.iterator();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-3006));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.get(571);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 540
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1073741824, 2671.7026868);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = null;
      try {
        openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2398.0);
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
  public void test14()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put((-1564), 0.0);
      openIntToDoubleHashMap0.put(1421, 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertTrue(openIntToDoubleHashMap_Iterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(5.650007086920087E-9);
      openIntToDoubleHashMap0.put(4577, 4577);
      openIntToDoubleHashMap0.put((-55), (-55));
      double double0 = openIntToDoubleHashMap0.put(1010, 5.650007086920087E-9);
      assertEquals(3, openIntToDoubleHashMap0.size());
      assertEquals(5.650007086920087E-9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(13, 13);
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
  public void test17()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put((-1564), 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      openIntToDoubleHashMap_Iterator0.value();
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1268);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, 1268);
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
  public void test19()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
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
  public void test20()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put((-1564), 0.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap_Iterator0.advance();
      int int0 = openIntToDoubleHashMap_Iterator0.key();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals((-1564), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      openIntToDoubleHashMap0.put(0, 179.67726);
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
  public void test22()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      openIntToDoubleHashMap0.put(903, 0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1545), 1.0);
      OpenIntToDoubleHashMap.Iterator openIntToDoubleHashMap_Iterator0 = openIntToDoubleHashMap0.iterator();
      boolean boolean0 = openIntToDoubleHashMap_Iterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2, 2);
      openIntToDoubleHashMap0.put(1769, 1769);
      openIntToDoubleHashMap0.put(2, 0.0);
      double double0 = openIntToDoubleHashMap0.remove(2);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      double double0 = openIntToDoubleHashMap0.remove(3312);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(35, 35);
      openIntToDoubleHashMap0.put(1, 35);
      openIntToDoubleHashMap0.remove(35);
      double double0 = openIntToDoubleHashMap0.put(1, 35);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(35.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(35, 35);
      openIntToDoubleHashMap0.remove(35);
      openIntToDoubleHashMap0.put(0, Double.NaN);
      openIntToDoubleHashMap0.remove(0);
      openIntToDoubleHashMap0.put(0, Double.NaN);
      assertEquals(1, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(35, 2562.68);
      openIntToDoubleHashMap0.put(0, 179.67726);
      openIntToDoubleHashMap0.remove(0);
      double double0 = openIntToDoubleHashMap0.put(0, (-2455.8439269354512));
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(881, 0);
      openIntToDoubleHashMap0.put(0, 0.0);
      openIntToDoubleHashMap0.put(0, 0.0);
      assertEquals(2, openIntToDoubleHashMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(2, 2);
      openIntToDoubleHashMap0.put(1769, 1769);
      openIntToDoubleHashMap0.put((-1299), (-1299));
      double double0 = openIntToDoubleHashMap0.put(2, 0.0);
      assertEquals(3, openIntToDoubleHashMap0.size());
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put((-936), (-936));
      openIntToDoubleHashMap0.remove((-936));
      double double0 = openIntToDoubleHashMap0.put((-936), 0.0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(5.650007086920087E-9);
      openIntToDoubleHashMap0.put((-55), (-55));
      openIntToDoubleHashMap0.put(1010, 5.650007086920087E-9);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(1010);
      assertEquals(2, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(362, 0.0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0.0);
      openIntToDoubleHashMap0.put(0, 0.0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      boolean boolean0 = openIntToDoubleHashMap0.containsKey(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0);
      openIntToDoubleHashMap0.put(362, 0.0);
      openIntToDoubleHashMap0.put(881, 0);
      openIntToDoubleHashMap0.put(0, 0.0);
      assertEquals(3, openIntToDoubleHashMap0.size());
      
      openIntToDoubleHashMap0.put(2452, 2452);
      double double0 = openIntToDoubleHashMap0.get(2452);
      assertEquals(2452.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0);
      openIntToDoubleHashMap0.put(0, Double.NaN);
      double double0 = openIntToDoubleHashMap0.get(0);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(0, 0.0);
      double double0 = openIntToDoubleHashMap0.put(0, 0);
      double double1 = openIntToDoubleHashMap0.get(29);
      assertEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(1581);
      int int0 = openIntToDoubleHashMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put(1, 35);
      double double0 = openIntToDoubleHashMap0.put(1, 35);
      assertEquals(1, openIntToDoubleHashMap0.size());
      assertEquals(35.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
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
  public void test42()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap((-1312), (-1312));
      // Undeclared exception!
      try { 
        openIntToDoubleHashMap0.containsKey(65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 69
         //
         verifyException("org.apache.commons.math.util.OpenIntToDoubleHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap(4);
      OpenIntToDoubleHashMap openIntToDoubleHashMap1 = new OpenIntToDoubleHashMap(openIntToDoubleHashMap0);
      assertEquals(0, openIntToDoubleHashMap1.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      OpenIntToDoubleHashMap openIntToDoubleHashMap0 = new OpenIntToDoubleHashMap();
      openIntToDoubleHashMap0.put((-936), (-936));
      openIntToDoubleHashMap0.remove((-936));
      openIntToDoubleHashMap0.remove((-936));
  }
}
