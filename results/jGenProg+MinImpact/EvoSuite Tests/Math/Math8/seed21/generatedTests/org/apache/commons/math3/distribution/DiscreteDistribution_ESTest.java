/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 22 17:19:29 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.RandomAdaptorTest;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(0);
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) well19937c0);
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((float) 0);
      Double double0 = new Double(299.341571517313);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) randomAdaptor0, (List<Pair<Float, Double>>) linkedList0);
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

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = new Double(0.02);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.offerLast(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
      Integer integer0 = discreteDistribution0.sample();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Pair<Integer, Double>> linkedList0 = new LinkedList<Pair<Integer, Double>>();
      Double double0 = new Double(0.02);
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>((Integer) null, double0);
      linkedList0.offerLast(pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = new DiscreteDistribution<Integer>((List<Pair<Integer, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(439011738);
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
      RandomAdaptorTest.ConstantGenerator randomAdaptorTest_ConstantGenerator0 = new RandomAdaptorTest.ConstantGenerator(3800.8330620420015);
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Object object0 = new Object();
      Double double0 = new Double(111.93291834);
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) "Dz{", double0);
      linkedList0.add(pair0);
      Pair<Object, Double> pair1 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair1);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) randomAdaptorTest_ConstantGenerator0, (List<Pair<Object, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample(82);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // java.lang.Object
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) null);
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((double) 0);
      Double double0 = new Double(299.341571517313);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) randomAdaptor0, (List<Pair<Float, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.sample();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.random.RandomAdaptor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
      Double double0 = new Double(377.35849056603774);
      Pair<String, Double> pair0 = new Pair<String, Double>("", double0);
      linkedList0.add(pair0);
      DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>((RandomGenerator) null, (List<Pair<String, Double>>) linkedList0);
      // Undeclared exception!
      try { 
        discreteDistribution0.reseedRandomGenerator(0L);
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
      RandomAdaptorTest.ConstantGenerator randomAdaptorTest_ConstantGenerator0 = new RandomAdaptorTest.ConstantGenerator(3800.8330620420015);
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) randomAdaptorTest_ConstantGenerator0, (List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      Well19937a well19937a0 = new Well19937a(intArray0);
      DiscreteDistribution<String> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<String>((RandomGenerator) well19937a0, (List<Pair<String, Double>>) null);
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
      Well19937c well19937c0 = new Well19937c(0);
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) well19937c0);
      LinkedList<Pair<Float, Double>> linkedList0 = new LinkedList<Pair<Float, Double>>();
      Float float0 = new Float((float) 0);
      Double double0 = new Double(299.341571517313);
      Pair<Float, Double> pair0 = new Pair<Float, Double>(float0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>((RandomGenerator) randomAdaptor0, (List<Pair<Float, Double>>) linkedList0);
      Float float1 = discreteDistribution0.sample();
      assertEquals(0.0F, (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RandomAdaptorTest.ConstantGenerator randomAdaptorTest_ConstantGenerator0 = new RandomAdaptorTest.ConstantGenerator(3800.8330620420015);
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Object object0 = new Object();
      Double double0 = new Double(111.93291834);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) randomAdaptorTest_ConstantGenerator0, (List<Pair<Object, Double>>) linkedList0);
      Object object1 = discreteDistribution0.sample();
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Well19937c well19937c0 = new Well19937c(0L);
      LinkedList<Pair<Byte, Double>> linkedList0 = new LinkedList<Pair<Byte, Double>>();
      Byte byte0 = Byte.valueOf((byte)0);
      Double double0 = new Double((-322.4527987384));
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Byte> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) well19937c0, (List<Pair<Byte, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -322.453 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RandomAdaptorTest.ConstantGenerator randomAdaptorTest_ConstantGenerator0 = new RandomAdaptorTest.ConstantGenerator(1.0);
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Object object0 = new Object();
      Double double0 = new Double(111.93291834);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) randomAdaptorTest_ConstantGenerator0, (List<Pair<Object, Double>>) linkedList0);
      try { 
        discreteDistribution0.sample((-2251));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-2,251)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RandomAdaptorTest.ConstantGenerator randomAdaptorTest_ConstantGenerator0 = new RandomAdaptorTest.ConstantGenerator(1.0);
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Object object0 = new Object();
      Double double0 = new Double(111.93291834);
      Pair<Object, Double> pair0 = new Pair<Object, Double>(object0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>((RandomGenerator) randomAdaptorTest_ConstantGenerator0, (List<Pair<Object, Double>>) linkedList0);
      Object[] objectArray0 = discreteDistribution0.sample(82);
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(2560.509762);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((List<Pair<Double, Double>>) linkedList0);
      List<Pair<Double, Double>> list0 = discreteDistribution0.getSamples();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(2560.509762);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((List<Pair<Double, Double>>) linkedList0);
      Double double1 = new Double((-0.6587200438234831));
      double double2 = discreteDistribution0.probability(double1);
      assertEquals(0.0, double2, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(2560.509762);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((List<Pair<Double, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability(double0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(2560.509762);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((List<Pair<Double, Double>>) linkedList0);
      double double1 = discreteDistribution0.probability((Double) null);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double double0 = new Double((-23.02676602549669));
      LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
      Pair<Object, Double> pair0 = new Pair<Object, Double>((Object) null, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Object> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Object>((List<Pair<Object, Double>>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -23.027 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<Pair<Double, Double>> linkedList0 = new LinkedList<Pair<Double, Double>>();
      Double double0 = new Double(2560.509762);
      Pair<Double, Double> pair0 = new Pair<Double, Double>(double0, double0);
      linkedList0.add(pair0);
      DiscreteDistribution<Double> discreteDistribution0 = new DiscreteDistribution<Double>((List<Pair<Double, Double>>) linkedList0);
      discreteDistribution0.reseedRandomGenerator(849);
  }
}
