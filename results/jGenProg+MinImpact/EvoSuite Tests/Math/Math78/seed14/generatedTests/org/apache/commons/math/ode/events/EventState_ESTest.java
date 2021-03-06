/*
 * This file was automatically generated by EvoSuite
 * Sun Jan 15 12:15:18 GMT 2017
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
      StepProblem stepProblem0 = new StepProblem((-1.0), (-1.0), (-1.0));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 256.26984522, (-1449.328169362342), 23);
      double[] doubleArray0 = new double[2];
      eventState0.stepAccepted((-1.0), doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(1449.328169362342, eventState0.getConvergence(), 0.01);
      assertEquals(256.26984522, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(23, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[1];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1620);
      eventState0.reinitializeBegin(0.0, doubleArray0);
      assertEquals(1620, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1620);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1620, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, (-738.4534), (-738.4534), (-3654));
      int int0 = eventState0.getMaxIterationCount();
      assertEquals((-738.4534), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-3654), int0);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, (-767.98014392582), (-767.98014392582));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 10.0178749274099, 0.6931471805599453, 366);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(10.0178749274099, double0, 0.01);
      assertEquals(0.6931471805599453, eventState0.getConvergence(), 0.01);
      assertEquals(366, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-100.0), (-100.0), (-100.0));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3471.041933), (-3471.041933), 4479);
      double double0 = eventState0.getMaxCheckInterval();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(4479, eventState0.getMaxIterationCount());
      assertEquals((-3471.041933), double0, 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1620);
      eventState0.getEventHandler();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1620, eventState0.getMaxIterationCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-10.352900944461926), 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-10.352900944461926), 0.0, 0);
      double double0 = eventState0.getConvergence();
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals((-10.352900944461926), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 1.0, 1.0, 3067);
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
      EventState eventState0 = new EventState((EventHandler) null, (-738.4534), (-738.4534), (-3654));
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
      StepProblem stepProblem0 = new StepProblem((-100.0), (-100.0), (-100.0));
      double[] doubleArray0 = new double[7];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3471.041933), (-3471.041933), 4479);
      boolean boolean0 = eventState0.reset(0.0, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(4479, eventState0.getMaxIterationCount());
      assertEquals((-3471.041933), eventState0.getMaxCheckInterval(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-100.0), (-100.0), (-100.0));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3471.041933), (-3471.041933), 4479);
      boolean boolean0 = eventState0.stop();
      assertFalse(boolean0);
      assertEquals(4479, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-3471.041933), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-100.0), (-100.0), (-100.0));
      double[] doubleArray0 = new double[7];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3471.041933), (-3471.041933), 4479);
      eventState0.stepAccepted((-3471.041933), doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(4479, eventState0.getMaxIterationCount());
      assertEquals((-3471.041933), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-100.0), (-100.0), (-100.0));
      double[] doubleArray0 = new double[7];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3471.041933), (-3471.041933), 4479);
      eventState0.stepAccepted(4479, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(4479, eventState0.getMaxIterationCount());
      assertEquals((-3471.041933), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(1.0, 1.0, 1.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 3.5283533246246175, 1.0, 1598);
      double[] doubleArray0 = new double[0];
      eventState0.reinitializeBegin(3.5283533246246175, doubleArray0);
      assertFalse(eventState0.stop());
      assertEquals(1598, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(1.0, eventState0.getConvergence(), 0.01);
      assertEquals(3.5283533246246175, eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-100.0), (-100.0), (-100.0));
      double[] doubleArray0 = new double[7];
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-3471.041933), (-3471.041933), 4479);
      eventState0.reinitializeBegin((-3471.041933), doubleArray0);
      assertEquals((-3471.041933), eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(4479, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem((-2929.967927477749), (-2929.967927477749), (-2929.967927477749));
      EventState eventState0 = new EventState((EventHandler) stepProblem0, (-2929.967927477749), (-2929.967927477749), (-132));
      double double0 = eventState0.getConvergence();
      assertEquals(-132, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(2929.967927477749, double0, 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals((-2929.967927477749), eventState0.getMaxCheckInterval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-1043.321), (-3109));
      double double0 = eventState0.getMaxCheckInterval();
      assertFalse(eventState0.stop());
      assertEquals(-3109, eventState0.getMaxIterationCount());
      assertEquals(0.0, double0, 0.01);
      assertEquals(1043.321, eventState0.getConvergence(), 0.01);
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 0.0);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, 0.0, 1620);
      double double0 = eventState0.getEventTime();
      assertEquals(1620, eventState0.getMaxIterationCount());
      assertEquals(Double.NaN, double0, 0.01);
      assertFalse(eventState0.stop());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StepProblem stepProblem0 = new StepProblem(0.0, 0.0, 1256.3718);
      EventState eventState0 = new EventState((EventHandler) stepProblem0, 0.0, (-1511.0), 0);
      int int0 = eventState0.getMaxIterationCount();
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
      assertEquals(0.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(1511.0, eventState0.getConvergence(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventState eventState0 = new EventState((EventHandler) null, 4.0, 4.0, 8);
      eventState0.getEventHandler();
      assertEquals(4.0, eventState0.getMaxCheckInterval(), 0.01);
      assertEquals(8, eventState0.getMaxIterationCount());
      assertFalse(eventState0.stop());
      assertEquals(Double.NaN, eventState0.getEventTime(), 0.01);
  }
}
