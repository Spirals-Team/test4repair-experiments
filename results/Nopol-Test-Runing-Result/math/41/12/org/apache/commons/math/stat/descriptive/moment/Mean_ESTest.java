package org.apache.commons.math.stat.descriptive.moment;


public class Mean_ESTest extends org.apache.commons.math.stat.descriptive.moment.Mean_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[3];
        doubleArray0[2] = 944.74545643;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(944.74545643, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[7];
        double double0 = mean0.evaluate(doubleArray0, java.lang.Integer.MAX_VALUE, java.lang.Integer.MAX_VALUE);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment(0.0);
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -792.9602371454;
        mean0.incrementAll(doubleArray0);
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(9L, mean0.getN());
        org.junit.Assert.assertEquals((-88.10669301615557), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = ((double)(1));
        double double0 = mean0.evaluate(doubleArray0, doubleArray1);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[4];
        doubleArray0[1] = -3889.3856;
        double double0 = mean0.evaluate(doubleArray0, 1, 3);
        org.junit.Assert.assertEquals((-1296.4618666666665), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -792.9602371454;
        mean0.incrementAll(doubleArray0);
        mean0.copy();
        org.junit.Assert.assertEquals(9L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[9];
        mean0.incrementAll(doubleArray0);
        mean0.copy();
        org.junit.Assert.assertEquals(9L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = 0.03724171653908989;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0, 1, 1);
        org.junit.Assert.assertEquals(0.03724171653908989, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.increment(0.0);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean.copy(mean0, mean0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, mean0.getResult(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[3];
        double double0 = mean0.evaluate(doubleArray0, 0, 0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.clear();
        org.junit.Assert.assertEquals(0L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean(mean0.moment);
        mean1.clear();
        org.junit.Assert.assertNotSame(mean0, mean1);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[6];
        mean0.incrementAll(doubleArray0);
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(0.0, mean0.getResult(), 0.01);
        org.junit.Assert.assertEquals(6L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean(mean0);
        org.junit.Assert.assertEquals(0L, mean1.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test38() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = mean0.copy();
        org.junit.Assert.assertNotSame(mean1, mean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

