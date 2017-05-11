/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 20:02:48 GMT 2017
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.RandomAdaptorTest;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HypergeometricDistribution_ESTest extends HypergeometricDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1720));
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) mersenneTwister0, 1308, 40, 2);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(2);
      assertEquals(9.125176361581606E-4, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      hypergeometricDistribution0.cumulativeProbability(292, 292);
      assertEquals(83.34701857282502, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1720));
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) mersenneTwister0, 1308, 40, 2);
      hypergeometricDistribution0.sample(1453);
      assertEquals(0.06116207951070336, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      int int0 = hypergeometricDistribution0.getSupportUpperBound();
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, int0);
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      int int0 = hypergeometricDistribution0.getSupportLowerBound();
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0, int0);
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      int int0 = hypergeometricDistribution0.getSampleSize();
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, int0);
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      int int0 = hypergeometricDistribution0.getNumberOfSuccesses();
      assertEquals(0, int0);
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RandomAdaptorTest.ConstantGenerator randomAdaptorTest_ConstantGenerator0 = new RandomAdaptorTest.ConstantGenerator((-1.0));
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) randomAdaptorTest_ConstantGenerator0, 1011, 1011, 1011);
      double double0 = hypergeometricDistribution0.calculateNumericalVariance();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1011.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(268, 2, 2);
      double double0 = hypergeometricDistribution0.calculateNumericalVariance();
      assertEquals(0.01475850664504077, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      hypergeometricDistribution0.sample();
      // Undeclared exception!
      hypergeometricDistribution0.upperCumulativeProbability(92);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      double double0 = hypergeometricDistribution0.getNumericalVariance();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1485, 1485, 1485);
      double double0 = hypergeometricDistribution0.probability(1485);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Well512a well512a0 = new Well512a(1L);
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well512a0, 5339, 3361, 1695);
      // Undeclared exception!
      hypergeometricDistribution0.cumulativeProbability(1057);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(3883, 529, 529);
      double double0 = hypergeometricDistribution0.cumulativeProbability(3883);
      assertEquals(72.06824620139068, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1506, 1506, 1506);
      double double0 = hypergeometricDistribution0.cumulativeProbability((-671));
      assertEquals(1506.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister((-1720));
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) mersenneTwister0, 1308, 40, 2);
      double double0 = hypergeometricDistribution0.getNumericalMean();
      assertEquals(0.06116207951070336, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister();
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) mersenneTwister0, 1049, 1461, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (1,461) must be less than or equal to population size (1,049)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[1];
      ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) iSAACRandom0, 822, (-2878), (-789));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-2,878)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      double double0 = hypergeometricDistribution0.getNumericalMean();
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      int int0 = hypergeometricDistribution0.getPopulationSize();
      assertEquals(83.34701857282502, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1023, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1506, 1506, 1506);
      int int0 = hypergeometricDistribution0.getNumberOfSuccesses();
      assertEquals(1506.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1506, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1032, 1032, 1032);
      int int0 = hypergeometricDistribution0.getSupportLowerBound();
      assertEquals(1032, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      int int0 = hypergeometricDistribution0.getSampleSize();
      assertEquals(83.34701857282502, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(292, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(967, 967, 967);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(964);
      assertEquals(967.0, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      double double0 = hypergeometricDistribution0.upperCumulativeProbability(5250);
      assertEquals(83.34701857282502, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      double double0 = hypergeometricDistribution0.probability(1540);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      double double0 = hypergeometricDistribution0.probability((-601));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MersenneTwister mersenneTwister0 = new MersenneTwister(1);
      RandomAdaptor randomAdaptor0 = new RandomAdaptor((RandomGenerator) mersenneTwister0);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) randomAdaptor0, 1, 1, 5250);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (5,250) must be less than or equal to population size (1)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(250, 1485, 1485);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (1,485) must be less than or equal to population size (250)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Well1024a well1024a0 = new Well1024a((-1718L));
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well1024a0, 1, 1, (-1156));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,156)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution(2478, (-3), (-3));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-3)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Well44497b well44497b0 = new Well44497b(1506);
      HypergeometricDistribution hypergeometricDistribution0 = null;
      try {
        hypergeometricDistribution0 = new HypergeometricDistribution((RandomGenerator) well44497b0, 0, 0, 1506);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (0)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1540, 0, 0);
      boolean boolean0 = hypergeometricDistribution0.isSupportConnected();
      assertEquals(1540, hypergeometricDistribution0.getPopulationSize());
      assertEquals(0, hypergeometricDistribution0.getNumberOfSuccesses());
      assertTrue(boolean0);
      assertEquals(0, hypergeometricDistribution0.getSampleSize());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      int int0 = hypergeometricDistribution0.sample();
      //  // Unstable assertion: assertEquals(92, int0);
      
      double double0 = hypergeometricDistribution0.getNumericalVariance();
      //  // Unstable assertion: assertEquals(42.59889105523388, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(1023, 292, 292);
      int int0 = hypergeometricDistribution0.getSupportUpperBound();
      assertEquals(83.34701857282502, hypergeometricDistribution0.getNumericalMean(), 0.01);
      assertEquals(292, int0);
  }
}