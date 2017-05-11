/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 01:18:42 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObjects2D_ESTest extends KeyedObjects2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(243);
      keyedObjects2D0.removeObject(integer0, "org.jfree.data.KeyedObjects2D");
      keyedObjects2D0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.valueOf(770);
      Integer integer1 = Integer.valueOf((-1079));
      keyedObjects2D0.addObject(integer0, integer1, integer1);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      assertEquals(2, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(770);
      Integer integer1 = Integer.getInteger("#d#TJA}Bg", 1664);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      Integer integer2 = (Integer)keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer1);
      assertNull(integer2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.valueOf(770);
      Integer integer1 = Integer.valueOf((-1079));
      keyedObjects2D0.addObject(integer0, integer1, integer1);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      Integer integer2 = (Integer)keyedObjects2D0.getObject((Comparable) integer0, (Comparable) integer0);
      assertEquals(770, (int)integer2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(770);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      keyedObjects2D0.removeRow((Comparable) integer0);
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(0);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      keyedObjects2D0.removeRow(0);
      assertEquals(0, keyedObjects2D0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(243);
      keyedObjects2D0.removeObject(integer0, "org.jfree.data.KeyedObjects2D");
      keyedObjects2D0.removeColumn(0);
      assertEquals(0, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.addObject(keyedObjects0, (Comparable) null, (Comparable) null);
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.addObject(keyedObjects0, (Comparable) null, (Comparable) null);
      int int0 = keyedObjects2D0.getRowIndex((Comparable) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      Integer integer0 = new Integer(1);
      keyedObjects2D0.addObject(object0, integer0, (Comparable) null);
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      keyedObjects2D0.getRowIndex((Comparable) null);
      assertEquals(1, keyedObjects2D0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      Comparable comparable0 = keyedObjects2D0.getColumnKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(243);
      keyedObjects2D0.removeObject(integer0, "org.jfree.data.KeyedObjects2D");
      Comparable comparable0 = keyedObjects2D0.getColumnKey(0);
      assertEquals("org.jfree.data.KeyedObjects2D", comparable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(770);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      int int0 = keyedObjects2D0.getColumnIndex(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      keyedObjects2D0.addObject("", "", "");
      Comparable comparable0 = keyedObjects2D0.getRowKey(1);
      int int0 = keyedObjects2D0.getColumnIndex(comparable0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.addObject(keyedObjects0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.setObject(keyedObjects0, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow((-406));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(1577);
      keyedObjects2D0.removeObject(integer0, integer0);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((Comparable) "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn((-1458));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getRowKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.addObject(keyedObjects0, (Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject((Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getObject((-462), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getColumnKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.valueOf(479);
      keyedObjects2D0.addObject("", "", integer0);
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      // Undeclared exception!
      try { 
        keyedObjects2D0.equals(keyedObjects2D1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      // Undeclared exception!
      try { 
        keyedObjects2D0.addObject(keyedObjects0, (Comparable) null, (Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(0);
      keyedObjects2D0.addObject(keyedObjects0, integer0, integer0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects2D0.getObject(0, 0);
      assertSame(keyedObjects1, keyedObjects0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Object object0 = new Object();
      Integer integer0 = new Integer(1);
      keyedObjects2D0.addObject(object0, integer0, (Comparable) null);
      Object object1 = keyedObjects2D0.getObject(0, 0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(243);
      int int0 = keyedObjects2D0.getRowIndex(integer0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getColumnKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      List list0 = keyedObjects2D0.getColumnKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      int int0 = keyedObjects2D0.getRowCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(796);
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      keyedObjects2D1.removeObject(integer0, integer0);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(796);
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      keyedObjects2D1.removeObject(integer0, integer0);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      boolean boolean0 = keyedObjects2D1.equals(keyedObjects2D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(796);
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      keyedObjects2D1.removeObject(integer0, integer0);
      keyedObjects2D0.setObject(integer0, integer0, integer0);
      keyedObjects2D1.removeColumn((Comparable) integer0);
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
      assertTrue(keyedObjects2D1.equals((Object)keyedObjects2D0));
      
      Integer integer0 = new Integer(3598);
      Object object0 = new Object();
      keyedObjects2D0.setObject(object0, "@v]+nEsaXOL54N_C>3V", integer0);
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertFalse(keyedObjects2D1.equals((Object)keyedObjects2D0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.valueOf(770);
      boolean boolean0 = keyedObjects2D0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      boolean boolean0 = keyedObjects2D0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = Integer.getInteger("[s)MK)QvsM", 672);
      Object object0 = keyedObjects2D0.getObject((Comparable) integer0, (Comparable) "[s)MK)QvsM");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      keyedObjects2D0.removeObject((Comparable) null, (Comparable) null);
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(243);
      keyedObjects2D0.removeObject(integer0, "org.jfree.data.KeyedObjects2D");
      keyedObjects2D0.removeColumn((Comparable) "org.jfree.data.KeyedObjects2D");
      KeyedObjects2D keyedObjects2D1 = (KeyedObjects2D)keyedObjects2D0.clone();
      Comparable comparable0 = keyedObjects2D0.getRowKey(0);
      keyedObjects2D0.setObject(integer0, comparable0, integer0);
      assertEquals(1, keyedObjects2D0.getRowCount());
      
      keyedObjects2D1.removeColumn(0);
      boolean boolean0 = keyedObjects2D1.equals(keyedObjects2D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      Integer integer0 = new Integer(770);
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeRow((Comparable) integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.removeColumn(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey((-1));
      int int0 = keyedObjects2D0.getColumnIndex(comparable0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      // Undeclared exception!
      try { 
        keyedObjects2D0.getRowKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
      List list0 = keyedObjects2D0.getRowKeys();
      assertEquals(0, list0.size());
  }
}
