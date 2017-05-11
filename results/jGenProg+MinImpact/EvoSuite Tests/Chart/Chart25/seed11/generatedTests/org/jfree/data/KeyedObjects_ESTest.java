/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 22:40:01 GMT 2017
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
      Integer integer0 = new Integer(632);
      keyedObjects0.setObject(integer0, integer0);
      keyedObjects0.removeValue(0);
      Object object0 = keyedObjects0.getObject(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.getInteger("org.jfree.data.KeyedObject", 1);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) integer0);
      keyedObjects0.setObject(integer0, integer0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.removeValue(comparable0);
      assertSame(integer0, comparable0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals(keyedObjects0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      int int0 = keyedObjects0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject((Comparable) null, keyedObjects0);
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
  public void test05()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
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
  public void test06()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((-3226));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
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
  public void test09()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject((Comparable) null, (Object) null);
      Object object0 = keyedObjects0.getObject(0);
      // Undeclared exception!
      try { 
        keyedObjects0.addObject((Comparable) null, object0);
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
      Integer integer0 = new Integer((-1));
      keyedObjects0.addObject(integer0, keyedObjects0);
      Comparable comparable0 = keyedObjects0.getKey(0);
      keyedObjects0.setObject(comparable0, comparable0);
      assertEquals(1, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(3789);
      Object object0 = new Object();
      keyedObjects0.addObject(integer0, object0);
      Integer integer1 = new Integer(953);
      int int0 = keyedObjects0.getIndex(integer1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1));
      keyedObjects0.addObject(integer0, keyedObjects0);
      Comparable comparable0 = keyedObjects0.getKey(0);
      int int0 = keyedObjects0.getIndex(comparable0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject((-511));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(33);
      keyedObjects0.addObject(integer0, keyedObjects0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.getObject(0);
      assertSame(keyedObjects1, keyedObjects0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      int int0 = keyedObjects0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-659));
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) keyedObjects0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.setObject(comparable0, keyedObject0);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      
      keyedObjects1.addObject(integer0, keyedObject0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertTrue(keyedObjects1.equals((Object)keyedObjects0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.valueOf((-647));
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) keyedObjects0);
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.setObject(comparable0, keyedObject0);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      Integer integer1 = new Integer(0);
      KeyedObject keyedObject1 = new KeyedObject((Comparable) integer1, (Object) "X=bv[iBp");
      Comparable comparable1 = keyedObject1.getKey();
      keyedObjects1.addObject(comparable1, integer1);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.valueOf((-647));
      KeyedObjects keyedObjects1 = new KeyedObjects();
      assertTrue(keyedObjects1.equals((Object)keyedObjects0));
      
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) "org.jfree.data.KeyedObjects");
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects1.addObject(comparable0, integer0);
      keyedObjects0.addObject(integer0, keyedObject0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      KeyedObjects keyedObjects1 = new KeyedObjects();
      keyedObjects0.addObject((Comparable) null, (Object) null);
      keyedObjects1.addObject((Comparable) null, keyedObjects0);
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
  public void test21()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.valueOf((-647));
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) "org.jfree.data.KeyedObjects");
      Comparable comparable0 = keyedObject0.getKey();
      boolean boolean0 = keyedObjects0.equals(comparable0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      KeyedObjects keyedObjects1 = new KeyedObjects();
      assertTrue(keyedObjects1.equals((Object)keyedObjects0));
      
      Integer integer0 = new Integer(0);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) "");
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects1.addObject(comparable0, integer0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer(3789);
      Object object0 = new Object();
      keyedObjects0.addObject(integer0, object0);
      keyedObjects0.clone();
      assertEquals(1, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.clone();
      assertTrue(keyedObjects1.equals((Object)keyedObjects0));
      
      Object object0 = new Object();
      keyedObjects0.setObject((Comparable) null, object0);
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      List list0 = keyedObjects0.getKeys();
      Integer integer0 = new Integer(0);
      KeyedObject keyedObject0 = new KeyedObject((Comparable) integer0, (Object) "");
      Comparable comparable0 = keyedObject0.getKey();
      keyedObjects0.addObject(comparable0, integer0);
      Integer integer1 = new Integer((-6));
      Object object0 = new Object();
      keyedObjects0.addObject(integer1, object0);
      keyedObjects0.addObject(integer1, list0);
      assertEquals(2, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable comparable0 = keyedObjects0.getKey(0);
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = keyedObjects0.getObject(1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1));
      keyedObjects0.addObject(integer0, keyedObjects0);
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.getObject((Comparable) integer0);
      assertSame(keyedObjects0, keyedObjects1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1));
      KeyedObjects keyedObjects1 = (KeyedObjects)keyedObjects0.getObject((Comparable) integer0);
      assertNull(keyedObjects1);
  }
}
