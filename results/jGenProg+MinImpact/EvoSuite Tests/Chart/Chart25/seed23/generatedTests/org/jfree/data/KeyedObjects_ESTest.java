/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 12 13:37:26 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.KeyedObjects;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObjects_ESTest extends KeyedObjects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject("ag=kN!~]pw'5L{19", "ag=kN!~]pw'5L{19");
      KeyedObjects keyedObjects1 = new KeyedObjects();
      boolean boolean0 = keyedObjects1.equals(keyedObjects0);
      assertFalse(boolean0);
      assertFalse(keyedObjects0.equals((Object)keyedObjects1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey(2832);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject(3675);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      keyedObjects0.removeValue(0);
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals(keyedObjects0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = new Object();
      keyedObjects0.setObject((Comparable) null, object0);
      int int0 = keyedObjects0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      // Undeclared exception!
      try { 
        keyedObjects0.setObject((Comparable) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = new Object();
      keyedObjects0.setObject((Comparable) null, object0);
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject((Comparable) null, (Object) null);
      // Undeclared exception!
      try { 
        keyedObjects0.getObject((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(0);
      keyedObjects0.addObject((Comparable) null, integer0);
      // Undeclared exception!
      try { 
        keyedObjects0.getIndex((Comparable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject((Comparable) null, integer0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      // Undeclared exception!
      try { 
        keyedObjects0.equals(keyedObjects1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      // Undeclared exception!
      try { 
        keyedObjects0.addObject((Comparable) null, keyedObjects0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      Integer integer1 = new Integer((-1744));
      int int0 = keyedObjects0.getIndex(integer1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      int int0 = keyedObjects0.getIndex(integer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject((-2123));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(0);
      keyedObjects0.setObject((Comparable) null, integer0);
      Integer integer1 = (Integer)keyedObjects0.getObject(0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((-2002));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      int int0 = keyedObjects0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-883));
      keyedObjects0.setObject(integer0, integer0);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      Object object0 = new Object();
      keyedObjects1.setObject(integer0, object0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, (Object) null);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      keyedObjects1.setObject(integer0, "");
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertEquals(1, keyedObjects0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, (Object) null);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertEquals(1, keyedObjects0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      keyedObjects1.removeValue((Comparable) integer0);
      keyedObjects1.setObject((Comparable) null, integer0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertEquals(1, keyedObjects0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = new Object();
      boolean boolean0 = keyedObjects0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      keyedObjects1.removeValue((Comparable) integer0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertEquals(1, keyedObjects0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      List list0 = keyedObjects0.getKeys();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      List list0 = keyedObjects0.getKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      Integer integer1 = new Integer((-1744));
      keyedObjects0.setObject(integer1, keyedObjects0);
      int int0 = keyedObjects0.getIndex(integer1);
      assertEquals(2, keyedObjects0.getItemCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey((-872));
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      keyedObjects0.setObject(integer0, integer0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertEquals(1, keyedObjects0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-872));
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((Comparable) integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey(0);
      Integer integer0 = (Integer)keyedObjects0.getObject(comparable0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.valueOf(2366);
      keyedObjects0.addObject(integer0, integer0);
      Comparable comparable0 = keyedObjects0.getKey(0);
      Integer integer1 = (Integer)keyedObjects0.getObject(comparable0);
      assertEquals(2366, (int)integer1);
  }
}
