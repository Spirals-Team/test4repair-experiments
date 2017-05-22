package org.apache.commons.math3.optimization.linear;


public class SimplexTableau_ESTest extends org.apache.commons.math3.optimization.linear.SimplexTableau_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1434.89));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.0);
        linkedList0.add(linearConstraint0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply(0.0)));
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , relationship0 , (-6.663542893624021E-14));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.0);
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 20.08553692318767);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-56.730018022662));
        simplexTableau0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1812.2;
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.GEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.0);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1812.2);
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-218.813683610331));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2212.50838);
        simplexTableau0.initializeColumnLabels();
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 19.085536923187668);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.0);
        simplexTableau0.subtractRow(0, 0, 637.49743);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        double[] doubleArray0 = new double[3];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1375.99076);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 3201.6176911946 , 0);
        simplexTableau0.setEntry(0, 0, 1064.5873336766385);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3293.751904);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-388.81071) , 0);
        java.util.List<org.apache.commons.math3.optimization.linear.LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        org.junit.Assert.assertEquals(0, list0.size());
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 901.3);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 901.3);
        int int0 = simplexTableau0.getWidth();
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test10() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 3293.751904);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-388.81071) , 0);
        int int0 = simplexTableau0.getSlackVariableOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-323.01302523788));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 866.3);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 20.08553692318767);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-56.730018022662));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        double[] doubleArray0 = new double[12];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1812.2);
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 20.08553692318767);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , 1.0 , relationship0 , doubleArray0 , 2553.9609728879996);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-443.205971) , 1078);
        int int0 = simplexTableau0.getNumSlackVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.5403023058681398);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.5403023058681398 , 1902);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-323.01302523788));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 866.3);
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        double[] doubleArray0 = new double[12];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1812.2);
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-1434.89));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , (-1.0));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1881.303668515149);
        int int0 = simplexTableau0.getNumArtificialVariables();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        double[] doubleArray0 = new double[2];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -701.895532318536;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(arrayRealVectorTest_RealVectorTestImpl0);
        org.junit.Assert.assertEquals(701.895532318536, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        double[] doubleArray0 = new double[12];
        doubleArray0[0] = 1812.2;
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = org.apache.commons.math3.optimization.linear.SimplexTableau.getInvertedCoefficientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        org.junit.Assert.assertEquals((-1812.2), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-323.01302523788));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 866.3);
        int int0 = simplexTableau0.getHeight();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1125.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1885.823 , 0);
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        double[] doubleArray0 = new double[8];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1125.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.GEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 1812.2);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1885.823 , 0);
        double double0 = simplexTableau0.getEntry(0, 0);
        org.junit.Assert.assertEquals((-1.0), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.08814452402835402);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.0);
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(5);
        org.junit.Assert.assertNull(integer0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        double[] doubleArray0 = new double[12];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1812.2);
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(0);
        org.junit.Assert.assertEquals(0, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply(0.0)));
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.EQ;
        arrayRealVector0.set(1.0);
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , relationship0 , (-6.663542893624021E-14));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.0);
        simplexTableau0.dropPhase1Objective();
        java.lang.Integer integer0 = simplexTableau0.getBasicRow(1);
        org.junit.Assert.assertEquals(1, ((int)(integer0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.5403023058681398);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.5403023058681398 , 1902);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        double[] doubleArray0 = new double[4];
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply(1.0)));
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , 1000.6365749);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-4417.145892505625));
        org.apache.commons.math3.linear.Array2DRowRealMatrix array2DRowRealMatrix0 = ((org.apache.commons.math3.linear.Array2DRowRealMatrix)(simplexTableau0.createTableau(false)));
        org.junit.Assert.assertEquals(1, array2DRowRealMatrix0.getRowDimension());
        org.junit.Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 20.08553692318767);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        double[] doubleArray1 = new double[8];
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray1);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply((-2171))));
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , (-56.730018022662) , relationship0 , ((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , 2340.688651632);
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-443.205971) , 1078);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        double[] doubleArray0 = new double[12];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1812.2);
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(doubleArray0 , relationship0 , 0.0);
        linkedList0.add(linearConstraint0);
        java.util.List<org.apache.commons.math3.optimization.linear.LinearConstraint> list0 = simplexTableau0.normalizeConstraints(linkedList0);
        org.junit.Assert.assertFalse(list0.isEmpty());
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.08814452402835402);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.0);
        boolean boolean0 = simplexTableau0.equals("0Pah4 BBn%$8Mb");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 901.3);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 901.3);
        simplexTableau0.divideRow(0, 901.3);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = 1.0;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply(0.0)));
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , relationship0 , (-6.663542893624021E-14));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 0.08814452402835402;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.08814452402835402);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply(0.08814452402835402)));
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , relationship0 , (-6.663542893624021E-14));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1.0);
        simplexTableau0.dropPhase1Objective();
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -3557.6856160177463;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-3557.6856160177463));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , (-3557.6856160177463));
        boolean boolean0 = simplexTableau0.isOptimal();
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        double[] doubleArray0 = new double[1];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 20.08553692318767);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , (-56.730018022662));
        boolean boolean0 = simplexTableau0.isOptimal();
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , (-218.813683610331));
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 2212.50838);
        simplexTableau0.dropPhase1Objective();
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.0;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl arrayRealVectorTest_RealVectorTestImpl0 = new org.apache.commons.math3.linear.ArrayRealVectorTest.RealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.linear.ArrayRealVector arrayRealVector0 = ((org.apache.commons.math3.linear.ArrayRealVector)(arrayRealVectorTest_RealVectorTestImpl0.mapMultiply(1.0)));
        org.apache.commons.math3.optimization.linear.Relationship relationship0 = org.apache.commons.math3.optimization.linear.Relationship.LEQ;
        org.apache.commons.math3.optimization.linear.LinearConstraint linearConstraint0 = new org.apache.commons.math3.optimization.linear.LinearConstraint(((org.apache.commons.math3.linear.RealVector)(arrayRealVector0)) , relationship0 , (-6.663542893624021E-14));
        linkedList0.add(linearConstraint0);
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.0;
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        org.apache.commons.math3.optimization.PointValuePair pointValuePair0 = simplexTableau0.getSolution();
        org.junit.Assert.assertNotNull(pointValuePair0);
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        double[] doubleArray0 = new double[12];
        org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new org.apache.commons.math3.linear.SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(((org.apache.commons.math3.linear.RealVector)(sparseRealVectorTest_SparseRealVectorTestImpl0)) , 0.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 1812.2);
        int int0 = simplexTableau0.getNumDecisionVariables();
        org.junit.Assert.assertEquals(12, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        double[] doubleArray0 = new double[6];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 1.0);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MINIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , false , 1.0);
        int int0 = simplexTableau0.getRhsOffset();
        org.junit.Assert.assertEquals(8, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        double[] doubleArray0 = new double[0];
        org.apache.commons.math3.optimization.linear.LinearObjectiveFunction linearObjectiveFunction0 = new org.apache.commons.math3.optimization.linear.LinearObjectiveFunction(doubleArray0 , 0.5403023058681398);
        java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint> linkedList0 = new java.util.LinkedList<org.apache.commons.math3.optimization.linear.LinearConstraint>();
        org.apache.commons.math3.optimization.GoalType goalType0 = org.apache.commons.math3.optimization.GoalType.MAXIMIZE;
        org.apache.commons.math3.optimization.linear.SimplexTableau simplexTableau0 = new org.apache.commons.math3.optimization.linear.SimplexTableau(linearObjectiveFunction0 , linkedList0 , goalType0 , true , 0.5403023058681398 , 1902);
        double[][] doubleArray1 = simplexTableau0.getData();
        org.junit.Assert.assertNotNull(doubleArray1);
    }
}

