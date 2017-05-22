package org.apache.commons.math.optimization.direct;


public class MultiDirectional_ESTest extends org.apache.commons.math.optimization.direct.MultiDirectional_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[3];
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = -2.7675177407522664;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 0.0);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePair0;
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
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[3];
        double[] doubleArray0 = new double[9];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 0.0);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePair0;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 3334.31233108);
        realPointValuePairArray0[2] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional(3955.4399080592616 , 1221.136);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[2];
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 3955.4399080592616;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , (-2882.17));
        realPointValuePairArray0[0] = realPointValuePair0;
        double[] doubleArray1 = new double[6];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray1 , 0.0);
        realPointValuePairArray0[1] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

