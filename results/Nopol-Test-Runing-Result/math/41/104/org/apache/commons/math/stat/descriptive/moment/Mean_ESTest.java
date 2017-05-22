package org.apache.commons.math.stat.descriptive.moment;


public class Mean_ESTest extends org.apache.commons.math.stat.descriptive.moment.Mean_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1027.639091389;
        doubleArray0[2] = 1027.639091389;
        doubleArray0[3] = 1027.639091389;
        doubleArray0[4] = 1027.639091389;
        doubleArray0[5] = 1027.639091389;
        doubleArray0[6] = 1027.639091389;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0);
        org.junit.Assert.assertEquals(1027.639091389, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -1.0;
        double double0 = mean0.evaluate(doubleArray0);
        org.junit.Assert.assertEquals((-0.33333333333333337), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean.copy(mean0, mean0);
        org.junit.Assert.assertEquals(0L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[7];
        mean0.incrementAll(doubleArray0, 1, 1);
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[9];
        mean0.incrementAll(doubleArray0);
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(9L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 713.7249203485;
        double[] doubleArray1 = new double[7];
        double double0 = mean0.evaluate(doubleArray1, doubleArray0);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -472.453;
        double double0 = mean0.evaluate(doubleArray0, 0, 2);
        org.junit.Assert.assertEquals((-236.2265), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment(0.0);
        mean0.copy();
        org.junit.Assert.assertEquals(0.0, mean0.getResult(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((-93.09741767687319));
        mean0.copy();
        org.junit.Assert.assertEquals(1L, mean0.getN());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 107.34692665161032;
        double double0 = mean0.evaluate(doubleArray0, doubleArray0, 0, 2);
        org.junit.Assert.assertEquals(107.34692665161032, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[4];
        double double0 = mean0.evaluate(doubleArray0, 0, 2);
        org.junit.Assert.assertEquals(0.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        double[] doubleArray0 = new double[9];
        double double0 = mean0.evaluate(doubleArray0, 0, 0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test29() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.clear();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, mean0.getResult(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.clear();
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        mean0.increment((-1842.033));
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals((-1842.033), double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        long long0 = mean0.getN();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean(((org.apache.commons.math.stat.descriptive.moment.FirstMoment)(null)));
        mean0.increment(1026.0614131321568);
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        org.apache.commons.math.stat.descriptive.moment.Mean mean1 = mean0.copy();
        org.junit.Assert.assertNotSame(mean1, mean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.apache.commons.math.stat.descriptive.moment.Mean mean0 = new org.apache.commons.math.stat.descriptive.moment.Mean();
        double double0 = mean0.getResult();
        org.junit.Assert.assertEquals(java.lang.Double.NaN, double0, 0.01);
    }
}

