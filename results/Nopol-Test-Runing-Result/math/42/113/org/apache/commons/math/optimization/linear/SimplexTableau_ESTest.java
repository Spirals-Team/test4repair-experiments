package org.apache.commons.math.optimization.linear;


public class SimplexTableau_ESTest extends org.apache.commons.math.optimization.linear.SimplexTableau_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-2632.377685755037));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62) , (-998));
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-549.0223846));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 16);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-549.0223846));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-3.7999795083850525E-8));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = -715.346427408;
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , relationship0 , (-655.62));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-715.346427408));
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 1.543080634815244 , relationship0 , doubleArray0 , 1.543080634815244);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1227.8857556);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1227.8857556);
        simplexTableau0.initializeColumnLabels();
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-2632.377685755037));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62) , (-998));
        java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        org.junit.Assert.assertTrue(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-761.4711638) , (-1094));
        int int0 = simplexTableau0.getWidth();
        org.junit.Assert.assertEquals(4, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = java.lang.Double.NEGATIVE_INFINITY;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , java.lang.Double.NEGATIVE_INFINITY);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0 , 3300);
        int int0 = simplexTableau0.getSlackVariableOffset();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-761.4711638) , (-1094));
        int int0 = simplexTableau0.getRhsOffset();
        org.junit.Assert.assertEquals(3, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 2003.383336349);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0 , 0);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-4423.9805918246475) , 0);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(7, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[9];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1462.343786007118));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 32.0 , 0);
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0 , 3300);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-2632.377685755037));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62) , (-998));
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(5, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , (-821.9296014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 167.7983);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.LEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-1769.42));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.25 , (-2144213135));
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = 1466.4974638;
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = ((org.apache.commons.math.linear.OpenMapRealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0.mapMultiply((-795.65145975224))));
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(openMapRealVector0);
        org.junit.Assert.assertEquals(1166820.8477954278, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 0.9092974268256817;
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = ((org.apache.commons.math.linear.OpenMapRealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0.mapMultiply(2.718281828459045)));
        double double0 = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoefficientSum(openMapRealVector0);
        org.junit.Assert.assertEquals((-2.4717266720048188), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-761.4711638) , (-1094));
        int int0 = simplexTableau0.getHeight();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.1));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1944.04251330768 , 0);
        double double0 = simplexTableau0.getEntry(0, 1);
        org.junit.Assert.assertEquals((-0.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-699.41701));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-177.656));
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 0);
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , (-821.9296014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(0);
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , (-821.9296014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(0);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-3377.33167));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-3377.33167));
        int int0 = simplexTableau0.getArtificialVariableOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , (-821.9296014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        org.apache.commons.math.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math.linear.Array2DRowRealMatrix)(simplexTableau0.createTableau(true)));
        org.junit.Assert.assertEquals(11, array2DRowRealMatrix0.getColumnDimension());
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , relationship0 , (-655.62));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-715.346427408));
        java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        org.junit.Assert.assertEquals(1, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-549.0223846));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 10);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction1 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 655.62);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction1 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-549.0223846));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-549.0223846));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , (-579));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(simplexTableau1.equals(((java.lang.Object)(simplexTableau0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1647.8716324212164));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62));
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , relationship0 , 1651.306749134);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-3.7999795083850525E-8));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-549.0223846));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-655.62));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        java.lang.Object object0 = new java.lang.Object();
        boolean boolean0 = simplexTableau0.equals(object0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , (-821.9296014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1647.8716324212164));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau1 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 16);
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , (-821.9296014));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        simplexTableau0.divideRow(0, (-3279.0));
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[3] = -1.0;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.0));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0 , 0);
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = java.lang.Double.NEGATIVE_INFINITY;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1187.8185415764785);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1901.816902311111 , 1285);
        boolean boolean0 = simplexTableau0.isOptimal();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        boolean boolean0 = simplexTableau0.isOptimal();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , relationship0 , (-655.62));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0 , (-2412));
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 2814.704998338194;
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , relationship0 , (-655.62));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-715.346427408));
        simplexTableau0.dropPhase1Objective();
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 4019.0858722035937 , 0);
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-3534.44824));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-3534.44824));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2.9581193516975647E-248 , 476);
        simplexTableau0.dropPhase1Objective();
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(2);
        org.junit.Assert.assertNotNull(integer0);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[3] = 1.0;
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , relationship0 , (-655.62));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-715.346427408));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(doubleArray0 , 1.543080634815244 , relationship0 , doubleArray0 , (-2631.1051));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1227.8857556);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1647.8716324212164));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.GEQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , relationship0 , 1651.306749134);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-3.7999795083850525E-8));
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        double[] doubleArray0 = new double[7];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.1));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1944.04251330768 , 0);
        simplexTableau0.subtractRow(0, 0, (-2632.6481806348156));
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-3377.33167));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-3377.33167));
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -1.0;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1647.8716324212164));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.linear.Relationship relationship0 = org.apache.commons.math.optimization.linear.Relationship.EQ;
        org.apache.commons.math.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math.optimization.linear.LinearConstraint(((org.apache.commons.math.linear.RealVector)(arrayRealVectorTest_RealVectorTestImpl0)) , relationship0 , (-655.62));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1647.8716324212164));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-655.62));
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertEquals((-1647.8716324212164), realPointValuePair0.getValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0 , 0);
        simplexTableau0.setEntry(0, 0, 1.0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1.0));
        java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        org.apache.commons.math.optimization.GoalType goalType0 = org.apache.commons.math.optimization.GoalType.MINIMIZE;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 0.0 , 0);
        double[][] doubleArray1 = simplexTableau0.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
    }
}

