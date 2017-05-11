/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 22 01:11:42 GMT 2017
 */

package org.apache.commons.math.optimization.linear;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SimplexTableau_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.optimization.linear.SimplexTableau"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimplexTableau_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.optimization.linear.Relationship$1",
      "org.apache.commons.math.linear.RealVectorImplTest$RealVectorTestImpl",
      "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.optimization.linear.Relationship",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.optimization.linear.SimplexTableau",
      "org.apache.commons.math.linear.RealVectorImpl",
      "org.apache.commons.math.linear.SparseRealVectorTest",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.MatrixVisitorException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.optimization.linear.LinearObjectiveFunction",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorImplTest",
      "org.apache.commons.math.optimization.linear.LinearConstraint",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.MathRuntimeException$9"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimplexTableau_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.linear.SimplexTableau",
      "org.apache.commons.math.optimization.linear.Relationship",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.optimization.linear.LinearObjectiveFunction",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.RealVectorImpl",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.linear.RealVectorImplTest$RealVectorTestImpl",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl",
      "org.apache.commons.math.optimization.linear.LinearConstraint",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.optimization.linear.Relationship$1",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap"
    );
  }
}
