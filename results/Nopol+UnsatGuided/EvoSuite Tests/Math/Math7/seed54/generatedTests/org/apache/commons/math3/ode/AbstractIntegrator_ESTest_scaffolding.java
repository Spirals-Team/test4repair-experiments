/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 11 09:49:44 GMT 2017
 */

package org.apache.commons.math3.ode;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.ode.AbstractIntegrator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.fraction.BigFractionField",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.ode.EquationsMapper",
      "org.apache.commons.math3.linear.FieldDecompositionSolver",
      "org.apache.commons.math3.linear.FieldVector",
      "org.apache.commons.math3.ode.AbstractIntegrator",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.ode.SecondaryEquations",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math3.linear.FieldMatrix",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.ode.events.EventHandler",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.ode.nonstiff.EulerIntegrator",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.ode.sampling.StepNormalizerBounds",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.analysis.solvers.SecantSolver",
      "org.apache.commons.math3.FieldElement",
      "org.apache.commons.math3.linear.FieldLUDecomposition",
      "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math3.ode.sampling.StepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.StepProblem",
      "org.apache.commons.math3.ode.nonstiff.RungeKuttaIntegrator",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.linear.FieldLUDecomposition$Solver",
      "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator",
      "org.apache.commons.math3.ode.sampling.StepNormalizer",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator",
      "org.apache.commons.math3.linear.BlockFieldMatrix",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.ode.MultistepIntegrator",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.linear.NonSymmetricMatrixException",
      "org.apache.commons.math3.ode.nonstiff.MidpointIntegrator",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math3.ode.sampling.StepHandler",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.ode.events.EventHandler$Action",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.linear.QRDecomposition$Solver",
      "org.apache.commons.math3.ode.sampling.StepNormalizerOutputTestBase",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.fraction.BigFraction",
      "org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator",
      "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver",
      "org.apache.commons.math3.ode.ExpandableStatefulODE",
      "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.linear.AbstractRealMatrix$4",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math3.linear.MatrixUtils$BigFractionMatrixConverter",
      "org.apache.commons.math3.ode.nonstiff.EmbeddedRungeKuttaIntegrator",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.ode.MultistepIntegrator$CountingDifferentialEquations",
      "org.apache.commons.math3.ode.TestProblem1",
      "org.apache.commons.math3.ode.sampling.StepNormalizerMode",
      "org.apache.commons.math3.linear.AbstractFieldMatrix",
      "org.apache.commons.math3.ode.TestProblem5",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.ode.events.EventState",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.linear.ArrayFieldVector",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolver",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.ode.MultistepIntegrator$InitializationCompletedMarkerException",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.linear.SingularMatrixException",
      "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator",
      "org.apache.commons.math3.analysis.solvers.AllowedSolution",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math3.ode.events.EventState$1",
      "org.apache.commons.math3.linear.DecompositionSolver",
      "org.apache.commons.math3.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math3.linear.DefaultFieldMatrixPreservingVisitor",
      "org.apache.commons.math3.ode.TestProblemAbstract",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.ode.FirstOrderIntegrator",
      "org.apache.commons.math3.ode.events.EventState$LocalMaxCountExceededException",
      "org.apache.commons.math3.linear.QRDecomposition",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.ode.ODEIntegrator",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.ode.nonstiff.AdamsIntegrator",
      "org.apache.commons.math3.ode.sampling.FixedStepHandler",
      "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math3.fraction.FractionConversionException",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.ode.AbstractIntegrator$1",
      "org.apache.commons.math3.Field",
      "org.apache.commons.math3.ode.MultistepIntegrator$NordsieckInitializer",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math3.exception.NoBracketingException",
      "org.apache.commons.math3.fraction.BigFractionField$LazyHolder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler$LazyHolder",
      "org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator",
      "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.RungeKuttaStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.ThreeEighthesStepInterpolator",
      "org.apache.commons.math3.ode.EquationsMapper",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince853StepInterpolator",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.fraction.BigFraction",
      "org.apache.commons.math3.ode.nonstiff.GillIntegrator",
      "org.apache.commons.math3.ode.nonstiff.GillStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator",
      "org.apache.commons.math3.ode.nonstiff.HighamHall54StepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.EulerIntegrator",
      "org.apache.commons.math3.ode.nonstiff.EulerStepInterpolator",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math3.ode.events.EventHandler$Action",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator",
      "org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolator",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$Method",
      "org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator",
      "org.apache.commons.math3.ode.nonstiff.MidpointIntegrator",
      "org.apache.commons.math3.ode.nonstiff.MidpointStepInterpolator",
      "org.apache.commons.math3.analysis.solvers.BisectionSolver",
      "org.apache.commons.math3.analysis.solvers.MullerSolver2",
      "org.apache.commons.math3.analysis.solvers.RiddersSolver",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.solvers.MullerSolver",
      "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator",
      "org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaStepInterpolator",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.fraction.BigFractionField",
      "org.apache.commons.math3.fraction.BigFractionField$LazyHolder",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.linear.ArrayFieldVector",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.analysis.solvers.SecantSolver",
      "org.apache.commons.math3.analysis.solvers.BrentSolver",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.exception.NoBracketingException",
      "org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.ode.MultistepIntegrator$InitializationCompletedMarkerException",
      "org.apache.commons.math3.analysis.solvers.AllowedSolution",
      "org.apache.commons.math3.ode.sampling.StepNormalizerBounds"
    );
  }
}
