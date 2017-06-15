/*
 * This file was automatically generated by EvoSuite
 * Thu Jan 12 19:17:32 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1472);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted(1472, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1472, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 301);
      double[] doubleArray0 = new double[15];
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(301, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 1.662337662337662, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(1.662337662337662, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, int0);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1472);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1472, int0);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.25, 0.25, 0.25);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.25, 0.25, 23);
      double double0 = eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals(0.25, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(23, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.9092974268256817, 0.9092974268256817, (-2271.3594850522263));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2271.3594850522263), 0.9092974268256817, 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals((-2271.3594850522263), double0, 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0.9092974268256817, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.9640275800758169, 0.9640275800758169, 0.9640275800758169);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.9640275800758169, 0.9640275800758169, 10);
      eventState0.getEventHandler();
      assertEquals(0.9640275800758169, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(10, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 301);
      eventState0.getConvergence();
      assertEquals(301, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-144.43), (-144.43), (-1206));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted(0.0, doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, (-413));
      double[] doubleArray0 = new double[3];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin((-413), doubleArray0);
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
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 301);
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
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 301);
      double[] doubleArray0 = new double[15];
      boolean boolean0 = eventState0.reset(0.0, doubleArray0);
      assertEquals(301, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertFalse(boolean0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1472);
      boolean boolean0 = eventState0.stop();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1472, eventState0.getMaxIterationCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1472);
      double[] doubleArray0 = new double[5];
      eventState0.stepAccepted((-1506.5103809713378), doubleArray0);
      assertEquals(1472, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(2421.6738286588, 2421.6738286588, 2421.6738286588);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 2421.6738286588, 2421.6738286588, (-1));
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(2421.6738286588, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(2421.6738286588, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1395.329259119657, 1764.039177314, 1395.329259119657);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1395.329259119657, 1764.039177314, 0);
      double[] doubleArray0 = new double[5];
      eventState0.reinitializeBegin(1625.0, doubleArray0);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(1764.039177314, eventState0.getConvergence(), 0.01);
      assertEquals(1395.329259119657, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.9640275800758169, 0.9640275800758169, 0.9640275800758169);
      double[] doubleArray0 = new double[4];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.9640275800758169, 0.9640275800758169, 10);
      eventState0.reinitializeBegin((-1292.7), doubleArray0);
      assertEquals(10, eventState0.getMaxIterationCount());
      assertEquals(0.9640275800758169, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 15.874013837363394, 15.874013837363394, (-1215));
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(15.874013837363394, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1215, eventState0.getMaxIterationCount());
      assertEquals(15.874013837363394, double0, 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 800);
      eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(800, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.25, 0.25, 0.25);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.25, 0.25, 23);
      double double0 = eventState0.getEventTime();
      assertFalse(eventState0.stop());
      assertEquals(0.25, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(23, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1307.0, 0.0, (-1));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1), int0);
      assertFalse(eventState0.stop());
      assertEquals(1307.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-3468.7), (-6.0), (-273));
      eventState0.getEventHandler();
      assertFalse(eventState0.stop());
      assertEquals(6.0, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-3468.7), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-273, eventState0.getMaxIterationCount());
  }
}