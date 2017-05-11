/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 20:46:44 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem((-1.2599210498948732), (-1.2599210498948732), (-1.2599210498948732));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1.2599210498948732), (-1.2599210498948732), (-2068));
      double[] doubleArray0 = new double[2];
      eventState0.stepAccepted(2452.372, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-2068, eventState0.getMaxIterationCount());
      assertEquals((-1.2599210498948732), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1.2599210498948732), (-1.2599210498948732), (-1.2599210498948732));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1.2599210498948732), (-1.2599210498948732), (-2068));
      double[] doubleArray0 = new double[2];
      eventState0.reinitializeBegin((-1.2599210498948732), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2068, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals((-1.2599210498948732), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-4287.1), (-4287.1), (-4287.1));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0, int0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, (-2312.8623137), 1417);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(2312.8623137, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1417, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-95.93716693), 4127.0, 4127.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 4127.0, 4127.0, 0);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(4127.0, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-1.2599210498948732), (-1.2599210498948732), (-1.2599210498948732));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1.2599210498948732), (-1.2599210498948732), (-2068));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals((-1.2599210498948732), double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2068, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-976.80448));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-976.80448), (-2145930640));
      eventState0.getEventHandler();
      assertEquals(-2145930640, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(976.80448, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1823.99932, 1823.99932, (-2237));
      // Undeclared exception!
      try { 
        eventState0.stepAccepted((-2237), (double[]) null);
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
      EventState eventState0 = new EventState((EventHandler) null, 12.0, 12.0, (-1574));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin((-1574), doubleArray0);
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
      StepProblem stepProblem0 = new StepProblem((-1.2599210498948732), (-1.2599210498948732), (-1.2599210498948732));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-1.2599210498948732), (-1.2599210498948732), (-2068));
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
      StepProblem stepProblem0 = new StepProblem(1.0, 1.0E-13, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 1.0E-13, (-2146705825));
      double[] doubleArray0 = new double[7];
      boolean boolean0 = eventState0.reset(1.0, doubleArray0);
      assertEquals(-2146705825, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertFalse(boolean0);
      assertEquals(1.0E-13, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1823.99932, 1823.99932, (-2237));
      boolean boolean0 = eventState0.stop();
      assertEquals(1823.99932, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(boolean0);
      assertEquals(-2237, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(333.89021209545, 333.89021209545, 333.89021209545);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 333.89021209545, 333.89021209545, (-2146242483));
      double[] doubleArray0 = new double[0];
      eventState0.stepAccepted((-2146242483), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(333.89021209545, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(-2146242483, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-4287.1), (-4287.1), (-4287.1));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      double[] doubleArray0 = new double[4];
      eventState0.stepAccepted((-4287.1), doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, (-976.80448));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-976.80448), (-2145930640));
      eventState0.reinitializeBegin(0.0, (double[]) null);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(976.80448, eventState0.getConvergence(), 0.01);
      assertEquals(-2145930640, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1.0, 1.0E-13, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 1.0E-13, (-2146705825));
      double[] doubleArray0 = new double[7];
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-2146705825, eventState0.getMaxIterationCount());
      assertEquals(1.0E-13, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1.0, 1.0E-13, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 1.0E-13, (-2146705825));
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0E-13, double0, 0.01);
      assertEquals(-2146705825, eventState0.getMaxIterationCount());
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-1.0), (-2428));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(0.0, double0, 0.01);
      assertEquals(-2428, eventState0.getMaxIterationCount());
      assertEquals(1.0, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 12.0, 12.0, (-1574));
      double double0 = eventState0.getEventTime();
      assertFalse(eventState0.stop());
      assertEquals(12.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-1574, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 12.0, 12.0, (-1574));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(12.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals((-1574), int0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-901.8), 1.1, 0);
      eventState0.getEventHandler();
      assertEquals(1.1, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertEquals((-901.8), eventState0.getMaxCheckInterval(), 0.01);
  }
}
