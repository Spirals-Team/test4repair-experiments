/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jan 21 11:46:04 GMT 2017
 */

package org.apache.commons.math.stat.clustering;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EuclideanIntegerPoint_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EuclideanIntegerPoint_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.NonMonotonousSequenceException",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.NotFiniteNumberException",
      "org.apache.commons.math.exception.MathThrowable",
      "org.apache.commons.math.stat.clustering.Clusterable",
      "org.apache.commons.math.exception.NotPositiveException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EuclideanIntegerPoint_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.MathUtils"
    );
  }
}
