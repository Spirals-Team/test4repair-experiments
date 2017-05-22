package org.apache.commons.math3.optimization.linear;


public class SimplexSolver_ESTest extends org.apache.commons.math3.optimization.linear.SimplexSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl realVectorAbstractTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(realVectorAbstractTest_RealVectorTestImpl0)) , ((double)(100)));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 100);
        simplexSolver0.solvePhase1(simplexTableau0);
        org.junit.Assert.assertEquals(100, simplexSolver0.getMaxIterations());
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl realVectorAbstractTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(realVectorAbstractTest_RealVectorTestImpl0)) , ((double)(11)));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
        org.junit.Assert.assertFalse(pointValuePair1.equals(((java.lang.Object)(pointValuePair0))));
    }
}

