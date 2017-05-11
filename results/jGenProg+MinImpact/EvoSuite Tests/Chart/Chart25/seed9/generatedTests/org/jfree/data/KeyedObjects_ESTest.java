/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:27:16 GMT 2017
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.KeyedObject;
import org.jfree.data.KeyedObjects;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObjects_ESTest extends KeyedObjects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1918);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      assertTrue(keyedObjects1.equals((Object)keyedObjects0));
      
      keyedObjects1.addObject(integer0, keyedObjects0);
      boolean boolean0 = keyedObjects1.equals(keyedObjects0);
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey(180);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject(180);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.getInteger("", (-137));
      keyedObjects0.setObject(integer0, "");
      keyedObjects0.setObject("4294967159", (Object) null);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertTrue(boolean0);
      assertNotSame(keyedObjects1, keyedObjects0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = new Object();
      keyedObjects0.addObject((Comparable) null, object0);
      keyedObjects0.removeValue(0);
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(455);
      Object object0 = new Object();
      keyedObjects0.setObject(integer0, object0);
      keyedObjects0.removeValue((Comparable) integer0);
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1918);
      keyedObjects0.addObject(integer0, keyedObjects0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.getObject((Comparable) integer0);
      assertSame(keyedObjects1, keyedObjects0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) integer0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      Comparable comparable1 = keyedObjects0.getKey(0);
      assertSame(comparable1, comparable0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.getInteger("", (-137));
      keyedObjects0.setObject(integer0, "");
      int int0 = keyedObjects0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) integer0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      keyedObjects0.setObject("org.jfree.data.KeyedObjects", (Object) null);
      int int0 = keyedObjects0.getIndex("org.jfree.data.KeyedObjects");
      assertEquals(2, keyedObjects0.getItemCount());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject((Comparable) null, (Object) null);
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
  public void test11()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = new Object();
      keyedObjects0.setObject((Comparable) null, object0);
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
  public void test13()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      KeyedObject keyedObject0 = new KeyedObject((Comparable) null, (Object) "8as");
      keyedObjects0.setObject((Comparable) null, keyedObject0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      // Undeclared exception!
      try { 
        keyedObjects0.equals(keyedObjects1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      // Undeclared exception!
      try { 
        keyedObjects0.addObject((Comparable) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject("org.jfree.data.KeyedObjects", (Object) null);
      int int0 = keyedObjects0.getIndex("org.jfree.data.KeyedObjects");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) integer0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      int int0 = keyedObjects0.getIndex("org.jfree.data.KeyedObjects");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey((-765));
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      // Undeclared exception!
      try { 
        keyedObjects0.getIndex("org.jfree.data.KeyedObjects");
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
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject((-1));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.getInteger("", (-137));
      keyedObjects0.setObject(integer0, "");
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      keyedObjects1.addObject(integer0, keyedObjects0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertEquals(1, keyedObjects0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1930);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) keyedObjects0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.addObject(comparable0, integer0);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      keyedObjects1.addObject(integer0, (Object) null);
      boolean boolean0 = keyedObjects1.equals(keyedObjects0);
      assertFalse(keyedObjects0.equals((Object)keyedObjects1));
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      Integer integer0 = new Integer(1918);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      keyedObjects1.addObject(integer0, keyedObjects0);
      boolean boolean0 = keyedObjects1.equals(keyedObjects0);
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals(keyedObjects0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey((-765));
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
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
      Integer integer0 = new Integer(1);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) integer0);
      Comparable comparable0 = keyedObject0.getKey();
      Object object0 = new Object();
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      keyedObjects0.setObject(comparable0, object0);
      assertEquals(1, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(1);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) integer0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      keyedObjects0.setObject("", integer0);
      keyedObjects0.setObject("", integer0);
      assertEquals(2, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey((-765));
      Integer integer0 = new Integer(1);
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      // Undeclared exception!
      try { 
        keyedObjects0.setObject("", integer0);
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
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey((-765));
      keyedObjects0.setObject(comparable0, "org.jfree.data.KeyedObjects");
      String string0 = (String)keyedObjects0.getObject(0);
      assertEquals("org.jfree.data.KeyedObjects", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      String string0 = (String)keyedObjects0.getObject(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      int int0 = keyedObjects0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(455);
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
  public void test36()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject((Comparable) "org.jfree.data.KeyedObjects");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1784));
      keyedObjects0.addObject((Comparable) null, integer0);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      boolean boolean0 = keyedObjects1.equals(keyedObjects0);
      assertFalse(boolean0);
      assertFalse(keyedObjects0.equals((Object)keyedObjects1));
  }
}
