package org.apache.commons.math.optimization.direct;


public class MultiDirectional_ESTest extends org.apache.commons.math.optimization.direct.MultiDirectional_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[11];
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 15.115699207652078;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 15.115699207652078);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePairArray0[0];
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test1() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[11];
        double[] doubleArray0 = new double[5];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 15.115699207652078);
        realPointValuePairArray0[0] = realPointValuePair0;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 15.115699207652078);
        realPointValuePairArray0[1] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0 , (-522.541533));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[1];
        double[] doubleArray0 = new double[1];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , (-522.541533) , true);
        realPointValuePairArray0[0] = realPointValuePair0;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test6() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional(698.5917121378 , 698.5917121378);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[4];
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = 1.013;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 698.5917121378 , true);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePair0;
        double[] doubleArray1 = new double[8];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray1 , 2.0 , true);
        realPointValuePairArray0[2] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

