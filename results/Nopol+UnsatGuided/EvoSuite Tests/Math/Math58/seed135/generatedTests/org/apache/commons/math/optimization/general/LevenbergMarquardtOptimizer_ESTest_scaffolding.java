/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 20 23:28:02 GMT 2017
 */

package org.apache.commons.math.optimization.general;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class LevenbergMarquardtOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(LevenbergMarquardtOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.optimization.SimpleVectorialValueChecker",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.analysis.MultivariateVectorialFunction",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.optimization.direct.BaseAbstractVectorialOptimizer",
      "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer",
      "org.apache.commons.math.optimization.general.CircleVectorial$1",
      "org.apache.commons.math.optimization.ConvergenceChecker",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.exception.ConvergenceException",
      "org.apache.commons.math.exception.util.MessageFactory",
      "org.apache.commons.math.exception.MathThrowable",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.analysis.MultivariateMatrixFunction",
      "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer",
      "org.apache.commons.math.optimization.BaseOptimizer",
      "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.MathUserException",
      "org.apache.commons.math.optimization.VectorialPointValuePair",
      "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.optimization.general.CircleVectorial",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(LevenbergMarquardtOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.optimization.general.CircleVectorial$1",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.optimization.VectorialPointValuePair",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.linear.LUDecompositionImpl",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.exception.SingularMatrixException"
    );
  }
}
