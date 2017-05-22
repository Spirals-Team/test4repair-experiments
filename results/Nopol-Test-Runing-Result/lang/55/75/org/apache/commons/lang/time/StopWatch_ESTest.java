package org.apache.commons.lang.time;


public class StopWatch_ESTest extends org.apache.commons.lang.time.StopWatch_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String string0 = stopWatch0.toSplitString();
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.unsplit();
        long long0 = stopWatch0.getTime();
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long0 = stopWatch0.getSplitTime();
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long0 = stopWatch0.getTime();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long0 = stopWatch0.getSplitTime();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test09() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.suspend();
        long long0 = stopWatch0.getTime();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long0 = stopWatch0.getTime();
        org.junit.Assert.assertEquals(0L, long0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
    }
}

