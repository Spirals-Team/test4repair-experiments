package org.apache.commons.lang;


public class BooleanUtils_ESTest_scaffolding {
    private static final java.util.Properties defaultProperties = ((java.util.Properties)(java.lang.System.getProperties().clone()));

    public static void setSystemProperties() {
        java.lang.System.setProperties(((java.util.Properties)(org.apache.commons.lang.BooleanUtils_ESTest_scaffolding.defaultProperties.clone())));
    }

    private static void initializeClasses() {
        org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(org.apache.commons.lang.BooleanUtils_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.math.NumberUtils", "org.apache.commons.lang.ArrayUtils");
    }

    private static void resetClasses() {
        org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(org.apache.commons.lang.BooleanUtils_ESTest_scaffolding.class.getClassLoader());
        org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses("org.apache.commons.lang.math.NumberUtils", "org.apache.commons.lang.ArrayUtils");
    }
}

