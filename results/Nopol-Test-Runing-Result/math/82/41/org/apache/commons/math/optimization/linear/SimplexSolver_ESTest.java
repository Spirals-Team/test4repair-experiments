package org.apache.commons.math.optimization.linear;


public class SimplexSolver_ESTest extends org.apache.commons.math.optimization.linear.SimplexSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(168.0);
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 100.0);
        simplexTableau0.numArtificialVariables = -2;
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(168.0);
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 100.0);
        simplexTableau0.numArtificialVariables = -2;
        simplexSolver0.solvePhase1(simplexTableau0);
        org.junit.Assert.assertEquals(100, org.apache.commons.math.optimization.linear.AbstractLinearOptimizer.DEFAULT_MAX_ITERATIONS);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
        org.junit.Assert.assertFalse(realPointValuePair1.equals(((java.lang.Object)(realPointValuePair0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(168.0);
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 100.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
        org.junit.Assert.assertFalse(realPointValuePair1.equals(((java.lang.Object)(realPointValuePair0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-306.1514809888488));
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, true);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
        org.junit.Assert.assertEquals((-306.1514809888488), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = ((double)(100));
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 100.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.numArtificialVariables = 22;
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }
}

