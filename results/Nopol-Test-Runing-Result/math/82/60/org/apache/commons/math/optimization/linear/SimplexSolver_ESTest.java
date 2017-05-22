package org.apache.commons.math.optimization.linear;


public class SimplexSolver_ESTest extends org.apache.commons.math.optimization.linear.SimplexSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 100);
        simplexTableau0.numArtificialVariables = -995;
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)(100));
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 100);
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0);
        double[] doubleArray0 = new double[11];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 100);
        simplexTableau0.numArtificialVariables = 100;
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(0.0);
        double[] doubleArray0 = new double[11];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 100);
        simplexTableau0.numArtificialVariables = 100;
        simplexSolver0.solvePhase1(simplexTableau0);
        org.junit.Assert.assertEquals(11, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 100.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
        org.junit.Assert.assertEquals(100.0, realPointValuePair0.getValue(), 0.01);
    }
}

