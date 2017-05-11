/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 20:32:13 GMT 2017
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.Incrementor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Incrementor_ESTest extends Incrementor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor();
      incrementor0.incrementCount((-534));
      assertEquals(0, incrementor0.getMaximalCount());
      assertEquals(0, incrementor0.getCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor();
      boolean boolean0 = incrementor0.canIncrement();
      assertEquals(0, incrementor0.getMaximalCount());
      assertEquals(0, incrementor0.getCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor();
      int int0 = incrementor0.getMaximalCount();
      assertEquals(0, int0);
      assertEquals(0, incrementor0.getCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(1915);
      int int0 = incrementor0.getMaximalCount();
      assertEquals(0, incrementor0.getCount());
      assertEquals(1915, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(454);
      incrementor0.incrementCount();
      int int0 = incrementor0.getCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(1915);
      incrementor0.incrementCount(1915);
      // Undeclared exception!
      try { 
        incrementor0.incrementCount(1915);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1,915) exceeded
         //
         verifyException("org.apache.commons.math.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(0, (Incrementor.MaxCountExceededCallback) null);
      // Undeclared exception!
      try { 
        incrementor0.incrementCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(1, (Incrementor.MaxCountExceededCallback) null);
      incrementor0.incrementCount(1);
      // Undeclared exception!
      try { 
        incrementor0.incrementCount(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(1915);
      boolean boolean0 = incrementor0.canIncrement();
      assertTrue(boolean0);
      assertEquals(0, incrementor0.getCount());
      assertEquals(1915, incrementor0.getMaximalCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor((-1));
      boolean boolean0 = incrementor0.canIncrement();
      assertFalse(boolean0);
      assertEquals(-1, incrementor0.getMaximalCount());
      assertEquals(0, incrementor0.getCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor((-2277));
      int int0 = incrementor0.getMaximalCount();
      assertEquals((-2277), int0);
      assertEquals(0, incrementor0.getCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(454);
      int int0 = incrementor0.getCount();
      assertEquals(0, int0);
      assertEquals(454, incrementor0.getMaximalCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor();
      // Undeclared exception!
      try { 
        incrementor0.incrementCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor(1, (Incrementor.MaxCountExceededCallback) null);
      incrementor0.setMaximalCount(1);
      assertEquals(1, incrementor0.getMaximalCount());
      assertEquals(0, incrementor0.getCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Incrementor incrementor0 = new Incrementor((-1));
      incrementor0.resetCount();
      assertEquals(-1, incrementor0.getMaximalCount());
      assertEquals(0, incrementor0.getCount());
  }
}
