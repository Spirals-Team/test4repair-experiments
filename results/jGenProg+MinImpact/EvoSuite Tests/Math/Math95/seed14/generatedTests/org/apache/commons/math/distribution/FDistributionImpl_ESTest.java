/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 12:22:17 GMT 2017
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
        fDistributionImpl0 = new FDistributionImpl((-2.1026444172410488E-4), 0.0);
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
  public void test02()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(4.7421875, 4.7421875);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability((-757.386942));
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
      double double0 = fDistributionImpl0.getInitialDomain(1.7976931348623157E308);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getInitialDomain(1.0E-14);
      assertEquals((-5.000000000000025E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(6.283185307179586, 6.283185307179586);
      double double0 = fDistributionImpl0.getDomainUpperBound(6.283185307179586);
      assertEquals(1.7976931348623157E308, double0, 0.01);
      assertEquals(6.283185307179586, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(6.283185307179586, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDomainLowerBound(1.0E-14);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
      double double0 = fDistributionImpl0.cumulativeProbability(2872.95379);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.7976931348623157E308, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.22683957558318033, 2.1743961811521265E-4);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability(0.22683957558318033);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid endpoint parameters:  lowerBound=0.0 initial=-1.0873163033969537E-4 upperBound=1.7976931348623157E308
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(393.9, 393.9);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(393.9);
      assertEquals(393.9, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(393.9, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
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
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.6899182659531625E-6, 3.6899182659531625E-6);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(3.6899182659531625E-6);
      assertEquals(3.6899182659531625E-6, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability((-2.2361278677248855));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.0, 1.0E-14);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(2.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.6899182659531625E-6, 3.6899182659531625E-6);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(3.6899182659531625E-6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl(1446.51, (-68.0086369429));
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(480.16843619737, 480.16843619737);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(480.16843619737, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(480.16843619737, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.6899182659531625E-6, 1249.4005046);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.9999898554991706);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.0, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals((-4.218847493575595E-15), double0, 0.01);
  }
}