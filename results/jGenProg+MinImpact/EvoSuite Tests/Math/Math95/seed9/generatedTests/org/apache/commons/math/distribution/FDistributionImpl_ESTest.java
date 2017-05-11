/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 13 23:36:51 GMT 2017
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2986.6456387, 2986.6456387);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setDenominatorDegreesOfFreedom(0.0);
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(97.66327430737661, 97.66327430737661);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability((-264.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2986.6456387, 2986.6456387);
      double double0 = fDistributionImpl0.cumulativeProbability(0.0);
      assertEquals(2986.6456387, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2986.6456387, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(57.15623566586292, 57.15623566586292);
      double double0 = fDistributionImpl0.getInitialDomain(57.15623566586292);
      assertEquals(1.036260632652961, double0, 0.01);
      assertEquals(57.15623566586292, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.9999999999999971, 0.9999999999999971);
      fDistributionImpl0.getDomainUpperBound(0.9999999999999971);
      assertEquals(0.9999999999999971, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.9999999999999971, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.getDomainLowerBound(1.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.1743961811521265E-4, 1.0E-15);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(192.59);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-15);
      assertEquals(192.59, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals((-2.731148640577885E-14), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability(1.7976931348623157E308);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(189.79, 1.0E-14);
      assertEquals(1.0E-14, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      
      fDistributionImpl0.setDenominatorDegreesOfFreedom(3.9968028886505635E-15);
      assertEquals(189.79, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(4087.58, 4087.58);
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
  public void test10()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(4087.58, 4087.58);
      double double0 = fDistributionImpl0.cumulativeProbability((-2061.0547166));
      assertEquals(4087.58, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(4087.58, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(189.79, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals(3.9968028886505635E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(189.79, 1.0E-14);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(189.79, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(189.79, 1.0E-14);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setDenominatorDegreesOfFreedom((-438.92023397082994));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl((-3238.0), (-3238.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2986.6456387, 2986.6456387);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(2986.6456387, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2986.6456387, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(4349.864869364628, 4349.864869364628);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(2.1743961811521265E-4);
      assertEquals(0.8987850399574018, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.1743961811521265E-4, 1.0E-15);
      double double0 = fDistributionImpl0.getInitialDomain(2.1743961811521265E-4);
      assertEquals((-5.000000000000003E-16), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.1743961811521265E-4, 1.0E-15);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(2.1743961811521265E-4, double0, 0.01);
  }
}
