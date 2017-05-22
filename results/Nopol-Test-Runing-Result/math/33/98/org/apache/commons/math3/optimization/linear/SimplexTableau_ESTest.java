package org.apache.commons.math3.optimization.linear;


public class SimplexTableau_ESTest extends org.apache.commons.math3.optimization.linear.SimplexTableau_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 9.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.7853981633974483);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1807.3);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 320.4 , (-369));
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , (-1777.9732) , relationship0 , doubleArray0 , (-1777.9732));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        linkedList0.removeFirst();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-2378.6346136) , (-369));
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -1.0;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-0.007872459835881362));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 934.37 , (-49));
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[18];
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 1609.9921306312017);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        simplexTableau0.initializeColumnLabels();
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-3556.821788));
        simplexTableau0.setEntry(0, 3, (-1.0));
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.0));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1.0) , (-1));
        java.util.List<org.apache.commons.math3.optimization.linear.LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        org.junit.Assert.assertTrue(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        int int0 = simplexTableau0.getWidth();
        org.junit.Assert.assertEquals(4, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1102.82873956));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1102.82873956) , 0);
        int int0 = simplexTableau0.getSlackVariableOffset();
        org.junit.Assert.assertEquals(4, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[18];
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 1609.9921306312017);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        int int0 = simplexTableau0.getRhsOffset();
        org.junit.Assert.assertEquals(20, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.0));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1.0) , (-1));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 9.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1807.3);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.5039018405998233);
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-250.838807));
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-0.007872459835881362));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 934.37 , (-49));
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 9.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1807.3);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[14];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 40.1028073);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , (-1777.9732) , relationship0 , doubleArray0 , (-1777.9732));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(arrayRealVectorTest_RealVectorTestImpl0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = -2784.34;
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals(2784.34, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 0.4771212547196624;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(arrayRealVectorTest_RealVectorTestImpl0);
        org.junit.Assert.assertEquals((-0.4771212547196624), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        int int0 = simplexTableau0.getHeight();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 40.1028073);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-1.25992104989) , 0);
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 40.1028073);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-1.2599210498948732) , 0);
        simplexTableau0.divideRow(0, (-1.0));
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[18];
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 1609.9921306312017);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(20);
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1102.82873956));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.5);
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(0);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , (-1777.9732) , relationship0 , doubleArray0 , (-1777.9732));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(1);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
        org.junit.Assert.assertNotNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[16];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        org.junit.Assert.assertEquals(18, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 9.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1807.3);
        org.apache.commons.math3.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math3.linear.Array2DRowRealMatrix)(simplexTableau0.createTableau(false)));
        org.junit.Assert.assertEquals(4, array2DRowRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , (-1777.9732) , relationship0 , doubleArray0 , (-1777.9732));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        java.util.List<org.apache.commons.math3.optimization.linear.LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        org.junit.Assert.assertEquals(1, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.GoalType goalType1 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType1 , false , 3 , 3);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 3 , 3);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 3 , 3);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 3 , 3);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 3 , 3);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 3 , (-19));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , (-1777.9732) , relationship0 , doubleArray0 , (-1777.9732));
        boolean boolean0 = linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList1 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList1 , goalType0 , false , (-369) , (-19));
        boolean boolean1 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse((boolean1 == boolean0));
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , 0.19999954120254515 , relationship0 , doubleArray0 , (-1777.9732));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 3 , 3);
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-369) , (-19));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-2378.6346136) , 4);
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[16];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1777.9732));
        boolean boolean0 = simplexTableau0.equals(linkedList0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 40.1028073);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-1.25992104989) , 0);
        simplexTableau0.divideRow(0, 15.102087921512151);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.175201193643801);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-3178.00041) , 1);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -1.0;
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.GEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-2504.4871388617));
        linkedList0.add(linearConstraint0);
        double[] doubleArray1 = new double[5];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray1 , (-1811.262257));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-379.0));
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        double[] doubleArray0 = new double[18];
        doubleArray0[0] = 1.0;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 1609.9921306312017);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        double[] doubleArray0 = new double[18];
        doubleArray0[0] = 1.0;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 1609.9921306312017);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        boolean boolean0 = simplexTableau0.isOptimal();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 934.37 , (-49));
        boolean boolean0 = simplexTableau0.isOptimal();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1777.9732));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , (-1777.9732) , relationship0 , doubleArray0 , (-1777.9732));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4 , (-16));
        simplexTableau0.dropPhase1Objective();
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1811.262257));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-379.0));
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -1.0;
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.GEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-2504.4871388617));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1811.262257));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-379.0));
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.GEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-2504.4871388617));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1811.262257));
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-379.0));
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1778.6663471805598));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.073741824E9);
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        double[] doubleArray0 = new double[14];
        doubleArray0[0] = 1.0;
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 40.1028073);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 0);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-3556.821788));
        double[][] doubleArray1 = simplexTableau0.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
    }
}

