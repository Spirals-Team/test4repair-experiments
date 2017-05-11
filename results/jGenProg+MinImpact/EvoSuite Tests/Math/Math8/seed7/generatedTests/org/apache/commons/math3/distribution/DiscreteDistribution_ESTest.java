/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 23:48:34 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(1038L);
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double((double) 1038L);
      Pair<Double, Double> pair0 = new Pair<Double, Double>((Double) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) well19937c0, (List<Pair<Double, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-899846483));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-899,846,483)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = new Double(1.0);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
      Integer integer0 = discreteDistribution0.sample();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = new Double(1.0);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(1417);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Long long0 = new Long(3420L);
      Double double0 = new Double(0.0);
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.addFirst(pair1);
      Double double1 = new Double(3213.905);
      Pair<Object, Double> pair2 = new Pair<Object, Double>((Object) linkedList0, double1);
      linkedList0.add(pair2);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(1226);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.util.LinkedList
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(0.9978544390306434);
      Pair<String, Double> pair0 = new Pair<String, Double>(">3D5gIdIJC-S6*6c", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((RandomGenerator) null, (List<Pair<String, Double>>) linkedList0);
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
  public void test05()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(1519.0);
      Pair<Double, Double> pair0 = new Pair<Double, Double>((Double) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) null, (List<Pair<Double, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.reseedRandomGenerator((-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a();
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      DiscreteDistribution<Float> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) well1024a0, (List<Pair<Float, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(2251);
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((RandomGenerator) well19937c0, (List<Pair<Integer, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double((-1490.2322193802927));
      Pair<String, Double> pair0 = new Pair<String, Double>("!@~z", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,490.232 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Byte byte0 = new Byte((byte)2);
      Double double0 = new Double((double) (byte)2);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
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
  public void test11()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Byte byte0 = new Byte((byte)2);
      Double double0 = new Double((double) (byte)2);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.addLast(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(1);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Byte byte0 = new Byte((byte)2);
      Double double0 = new Double((double) (byte)2);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.addLast(pair1);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      Byte byte1 = (Byte)discreteDistribution0.sample();
      assertEquals((byte)2, (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Byte byte0 = new Byte((byte)2);
      Double double0 = new Double((double) (byte)2);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.addLast(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      List<Pair<Object, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = new Double(1108.91774);
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte)0);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(byte0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte)0);
      Double double0 = new Double(1086.2690849583507);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Byte) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(0.5417100252207712);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) linkedList0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability("pKWG");
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(2251);
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      Double double0 = new Double((double) 2251);
      Pair<Long, Double> pair0 = new Pair<Long, Double>((Long) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((RandomGenerator) well19937c0, (List<Pair<Long, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Long) null);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte) (-36));
      Double double0 = new Double(Double.NEGATIVE_INFINITY);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) null, (List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -\u221E is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Byte byte0 = new Byte((byte)2);
      Double double0 = new Double((double) (byte)2);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(pair0);
      linkedList0.addLast(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator((byte)2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
