/**
 * Scaffolding file used to store all the setups needed to run
 * tests automatically generated by EvoSuite
 * Fri Jan 27 20:45:04 GMT 2017
 */


package org.apache.commons.math.complex;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.junit.BeforeClass;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.GuiSupport;
import org.evosuite.runtime.classhandling.JDKClassResetter;
import org.evosuite.runtime.thread.KillSwitchHandler;
import org.evosuite.runtime.thread.ThreadStopper;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.vnet.NonFunctionalRequirementRule;
import static org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED;
import org.junit.Rule;
import org.evosuite.runtime.Runtime;
import org.evosuite.runtime.RuntimeSettings;

@EvoSuiteClassExclude
public class Complex_ESTest_scaffolding {
    @Rule
    public NonFunctionalRequirementRule nfr = new NonFunctionalRequirementRule();

    private ThreadStopper threadStopper = new ThreadStopper(KillSwitchHandler.getInstance(), 3000);

    @BeforeClass
    public static void initEvoSuiteFramework() {
        RuntimeSettings.className = "org.apache.commons.math.complex.Complex";
        GuiSupport.initialize();
        RuntimeSettings.maxNumberOfThreads = 100;
        RuntimeSettings.maxNumberOfIterationsPerLoop = 10000;
        RuntimeSettings.mockSystemIn = true;
        RuntimeSettings.sandboxMode = RECOMMENDED;
        Sandbox.initializeSecurityManagerForSUT();
        JDKClassResetter.init();
        Complex_ESTest_scaffolding.setSystemProperties();
        Complex_ESTest_scaffolding.initializeClasses();
        Runtime.getInstance().resetRuntime();
    }

    public static void setSystemProperties() {
        /* No java.lang.System property to set */
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(Complex_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.math.exception.NumberIsTooSmallException", "org.apache.commons.math.exception.NullArgumentException", "org.apache.commons.math.exception.util.ExceptionContext", "org.apache.commons.math.exception.NonMonotonousSequenceException", "org.apache.commons.math.util.FastMath", "org.apache.commons.math.util.MathUtils", "org.apache.commons.math.Field", "org.apache.commons.math.complex.ComplexField$LazyHolder", "org.apache.commons.math.exception.NumberIsTooLargeException", "org.apache.commons.math.exception.NotFiniteNumberException", "org.apache.commons.math.exception.MathThrowable", "org.apache.commons.math.FieldElement", "org.apache.commons.math.exception.NotPositiveException", "org.apache.commons.math.exception.util.Localizable", "org.apache.commons.math.exception.MathIllegalArgumentException", "org.apache.commons.math.complex.Complex", "org.apache.commons.math.exception.MathArithmeticException", "org.apache.commons.math.complex.ComplexField", "org.apache.commons.math.exception.DimensionMismatchException", "org.apache.commons.math.exception.util.LocalizedFormats", "org.apache.commons.math.exception.MathIllegalNumberException", "org.apache.commons.math.MathRuntimeException", "org.apache.commons.math.MathRuntimeException$1", "org.apache.commons.math.MathRuntimeException$2", "org.apache.commons.math.MathRuntimeException$3", "org.apache.commons.math.exception.util.ExceptionContextProvider", "org.apache.commons.math.MathRuntimeException$4", "org.apache.commons.math.MathRuntimeException$5", "org.apache.commons.math.MathRuntimeException$6", "org.apache.commons.math.MathRuntimeException$7", "org.apache.commons.math.MathRuntimeException$8", "org.apache.commons.math.MathRuntimeException$9", "org.apache.commons.math.exception.util.ArgUtils");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(Complex_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.math.complex.Complex", "org.apache.commons.math.util.FastMath", "org.apache.commons.math.exception.util.LocalizedFormats", "org.apache.commons.math.complex.ComplexField", "org.apache.commons.math.complex.ComplexField$LazyHolder", "org.apache.commons.math.util.MathUtils", "org.apache.commons.math.MathRuntimeException", "org.apache.commons.math.MathRuntimeException$4", "org.apache.commons.math.exception.MathIllegalArgumentException", "org.apache.commons.math.exception.NullArgumentException", "org.apache.commons.math.exception.util.ExceptionContext");
    }
}

