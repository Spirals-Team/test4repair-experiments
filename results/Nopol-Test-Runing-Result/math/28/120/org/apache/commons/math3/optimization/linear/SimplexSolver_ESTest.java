package org.apache.commons.math3.optimization.linear;


public class SimplexSolver_ESTest extends org.apache.commons.math3.optimization.linear.SimplexSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[3];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0E-6);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 3524.2188498);
        simplexSolver0.solvePhase1(simplexTableau0);
        org.junit.Assert.assertEquals(100, org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math3.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math3.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl realVectorAbstractTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.RealVectorAbstractTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(realVectorAbstractTest_RealVectorTestImpl0)) , ((double)(100)));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair1 = simplexSolver0.doOptimize();
        org.junit.Assert.assertNotSame(pointValuePair1, pointValuePair0);
    }
}

