/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 21:38:54 GMT 2017
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl((-1839.3), (-1854.6902710907598));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.00115079923065875, 1098.709);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.00115079923065875);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability((-5.000000000000003E-16));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(460.9, 460.9);
      double double0 = fDistributionImpl0.cumulativeProbability((-25.262762364579405), (-25.262762364579405));
      assertEquals(460.9, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(460.9, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1095.757074910793, 1.7976931348623157E308);
      double double0 = fDistributionImpl0.getInitialDomain(1095.757074910793);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1095.757074910793, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
      double double0 = fDistributionImpl0.getInitialDomain(1.0E-15);
      assertEquals((-5.000000000000003E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
      double double0 = fDistributionImpl0.getDomainUpperBound(1.7976931348623157E308);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0373472660934042, 1.0373472660934042);
      double double0 = fDistributionImpl0.getDomainLowerBound(1.0373472660934042);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0373472660934042, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0373472660934042, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.1787469513189555, 1.1787469513189555);
      assertEquals(1.1787469513189555, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0E-15);
      assertEquals(1.1787469513189555, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setDenominatorDegreesOfFreedom((-884.2860458007306));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.0, 2.0);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(2.0);
      assertEquals(2.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(2.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0373472660934042, 1.0373472660934042);
      double double0 = fDistributionImpl0.cumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0373472660934042, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0373472660934042, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0373472660934042, 1.0373472660934042);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0373472660934042);
      assertEquals(0.5059850453074927, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.1787469513189555, 1.1787469513189555);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(1.1787469513189555, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.1787469513189555, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-15, 1.0E-15);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(1.0E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl(2.0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(460.9, 460.9);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setNumeratorDegreesOfFreedom(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0373472660934042, 1.0373472660934042);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0373472660934042, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0373472660934042, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }
}
