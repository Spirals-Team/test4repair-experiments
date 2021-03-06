/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 16 22:14:08 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem((-2948.9190379086), (-2948.9190379086), (-2948.9190379086));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2948.9190379086), (-2948.9190379086), 731);
      eventState0.stepAccepted(731, (double[]) null);
      assertEquals((-2948.9190379086), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(731, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(903.1, 903.1, 903.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 903.1, 2109);
      eventState0.reinitializeBegin(969.8992238, (double[]) null);
      assertEquals(2109, eventState0.getMaxIterationCount());
      assertEquals(903.1, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(201.6693136354349, 201.6693136354349, 201.6693136354349);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 0);
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(0, int0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(903.1, 903.1, 903.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 903.1, 2109);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(903.1, eventState0.getConvergence(), 0.01);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(2109, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1159.725803637735, 1159.725803637735, 1159.725803637735);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1159.725803637735, 1159.725803637735, 2);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(2, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(1159.725803637735, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2048.99032304516), (-2048.99032304516), (-2048.99032304516));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2048.99032304516), (-1.0), 3264);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals((-2048.99032304516), double0, 0.01);
      assertFalse(eventState0.stop());
      assertEquals(3264, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0, eventState0.getConvergence(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.7853981633974483, 0.7853981633974483, 0.7853981633974483);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.7853981633974483, 0.7853981633974483, (-10));
      eventState0.getEventHandler();
      assertEquals(-10, eventState0.getMaxIterationCount());
      assertEquals(0.7853981633974483, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1756);
      eventState0.getConvergence();
      assertEquals(1756, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 3359.20687670574, (-1.0), 0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        eventState0.stepAccepted(3040.3872171, doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) null, 3.7416573867739413, 3.7416573867739413, (-1288));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        eventState0.reinitializeBegin((-1288), doubleArray0);
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
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1756);
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
      StepProblem stepProblem0 = new StepProblem(903.1, 903.1, 903.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 903.1, 2109);
      boolean boolean0 = eventState0.reset(969.8992238, (double[]) null);
      assertEquals(903.1, eventState0.getConvergence(), 0.01);
      assertEquals(2109, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(903.1, 903.1, 903.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 903.1, 2109);
      boolean boolean0 = eventState0.stop();
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(903.1, eventState0.getConvergence(), 0.01);
      assertFalse(boolean0);
      assertEquals(2109, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(903.1, 903.1, 903.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 903.1, 2109);
      eventState0.stepAccepted(Double.NaN, (double[]) null);
      assertEquals(903.1, eventState0.getConvergence(), 0.01);
      assertEquals(2109, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(13.0, 13.0, 13.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 13.0, 13.0, 248);
      double[] doubleArray0 = new double[3];
      eventState0.stepAccepted(13.0, doubleArray0);
      assertEquals(248, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(13.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.7853981633974483, 0.7853981633974483, 0.7853981633974483);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.7853981633974483, 0.7853981633974483, (-10));
      double[] doubleArray0 = new double[0];
      eventState0.reinitializeBegin(0.7853981633974483, doubleArray0);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(0.7853981633974483, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(-10, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(903.1, 903.1, 903.1);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1.0, 903.1, 2109);
      eventState0.reinitializeBegin(Double.NaN, (double[]) null);
      assertEquals(1.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(903.1, eventState0.getConvergence(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(2109, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((double) 5, (double) 5, (double) 5);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (double) 5, (double) 5, 5);
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertFalse(eventState0.stop());
      assertEquals(5.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(5.0, double0, 0.01);
      assertEquals(5, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-688.6679015), (-111));
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(688.6679015, eventState0.getConvergence(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(-111, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 367);
      double double0 = eventState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(367, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1219.743, 3550.797, 1219.743);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 1219.743, 1219.743, (-135));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals(1219.743, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-135), int0);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 0.0, 0.0, 367);
      eventState0.getEventHandler();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(367, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }
}
