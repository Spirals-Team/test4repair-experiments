/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 23:45:14 GMT 2017
 */

package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.statistics.MeanAndStandardDeviation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MeanAndStandardDeviation_ESTest extends MeanAndStandardDeviation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(311.0, 311.0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      Number number0 = meanAndStandardDeviation0.getStandardDeviation();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(1239.8923640445234, (-2519.4));
      Double double0 = (Double)meanAndStandardDeviation0.getStandardDeviation();
      assertEquals((-2519.4), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(0.0, 0.0);
      Double double0 = (Double)meanAndStandardDeviation0.getStandardDeviation();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(490.679027217452, 3997.095667971411);
      Double double0 = (Double)meanAndStandardDeviation0.getStandardDeviation();
      assertEquals(3997.095667971411, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) null, (Number) null);
      Number number0 = meanAndStandardDeviation0.getMean();
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Float float0 = new Float((-1.0F));
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation((Number) float0, (Number) float0);
      Float float1 = (Float)meanAndStandardDeviation0.getMean();
      assertEquals((-1.0F), (float)float1, 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(0.0, 1.0);
      Double double0 = (Double)meanAndStandardDeviation0.getMean();
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(2533.4147572, 1.0);
      Double double0 = (Double)meanAndStandardDeviation0.getStandardDeviation();
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation((Number) double0, (Number) double0);
      meanAndStandardDeviation1.getMean();
      assertFalse(meanAndStandardDeviation1.equals((Object)meanAndStandardDeviation0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(1.0, 1.0);
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation(1.0, 3997.095667971411);
      boolean boolean0 = meanAndStandardDeviation1.equals(meanAndStandardDeviation0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(2533.4147572, 1.0);
      Double double0 = (Double)meanAndStandardDeviation0.getStandardDeviation();
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation((Number) double0, (Number) double0);
      MeanAndStandardDeviation meanAndStandardDeviation2 = new MeanAndStandardDeviation((Number) double0, (Number) double0);
      boolean boolean0 = meanAndStandardDeviation1.equals(meanAndStandardDeviation2);
      assertFalse(meanAndStandardDeviation2.equals((Object)meanAndStandardDeviation0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(2533.4147572, 1.0);
      boolean boolean0 = meanAndStandardDeviation0.equals(meanAndStandardDeviation0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(2533.4147572, 1.0);
      Integer integer0 = new Integer((-1441));
      boolean boolean0 = meanAndStandardDeviation0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MeanAndStandardDeviation meanAndStandardDeviation0 = new MeanAndStandardDeviation(2533.4147572, 1.0);
      Double double0 = (Double)meanAndStandardDeviation0.getStandardDeviation();
      MeanAndStandardDeviation meanAndStandardDeviation1 = new MeanAndStandardDeviation((Number) double0, (Number) double0);
      boolean boolean0 = meanAndStandardDeviation1.equals(meanAndStandardDeviation0);
      assertFalse(boolean0);
  }
}