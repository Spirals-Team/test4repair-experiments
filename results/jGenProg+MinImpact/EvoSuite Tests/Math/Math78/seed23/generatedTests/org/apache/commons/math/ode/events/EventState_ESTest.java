/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 25 05:40:13 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem(1427.385, 1427.385, 1427.385);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1427.385, 0.9, (-2028));
      double[] doubleArray0 = new double[1];
      eventState0.stepAccepted(1493.8, doubleArray0);
      assertEquals(-2028, eventState0.getMaxIterationCount());
      assertEquals(1427.385, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0.9, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      eventState0.reinitializeBegin(0, (double[]) null);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 46.3968, 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(46.3968, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 437.61598493147807, 437.61598493147807, 12);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(437.61598493147807, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(12, int0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1925.15274551062, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1730.92219748, 0.0, 979);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(979, eventState0.getMaxIterationCount());
      assertEquals(1730.92219748, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(4185.3567571, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1436.32522849898), 0.0, 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals((-1436.32522849898), double0, 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1668.973587, 1668.973587, 1668.973587);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1668.973587, 1668.973587, 0);
      eventState0.getEventHandler();
      assertFalse(eventState0.stop());
      assertEquals(1668.973587, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1925.15274551062, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1730.92219748, 0.0, 979);
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1730.92219748, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(979, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin(0, doubleArray0);
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
      StepProblem stepProblem0 = new StepProblem(1925.15274551062, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1730.92219748, 0.0, 979);
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
  public void test10()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1925.15274551062, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1730.92219748, 0.0, 979);
      double[] doubleArray0 = new double[0];
      boolean boolean0 = eventState0.reset(1925.15274551062, doubleArray0);
      assertEquals(1730.92219748, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertFalse(boolean0);
      assertEquals(979, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1925.15274551062, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1730.92219748, 0.0, 979);
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(0.0, doubleArray0);
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(1730.92219748, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(979, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1925.15274551062, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1730.92219748, 0.0, 979);
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted(1.0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(0.0, eventState0.getConvergence(), 0.01);
      assertEquals(979, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1730.92219748, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, (-1952.814350996078), (-1952.814350996078));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1952.814350996078), (-1952.814350996078), (-1222));
      double[] doubleArray0 = new double[2];
      eventState0.reinitializeBegin((-1222), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-1952.814350996078), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1222, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1668.973587, 1668.973587, 1668.973587);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1668.973587, 1668.973587, 0);
      double[] doubleArray0 = new double[0];
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(1668.973587, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, (-1952.814350996078), (-1952.814350996078));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1952.814350996078), (-1952.814350996078), (-1222));
      double double0 = eventState0.getConvergence();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-1222, eventState0.getMaxIterationCount());
      assertEquals(1952.814350996078, double0, 0.01);
      assertEquals((-1952.814350996078), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-803.27544649206), (-803.27544649206), 248.338225453036);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1234));
      eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-1234, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1668.973587, 1668.973587, 1668.973587);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1668.973587, 1668.973587, 0);
      double double0 = eventState0.getEventTime();
      assertEquals(1668.973587, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-803.27544649206), (-803.27544649206), 248.338225453036);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, (-1234));
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals((-1234), int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-6817.396645), (-6817.396645), (-3286));
      eventState0.getEventHandler();
      assertEquals(-3286, eventState0.getMaxIterationCount());
      assertEquals((-6817.396645), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }
}
