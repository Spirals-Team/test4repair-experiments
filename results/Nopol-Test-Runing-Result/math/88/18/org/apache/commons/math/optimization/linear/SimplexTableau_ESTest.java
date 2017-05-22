package org.apache.commons.math.optimization.linear;


public class SimplexTableau_ESTest extends org.apache.commons.math.optimization.linear.SimplexTableau_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 10.0);
        simplexTableau0.numArtificialVariables = -2672;
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1432.589509844);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-0.40236955203615593));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-0.40236955203615593));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-0.40236955203615593));
        simplexTableau0.discardArtificialVariables();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-0.40236955203615593));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-0.40236955203615593));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-0.40236955203615593));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-0.40236955203615593));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-0.40236955203615593));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -17.020581613403746;
        doubleArray0[1] = -2876.4579;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-1.0));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1.2599210498948732));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(10.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[1] = -0.40236955203615593;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-0.40236955203615593));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-0.40236955203615593));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-0.40236955203615593));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals((-0.40236955203615593), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        simplexTableau0.numArtificialVariables = 1;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals((-1872.7), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1.2599210498948732));
        simplexTableau0.numArtificialVariables = -2236;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(10.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        simplexTableau0.subtractRow(0, 0, 0.0);
        org.junit.Assert.assertEquals(0, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        boolean boolean0 = simplexTableau0.equals(linearObjectiveFunction0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        int int0 = simplexTableau0.getWidth();
        org.junit.Assert.assertEquals(6, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        int int0 = simplexTableau0.getSlackVariableOffset();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 10.0);
        int int0 = simplexTableau0.getRhsOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.0));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-3398.5855));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-335.93368360567973));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2.2250738585072014E-308);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-0.40236955203615593));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-0.40236955203615593));
        int int0 = simplexTableau0.getNumVariables();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-1.0));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1.2599210498948732));
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 10.0);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 10.0);
        simplexTableau0.numArtificialVariables = 1;
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        org.junit.Assert.assertEquals(0, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = -327.606476457;
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals(327.606476457, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 2464.60013503;
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals((-2464.60013503), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 2131.3751547413276);
        double double0 = simplexTableau0.getEntry(0, 2);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 480.1471015);
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 10.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 10.0);
        double[][] doubleArray1 = simplexTableau0.createTableau(true);
        org.junit.Assert.assertNotNull(doubleArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.subtractRow(1, 1, (-1872.7));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1024.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2184.9931939774633);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getWidth();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getSolution();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1024.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2184.9931939774633);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getHeight();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 2770.78842);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2184.9931939774633);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getEntry(7, 7);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1024.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2184.9931939774633);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.divideRow(2146706163, (-3952.71144694));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 743.229);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.discardArtificialVariables();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        org.junit.Assert.assertEquals(1, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        int int0 = simplexTableau0.getNumVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-0.40236955203615593));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        simplexTableau0.numArtificialVariables = 1;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 2253.59769957);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1432.589509844);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-0.40236955203615593));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-0.40236955203615593));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-0.40236955203615593));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-0.40236955203615593));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-0.40236955203615593));
        boolean boolean0 = simplexTableau0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        org.junit.Assert.assertTrue(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        simplexTableau1.tableau = null;
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        simplexTableau0.divideRow(0, 116.148);
        org.junit.Assert.assertEquals(0, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        simplexTableau0.discardArtificialVariables();
        org.junit.Assert.assertEquals(0, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -21.18885431039108;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-21.18885431039108));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-21.18885431039108));
        linkedList0.offerLast(linearConstraint0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-21.18885431039108));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals((-21.18885431039108), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1189.6673028093107);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1189.6673028093107);
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        org.junit.Assert.assertEquals(5, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        int int0 = simplexTableau0.getHeight();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1872.7));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        simplexTableau0.setEntry(0, 0, 0.0);
        org.junit.Assert.assertEquals(3, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1024.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2184.9931939774633);
        double[][] doubleArray1 = simplexTableau0.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
    }
}

