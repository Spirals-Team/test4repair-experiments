/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 11 11:14:26 GMT 2017
 */

package org.apache.commons.math.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AdaptiveStepsizeIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.ode.DerivativeException",
      "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.sampling.StepHandler",
      "org.apache.commons.math.ode.TestProblemAbstract",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolver",
      "org.apache.commons.math.Field",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.ode.AbstractIntegrator",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolverImpl",
      "org.apache.commons.math.ode.events.EventState$1",
      "org.apache.commons.math.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.ode.sampling.DummyStepInterpolator",
      "org.apache.commons.math.ode.events.EventException",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer",
      "org.apache.commons.math.ode.events.EventHandler",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.MultistepIntegrator",
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math.linear.FieldLUDecomposition",
      "org.apache.commons.math.ode.nonstiff.StepProblem",
      "org.apache.commons.math.ode.nonstiff.AdamsIntegrator",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.fraction.BigFractionField$LazyHolder",
      "org.apache.commons.math.ConvergingAlgorithm",
      "org.apache.commons.math.ode.sampling.StepInterpolator",
      "org.apache.commons.math.linear.DefaultFieldMatrixPreservingVisitor",
      "org.apache.commons.math.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.fraction.FractionConversionException",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.ode.AbstractIntegrator$EndTimeChecker",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math.ode.events.CombinedEventsManager",
      "org.apache.commons.math.linear.DefaultFieldMatrixChangingVisitor",
      "org.apache.commons.math.fraction.BigFractionField",
      "org.apache.commons.math.ode.FirstOrderIntegrator",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer$1",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl$Solver",
      "org.apache.commons.math.linear.SingularMatrixException",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.linear.FieldDecompositionSolver",
      "org.apache.commons.math.FieldElement",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math.ode.events.EventState",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.ode.ODEIntegrator",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math.analysis.solvers.BrentSolver",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.ode.TestProblem1",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.ode.TestProblem5",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.fraction.BigFraction",
      "org.apache.commons.math.ConvergingAlgorithmImpl",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl",
      "org.apache.commons.math.linear.MatrixUtils$BigFractionMatrixConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AdaptiveStepsizeIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.AdamsNordsieckTransformer",
      "org.apache.commons.math.ode.TestProblemAbstract",
      "org.apache.commons.math.ode.TestProblem1",
      "org.apache.commons.math.ode.TestProblem5",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ode.IntegratorException",
      "org.apache.commons.math.fraction.BigFraction",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.fraction.BigFractionField",
      "org.apache.commons.math.fraction.BigFractionField$LazyHolder",
      "org.apache.commons.math.linear.FieldLUDecompositionImpl$Solver",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math.ode.nonstiff.StepProblem",
      "org.apache.commons.math.ode.sampling.DummyStepHandler$LazyHolder",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.ode.DerivativeException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math.analysis.solvers.BrentSolver",
      "org.apache.commons.math.ode.sampling.DummyStepInterpolator",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.ode.nonstiff.EulerIntegrator",
      "org.apache.commons.math.ode.nonstiff.EulerStepInterpolator"
    );
  }
}
