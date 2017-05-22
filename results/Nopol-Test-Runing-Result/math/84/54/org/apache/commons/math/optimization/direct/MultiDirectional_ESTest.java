package org.apache.commons.math.optimization.direct;


public class MultiDirectional_ESTest extends org.apache.commons.math.optimization.direct.MultiDirectional_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.1735 , 0.1735);
        double[] doubleArray0 = new double[6];
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[7];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 0.0);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePair0;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 5182.722477 , false);
        realPointValuePairArray0[2] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        doubleArray0[4] = 0.1735;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0 , 0.0);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[4];
        double[] doubleArray0 = new double[8];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 0.0);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePairArray0[0];
        realPointValuePairArray0[2] = realPointValuePair0;
        realPointValuePairArray0[3] = realPointValuePairArray0[0];
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

