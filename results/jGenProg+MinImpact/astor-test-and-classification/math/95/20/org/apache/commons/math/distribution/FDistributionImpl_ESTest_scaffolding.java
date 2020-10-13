/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 19 22:03:44 GMT 2017
 */

package org.apache.commons.math.distribution;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FDistributionImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.distribution.FDistributionImpl"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FDistributionImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.analysis.UnivariateRealSolver",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.distribution.ContinuousDistribution",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.distribution.FDistribution",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactory",
      "org.apache.commons.math.distribution.Distribution",
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FDistributionImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.analysis.BrentSolver"
    );
  }
}