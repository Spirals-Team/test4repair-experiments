package org.apache.commons.math.optimization.linear;


public class SimplexTableau_ESTest extends org.apache.commons.math.optimization.linear.SimplexTableau_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 172.7349168);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2234.907742);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3719.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 1374.66);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[13];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3719.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 1374.66);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 0.0 , relationship0 , doubleArray0 , 1374.66);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 456.979501791577);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.543080634815244);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2979.8692);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 3678.1434130000002 , relationship0 , doubleArray0 , (-2077.409211947));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2076.3689831468864));
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.25);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-1.0));
        simplexTableau0.divideRow(0, (-156.215));
        org.junit.Assert.assertEquals(5, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3.7416573867739413);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , (-177.83) , relationship0 , doubleArray0 , 3.7416573867739413);
        linkedList0.add(linearConstraint0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-177.83));
        org.junit.Assert.assertEquals(7, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        simplexTableau0.numArtificialVariables = -2582;
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        org.junit.Assert.assertEquals(2, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-882.0));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-143.0));
        simplexTableau0.numArtificialVariables = 1180;
        double[][] doubleArray1 = simplexTableau0.createTableau(true);
        org.junit.Assert.assertNotNull(doubleArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3.7416573867739413);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        simplexTableau0.subtractRow(0, 0, 0.0);
        org.junit.Assert.assertEquals(7, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3.7416573867739413);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        simplexTableau0.setEntry(0, 0, 1.0);
        org.junit.Assert.assertEquals(7, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.1411200080598672);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.1411200080598672);
        boolean boolean0 = simplexTableau0.equals(linearObjectiveFunction0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.1411200080598672);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.1411200080598672);
        int int0 = simplexTableau0.getWidth();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2076.3689831468864));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals((-766.710150548453), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        int int0 = simplexTableau0.getSlackVariableOffset();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 274.83328633);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 274.83328633);
        int int0 = simplexTableau0.getRhsOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3195.310943901069);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1773.79);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        int int0 = simplexTableau0.getNumVariables();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 3678.1434130000002 , relationship0 , doubleArray0 , (-2077.409211947));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        simplexTableau0.numArtificialVariables = -2582;
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals((-2582), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.1411200080598672);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        org.junit.Assert.assertEquals(0, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = ((org.apache.commons.math.linear.OpenMapRealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0.mapMultiply(0.0)));
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(openMapRealVector0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1.0;
        org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1833.0;
        org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        org.junit.Assert.assertEquals((-1833.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        int int0 = simplexTableau0.getHeight();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 573.43627778081);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 1374.969537583717 , relationship0 , doubleArray0 , 0.623);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-688.2394779838));
        double double0 = simplexTableau0.getEntry(0, 8);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 573.43627778081);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-688.2394779838));
        double double0 = simplexTableau0.getEntry(0, 8);
        org.junit.Assert.assertEquals(573.43627778081, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -1726.46890793657;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        double double0 = simplexTableau0.getEntry(0, 1);
        org.junit.Assert.assertEquals((-1726.46890793657), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.1411200080598672);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.1411200080598672);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.subtractRow((-1964), 0, 4253.948984);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 2204.87259132828);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getWidth();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-766.710150548453));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-2077.409211947));
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getRhsOffset();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(((org.apache.commons.math.optimization.linear.LinearObjectiveFunction)(null)) , linkedList0 , goalType0 , true , 0.0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3195.310943901069);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1773.79);
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(null)) , relationship0 , 1768.46322944);
        linkedList0.add(linearConstraint0);
        java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        org.junit.Assert.assertFalse(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.1411200080598672);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.1411200080598672);
        int int0 = simplexTableau0.getNumVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1798.799014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1798.799014));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1870.9485874150512));
        simplexTableau1.numArtificialVariables = 14;
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 456.979501791577);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-1870.9485874150512));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 456.979501791577);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.543080634815244);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1870.9485874150512));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1833.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3719.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        boolean boolean0 = simplexTableau0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -2683.18187547948;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3719.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 1374.66);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(3719.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1833.0);
        simplexTableau0.discardArtificialVariables();
        org.junit.Assert.assertEquals(7, simplexTableau0.getNumVariables());
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 456.979501791577);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 382.458 , relationship0 , doubleArray0 , 1374.66);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.543080634815244);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-1870.9485874150512));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        double[] doubleArray0 = new double[13];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3719.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 1374.66);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0);
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.1411200080598672);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.1411200080598672);
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3719.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(4, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 2204.87259132828);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        double[][] doubleArray1 = simplexTableau0.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
    }
}

