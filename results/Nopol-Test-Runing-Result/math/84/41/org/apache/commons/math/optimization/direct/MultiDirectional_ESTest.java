package org.apache.commons.math.optimization.direct;


public class MultiDirectional_ESTest extends org.apache.commons.math.optimization.direct.MultiDirectional_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[9];
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -1137.519697;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 2947.0);
        realPointValuePairArray0[0] = realPointValuePair0;
        realPointValuePairArray0[1] = realPointValuePair0;
        realPointValuePairArray0[2] = realPointValuePairArray0[0];
        realPointValuePairArray0[3] = realPointValuePairArray0[1];
        double[] doubleArray1 = new double[2];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray1 , 1167.039 , true);
        realPointValuePairArray0[4] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test1() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional((-2931.4837503598715) , 0.0);
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[2];
        double[] doubleArray0 = new double[3];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 0.0);
        realPointValuePairArray0[0] = realPointValuePair0;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , (-2931.4837503598715));
        realPointValuePairArray0[1] = realPointValuePair1;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

