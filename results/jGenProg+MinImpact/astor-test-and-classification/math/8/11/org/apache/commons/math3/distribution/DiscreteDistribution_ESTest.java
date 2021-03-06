/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 14 21:53:59 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.TestRandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(1.0);
      Pair<String, Double> pair0 = new Pair<String, Double>("#", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-259497957));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-259,497,957)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(1);
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Object object0 = new Object();
      Double double0 = new Double((double) 1);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) well1024a0, (List<Pair<Object, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator(1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestRandomGenerator testRandomGenerator0 = new TestRandomGenerator();
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Double double0 = new Double(0.7385725872235724);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>((Byte) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) testRandomGenerator0, (List<Pair<Byte, Double>>) linkedList0);
      Byte byte0 = discreteDistribution0.sample();
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISAACRandom iSAACRandom0 = new ISAACRandom(0L);
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double((double) 1822);
      Pair<Double, Double> pair0 = new Pair<Double, Double>((Double) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((RandomGenerator) iSAACRandom0, (List<Pair<Double, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(279);
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
      Object object0 = new Object();
      Double double0 = new Double((double) 1);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
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
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
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
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) null);
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
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = new Byte((byte) (-67));
      Double double0 = new Double((double) (byte) (-67));
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -67 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) null);
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
      Double double0 = new Double(5321.8586539293);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) "P", double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
      String string0 = (String)discreteDistribution0.sample();
      assertEquals("P", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Pair<Long, Double>> linkedList0 = new LinkedList<Pair<Long, Double>>();
      Long long0 = new Long(0L);
      Double double0 = new Double(1.0707499980926514);
      Pair<Long, Double> pair0 = new Pair<Long, Double>(long0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Long> discreteDistribution0 = new DiscreteDistribution<Long>((List<Pair<Long, Double>>) linkedList0);
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
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(1.0);
      Pair<String, Double> pair0 = new Pair<String, Double>("#", double0);
      linkedList0.add(pair0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      String[] stringArray0 = discreteDistribution0.sample(280);
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(1.0);
      Pair<String, Double> pair0 = new Pair<String, Double>("#", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      List<Pair<String, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(1.0);
      Pair<String, Double> pair0 = new Pair<String, Double>("#", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability("#");
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a(1);
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Object object0 = new Object();
      Double double0 = new Double((double) 1);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) well1024a0, (List<Pair<Object, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Object) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(1.0);
      Pair<String, Double> pair0 = new Pair<String, Double>("#", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability("/xS085('n qd+6c>^");
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister((-3236L));
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((float) (-3236L));
      Double double0 = new Double((-1111.06458667));
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) mersenneTwister0, (List<Pair<Float, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1,111.065 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Double double0 = new Double(0.45999603063091077);
      Long long0 = new Long(103L);
      Pair<Double, Long> pair0 = new Pair<Double, Long>(double0, long0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>((Object) pair0, double0);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) null, (List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.reseedRandomGenerator((-759L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((List<Pair<String, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }
}
