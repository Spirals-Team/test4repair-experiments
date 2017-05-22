package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(0)) , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        xYSeries0.setMaximumItemCount(0);
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test02() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(2)) , false);
        xYSeries0.setMaximumItemCount(2);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)), false);
        xYSeries0.addOrUpdate(((double)(0)), ((double)(0)));
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(second0)));
        xYSeries0.add(((double)(-3188)), (-986.205151054952), false);
        xYSeries0.add(((double)(0)), 345.9);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((java.lang.Number)(integer0)), ((java.lang.Number)(integer0)));
        xYSeries0.indexOf(0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(second0)));
        xYSeries0.add(((double)(-3188)), (-986.205151054952), false);
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getY(0)));
        org.junit.Assert.assertEquals((-986.205151054952), ((double)(double0)), 0.01);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.addOrUpdate(((double)(0)), 2255.3555909348);
        xYSeries0.add(xYDataItem0, true);
        java.lang.Integer integer1 = ((java.lang.Integer)(xYSeries0.getY(1)));
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(400, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((double)(0)), ((double)(0)));
        xYSeries0.getX(0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(1.0, ((java.lang.Number)(999)), false);
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getX(0)));
        org.junit.Assert.assertEquals(1.0, ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(0)) , true);
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)) , true);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(1)) , false , false);
        xYSeries0.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(1, 29);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertFalse(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(second0)));
        try {
            xYSeries0.updateByIndex((-115), 0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        java.lang.Integer integer0 = new java.lang.Integer(1935897188);
        java.lang.Object[][] objectArray0 = new java.lang.Object[2][8];
        java.util.List list0 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        xYSeries0.data = list0;
        try {
            xYSeries0.remove(((java.lang.Number)(integer0)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(1117);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false);
        try {
            xYSeries0.remove((-9999));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        java.lang.Integer integer0 = new java.lang.Integer(1935897188);
        java.lang.Object[][] objectArray0 = new java.lang.Object[2][8];
        java.util.List list0 = org.jfree.data.xy.DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
        xYSeries0.data = list0;
        try {
            xYSeries0.indexOf(integer0);
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        try {
            xYSeries0.getY((-122));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        try {
            xYSeries0.getX((-2));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.time.Second second0 = new org.jfree.data.time.Second();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(second0)) , true , false);
        try {
            xYSeries0.getDataItem((-133));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        org.jfree.data.xy.XYSeriesCollection xYSeriesCollection0 = new org.jfree.data.xy.XYSeriesCollection(xYSeries0);
        java.util.List list0 = xYSeriesCollection0.getSeries();
        xYSeries0.data = list0;
        try {
            xYSeries0.addOrUpdate(((java.lang.Number)(integer0)), ((java.lang.Number)(1482250784)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)) , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(1162038354)), ((java.lang.Number)(null)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(0);
        xYSeries0.add(xYDataItem0);
        org.junit.Assert.assertEquals(java.lang.Double.NaN, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(0)) , true);
        xYSeries0.setMaximumItemCount(0);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(0)) , (-474.0));
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.addOrUpdate(((java.lang.Number)(integer0)), ((java.lang.Number)(1482250784)));
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
        java.lang.Integer integer1 = ((java.lang.Integer)(xYSeries0.getY(1)));
        org.junit.Assert.assertEquals(0, ((int)(integer1)));
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(1117);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        java.lang.Object[][] objectArray0 = new java.lang.Object[7][3];
        java.lang.Object[] objectArray1 = new java.lang.Object[5];
        objectArray1[0] = ((java.lang.Object)(xYSeries0));
        objectArray0[3] = objectArray1;
        javax.swing.JTable jTable0 = null;
        try {
            jTable0 = new javax.swing.JTable(objectArray0 , objectArray0[3]);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1297L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        xYSeries0.add(((double)(1297L)), ((java.lang.Number)(6)), true);
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , true);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1297L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false , false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(0)) , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        xYSeries0.setMaximumItemCount(0);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1297L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true , true);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1297L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1297L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        xYSeries0.add(0.0, ((java.lang.Number)(null)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1297L);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        try {
            xYSeries0.delete((-304), (-304));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-2635L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)));
        xYSeries0.delete(859, 443);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(1117);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add((-1057.2991053464018), ((java.lang.Number)(-9999)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(integer0)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.addOrUpdate(((java.lang.Number)(integer0)), ((java.lang.Number)(1482250784)));
        xYSeries0.addOrUpdate(((double)(0)), 2255.3555909348);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond(1L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem0 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)(fixedMillisecond0)) , 0.0);
        java.lang.Integer integer0 = javax.swing.JLayeredPane.FRAME_CONTENT_LAYER;
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(timeSeriesDataItem0)) , false , false);
        try {
            xYSeries0.remove(((java.lang.Number)(integer0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)) , false);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test95() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)((byte)(4))) , ((java.lang.Number)(1886545201)));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }
}

