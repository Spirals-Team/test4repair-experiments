package org.apache.commons.math.optimization.linear;


public class SimplexSolver_ESTest extends org.apache.commons.math.optimization.linear.SimplexSolver_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 1968.1);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-1.0));
        simplexTableau0.numArtificialVariables = -683;
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(510.1920052219108);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 510.1920052219108;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 510.1920052219108);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
        org.junit.Assert.assertEquals((-259785.69018713234), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(510.1920052219108);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.doOptimize();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(510.1920052219108);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 510.1920052219108);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 510.1920052219108);
        simplexTableau0.numArtificialVariables = 100;
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(510.1920052219108);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 510.1920052219108);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexSolver0.optimize(linearObjectiveFunction0, linkedList0, goalType0, false);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = simplexSolver0.doOptimize();
        org.junit.Assert.assertFalse(realPointValuePair1.equals(((java.lang.Object)(realPointValuePair0))));
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver(510.1920052219108);
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 510.1920052219108);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 510.1920052219108);
        simplexTableau0.numArtificialVariables = 100;
        simplexSolver0.solvePhase1(simplexTableau0);
        org.junit.Assert.assertEquals(1, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double)(100));
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        boolean boolean0 = simplexSolver0.isOptimal(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }
}

