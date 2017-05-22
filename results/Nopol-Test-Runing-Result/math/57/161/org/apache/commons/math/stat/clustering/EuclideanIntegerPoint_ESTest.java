package org.apache.commons.math.stat.clustering;


public class EuclideanIntegerPoint_ESTest extends org.apache.commons.math.stat.clustering.EuclideanIntegerPoint_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        int[] intArray0 = new int[7];
        intArray0[1] = 65;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        euclideanIntegerPoint0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        intArray0[6] = java.lang.Integer.MAX_VALUE;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        java.util.LinkedList<org.apache.commons.math.stat.clustering.EuclideanIntegerPoint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.stat.clustering.EuclideanIntegerPoint>();
        linkedList0.add(euclideanIntegerPoint0);
        linkedList0.add(euclideanIntegerPoint0);
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = euclideanIntegerPoint0.centroidOf(linkedList0);
        boolean boolean0 = euclideanIntegerPoint1.equals(euclideanIntegerPoint0);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertFalse(euclideanIntegerPoint0.equals(((java.lang.Object)(euclideanIntegerPoint1))));
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        int[] intArray0 = new int[6];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[7];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        int[] intArray0 = new int[1];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = euclideanIntegerPoint0.getPoint();
        org.junit.Assert.assertArrayEquals(new int[]{ 0 }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        int[] intArray0 = new int[0];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = euclideanIntegerPoint0.getPoint();
        org.junit.Assert.assertArrayEquals(new int[]{  }, intArray1);
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        int[] intArray0 = new int[3];
        intArray0[1] = 1;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[4];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        double double0 = euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint1);
        org.junit.Assert.assertEquals(1.0, double0, 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(((int[])(null)));
        int[] intArray0 = euclideanIntegerPoint0.getPoint();
        org.junit.Assert.assertNull(intArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        java.lang.String string0 = euclideanIntegerPoint0.toString();
        org.junit.Assert.assertEquals("(0,0,0,0,0,0,0,0,0)", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        intArray0[6] = java.lang.Integer.MAX_VALUE;
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        java.util.LinkedList<org.apache.commons.math.stat.clustering.EuclideanIntegerPoint> linkedList0 = new java.util.LinkedList<org.apache.commons.math.stat.clustering.EuclideanIntegerPoint>();
        linkedList0.add(euclideanIntegerPoint0);
        linkedList0.add(euclideanIntegerPoint0);
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = euclideanIntegerPoint0.centroidOf(linkedList0);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(euclideanIntegerPoint1.equals(((java.lang.Object)(euclideanIntegerPoint0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        int[] intArray0 = new int[22];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        int[] intArray1 = new int[8];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint1 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray1);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint1);
        org.junit.Assert.assertFalse(euclideanIntegerPoint1.equals(((java.lang.Object)(euclideanIntegerPoint0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(((int[])(null)));
        boolean boolean0 = euclideanIntegerPoint0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        boolean boolean0 = euclideanIntegerPoint0.equals(euclideanIntegerPoint0);
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        int[] intArray0 = new int[9];
        org.apache.commons.math.stat.clustering.EuclideanIntegerPoint euclideanIntegerPoint0 = new org.apache.commons.math.stat.clustering.EuclideanIntegerPoint(intArray0);
        euclideanIntegerPoint0.distanceFrom(euclideanIntegerPoint0);
    }
}

