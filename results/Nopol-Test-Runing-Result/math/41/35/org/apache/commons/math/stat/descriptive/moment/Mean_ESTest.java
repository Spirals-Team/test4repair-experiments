package org.apache.commons.math.stat.descriptive.moment;


public class Mean_ESTest extends org.apache.commons.math.stat.descriptive.moment.Mean_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 0.2;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(0.2, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 2514.757;
        double[] doubleArray1 = new double[8];
        double double0 = mean0.evaluate(doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1976.155458759034;
        doubleArray0[1] = -2482.8880062156063;
        double double0 = mean0.evaluate(doubleArray0);
        org.junit.Assert.assertEquals((-72.39036392236743), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[2];
        mean0.incrementAll(doubleArray0);
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment(1944.0083760696);
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(1L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -0.040995487186535284;
        double double0 = mean0.evaluate(doubleArray0, 2, 2);
        org.junit.Assert.assertEquals((-0.020497743593267642), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((-1.0));
        mean0.copy();
        org.junit.Assert.assertEquals((-1.0), mean0.getResult(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[6];
        mean0.incrementAll(doubleArray0);
        mean0.copy();
        org.junit.Assert.assertEquals(6L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[6];
        double double0 = mean0.evaluate(doubleArray0, 2, 2);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean.copy(mean0, mean0);
        org.junit.Assert.assertEquals(0L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 2514.757;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0, 0, 2);
        org.junit.Assert.assertEquals(2514.757, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[2];
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
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.clear();
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((-0.3058015757857271));
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(1L, mean0.getN());
        org.junit.Assert.assertEquals((-0.3058015757857271), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.increment(java.lang.Double.NaN);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = new org.apache.commons.math.stat.descriptive.moment.Mean(mean0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, mean1.getResult(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = mean0.copy();
        org.junit.Assert.assertNotSame(mean1, mean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

