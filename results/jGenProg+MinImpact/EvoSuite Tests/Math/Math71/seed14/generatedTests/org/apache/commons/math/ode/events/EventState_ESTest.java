/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 13:00:47 GMT 2017
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EventState_ESTest extends EventState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1888.400809022564, 1888.400809022564, 1888.400809022564);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1888.400809022564, 1888.400809022564, (-1));
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted(1888.400809022564, doubleArray0);
      assertEquals(1888.400809022564, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-1, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(2151.359310334678, (-1737.9007063281538), 2151.359310334678);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 2151.359310334678, 2151.359310334678, 743);
      double[] doubleArray0 = new double[1];
      eventState0.reinitializeBegin(2151.359310334678, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(2151.359310334678, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(743, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(Double.NaN, Double.NaN, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 2876);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(2876, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1));
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(754.9174398841933, 754.9174398841933, 754.9174398841933);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 754.9174398841933, 754.9174398841933, (-3227));
      double double0 = eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(754.9174398841933, double0, 0.01);
      assertEquals(-3227, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-482.3135), 1530.3, 1530.3);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1360.439176), 0.0, 737);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(737, eventState0.getMaxIterationCount());
      assertEquals((-1360.439176), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(Double.NaN, Double.NaN, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 2876);
      eventState0.getEventHandler();
      assertFalse(eventState0.stop());
      assertEquals(2876, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(Double.NaN, Double.NaN, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 2876);
      eventState0.getConvergence();
      assertEquals(2876, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, Double.NaN, Double.NaN, 3067);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted((-3194.900685595651), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-1905.2658968), 3568.4, 0);
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin((-1327.81), doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(Double.NaN, Double.NaN, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 2876);
      // Undeclared exception!
      try { 
        eventState0.evaluateStep((StepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.events.EventState", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-0.25), (-0.25), (-0.25));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-405.51075), 0.0, (-255));
      boolean boolean0 = eventState0.reset(0.0, (double[]) null);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-255, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
      assertEquals((-405.51075), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(2151.359310334678, (-1737.9007063281538), 2151.359310334678);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 2151.359310334678, 2151.359310334678, 743);
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(743, eventState0.getMaxIterationCount());
      assertEquals(2151.359310334678, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(937.9, 937.9, 937.9);
      double[] doubleArray0 = new double[5];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-0.25), (-0.25), 0);
      eventState0.stepAccepted((-0.25), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-0.25), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1864.0, 0.0, (-2.185039863261519));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3404.327487637351), (-3404.327487637351), 0);
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(0.0, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals((-3404.327487637351), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-0.25), (-0.25), (-0.25));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-405.51075), 0.0, (-255));
      eventState0.reinitializeBegin(0.0, (double[]) null);
      assertEquals((-405.51075), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(-255, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(2151.359310334678, (-1737.9007063281538), 2151.359310334678);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 2151.359310334678, 2151.359310334678, 743);
      double[] doubleArray0 = new double[1];
      eventState0.reinitializeBegin((-1737.9007063281538), doubleArray0);
      assertEquals(743, eventState0.getMaxIterationCount());
      assertEquals(2151.359310334678, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2668.24863889), (-2668.24863889), (-2668.24863889));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2668.24863889), (-2668.24863889), 1543818335);
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1543818335, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals((-2668.24863889), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(2668.24863889, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, (-767.98014392582), (-767.98014392582));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 19.085536923187668, 366);
      double double0 = eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals(0.0, double0, 0.01);
      assertEquals(19.085536923187668, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(366, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1864.0, 0.0, (-2.185039863261519));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3404.327487637351), (-3404.327487637351), 0);
      double double0 = eventState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals((-3404.327487637351), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 1256.3718);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-1511.0), 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(1511.0, eventState0.getConvergence(), 0.01);
      assertEquals(0, int0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-1.2599210498948732), (-1.2599210498948732), 8);
      eventState0.getEventHandler();
      assertEquals((-1.2599210498948732), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(8, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }
}
