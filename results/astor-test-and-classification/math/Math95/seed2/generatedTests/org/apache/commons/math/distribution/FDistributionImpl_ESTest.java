/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 22:42:06 GMT 2017
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
        fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 0.0);
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.0, 2.0);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability(2.0);
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1869.33477629573, 1869.33477629573);
      double double0 = fDistributionImpl0.getInitialDomain(0.0);
      assertEquals(1.0010710452273412, double0, 0.01);
      assertEquals(1869.33477629573, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2580.73507526928, 33.0134680107446);
      try { 
        fDistributionImpl0.inverseCumulativeProbability(0.9999999999999971);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Number of iterations=16, maximum iterations=2,147,483,647, initial=1.064, lower bound=0, upper bound=179,769,313,486,231,570,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000,000, final a value=0, final b value=17.064, f(a)=-1, f(b)=0
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
      // Undeclared exception!
      try { 
        fDistributionImpl0.inverseCumulativeProbability((-2114.52829));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0.0 and 1.0, inclusive.
         //
         verifyException("org.apache.commons.math.distribution.AbstractContinuousDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0E-14);
      assertEquals(1.0E-14, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
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
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(930.772152850258);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals(930.772152850258, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals((-1.5232259897857148E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability((-864.814236467755));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(1.0E-14, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1425.8048600845898, 1425.8048600845898);
      // Undeclared exception!
      try { 
        fDistributionImpl0.setDenominatorDegreesOfFreedom((-71.035631361454));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = null;
      try {
        fDistributionImpl0 = new FDistributionImpl((-691.50977482116), (-691.50977482116));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // degrees of freedom must be positive.
         //
         verifyException("org.apache.commons.math.distribution.FDistributionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(776.25, 776.25);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(776.25, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(776.25, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getInitialDomain(1.7976931348623157E308);
      assertEquals((-5.000000000000025E-15), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDomainUpperBound(0.5);
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.getDomainLowerBound(165.227365258211);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0E-14, 1.0E-14);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-14);
      assertEquals(0.4999999999999209, double0, 0.01);
  }
}