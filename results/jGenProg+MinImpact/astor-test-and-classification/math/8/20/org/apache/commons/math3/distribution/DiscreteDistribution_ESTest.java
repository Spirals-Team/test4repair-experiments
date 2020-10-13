/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 20 00:54:29 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(12);
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(0);
      Double double0 = new Double((double) 12);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well19937a0, (List<Pair<Integer, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(12);
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = new Double((double) 12);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well19937a0, (List<Pair<Integer, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Integer integer0 = new Integer(163);
      Double double0 = new Double(0.7857151490483985);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) integer0, double0);
      linkedList0.add(pair0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.offerLast(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(1692);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double(3908.3745971);
      LinkedList<Pair<Short, Double>> linkedList0 = new LinkedList<Pair<Short, Double>>();
      Short short0 = new Short((short)569);
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>((RandomGenerator) null, (List<Pair<Short, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(3908.3745971);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.reseedRandomGenerator(1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(12);
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      DiscreteDistribution<Double> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) well19937a0, (List<Pair<Double, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(132);
      DiscreteDistribution<Float> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) well44497b0, (List<Pair<Float, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer((-15));
      Double double0 = new Double((double) (-15));
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.addFirst(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -15 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DiscreteDistribution<Float> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Float>((List<Pair<Float, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(3908.3745971);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      LinkedList linkedList1 = (LinkedList)discreteDistribution0.sample();
      assertEquals(2, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = new Double(0.7114869149740402);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.offerFirst(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
      Integer integer0 = discreteDistribution0.sample();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(3908.3745971);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-4351));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-4,351)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(3908.3745971);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(1692);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(3908.3745971);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      List<Pair<Object, Double>> list0 = discreteDistribution0.getSamples();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(36);
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(36);
      Integer integer1 = new Integer((-1649));
      Double double0 = new Double((double) 36);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer1, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well19937a0, (List<Pair<Integer, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(integer0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(12);
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(12);
      Double double0 = new Double((double) 12);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well19937a0, (List<Pair<Integer, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Integer) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Well19937a well19937a0 = new Well19937a(1);
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Integer integer0 = new Integer(1);
      Double double0 = new Double((double) 1);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well19937a0, (List<Pair<Integer, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(integer0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Float float0 = new Float((-3351.046886199468));
      Double double0 = new Double((-3351.046886199468));
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.offerFirst(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3,351.047 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(3908.3745971);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator(1692);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}