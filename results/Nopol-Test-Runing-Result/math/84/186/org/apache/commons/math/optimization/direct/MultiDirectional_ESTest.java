package org.apache.commons.math.optimization.direct;


public class MultiDirectional_ESTest extends org.apache.commons.math.optimization.direct.MultiDirectional_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test1() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional((-2473.0534207048) , (-2473.0534207048));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[8];
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2473.0534207048;
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , 704.99692887);
        realPointValuePairArray0[1] = realPointValuePair0;
        realPointValuePairArray0[0] = realPointValuePair0;
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional((-2473.0534207048) , (-2473.0534207048));
        org.apache.commons.math.optimization.RealPointValuePair[] realPointValuePairArray0 = new org.apache.commons.math.optimization.RealPointValuePair[8];
        double[] doubleArray0 = new double[0];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair0 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray0 , (-2473.0534207048) , true);
        double[] doubleArray1 = new double[9];
        org.apache.commons.math.optimization.RealPointValuePair realPointValuePair1 = new org.apache.commons.math.optimization.RealPointValuePair(doubleArray1 , 704.99692887);
        realPointValuePairArray0[1] = realPointValuePair1;
        realPointValuePairArray0[2] = realPointValuePair0;
        realPointValuePairArray0[0] = realPointValuePairArray0[1];
        multiDirectional0.simplex = realPointValuePairArray0;
        try {
            multiDirectional0.iterateSimplex(((java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair>)(null)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }
}

