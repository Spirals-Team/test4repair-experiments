package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(7, 7);
        xYSeries0.setMaximumItemCount(7);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(7, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        xYSeries0.add(0.0, ((double)(59)), false);
        xYSeries0.add(0.0, java.lang.Double.NaN);
        xYSeries0.update(0, 59);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        xYSeries0.add(0.17068181315348374, ((double)(59)), false);
        xYSeries0.add(0.17068181315348374, 0.0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(23)));
        xYDataItem0.setY(((java.lang.Number)(0)));
        xYSeries0.add(xYDataItem0);
        xYSeries0.remove(((java.lang.Number)(0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(23)));
        xYSeries0.add(xYDataItem0, false);
        xYSeries0.remove(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(2)) , ((java.lang.Number)(-1022)));
        xYSeries0.add(xYDataItem0, false);
        xYSeries0.add(((java.lang.Number)(7)), ((java.lang.Number)((byte)(14))), true);
        int int0 = xYSeries0.indexOf(7);
        org.junit.Assert.assertEquals(1, int0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(0.0, ((double)(59)), false);
        xYSeries0.updateByIndex(0, 0);
        xYSeries0.getY(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        java.lang.Integer integer0 = ((java.lang.Integer)(xYSeries0.getY(0)));
        org.junit.Assert.assertEquals(59, ((int)(integer0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        xYSeries0.getX(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(((java.lang.Number)(999)), ((java.lang.Number)(0)), true);
        xYSeries0.getX(0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)), false);
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        xYSeries0.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(7, 0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test021() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add((-1154.0), 19.8931109122896);
        xYSeries0.addOrUpdate((-1154.0), ((double)(0L)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add((-1154.0), (-1154.0));
        xYSeries0.addOrUpdate((-1154.0), ((double)(28L)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add(((double)(0L)), 0.0);
        xYSeries0.addOrUpdate(((double)(0L)), ((double)(0L)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add(1479.771263339619, 0.0);
        xYSeries0.addOrUpdate(1479.771263339619, ((double)(0L)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test027() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false);
        try {
            xYSeries0.updateByIndex((-9999), (-9999));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test032() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        javax.swing.table.DefaultTableModel defaultTableModel0 = new javax.swing.table.DefaultTableModel(2 , 7);
        java.util.Vector vector0 = defaultTableModel0.getDataVector();
        xYSeries0.data = ((java.util.List)(vector0));
        try {
            xYSeries0.remove(((java.lang.Number)(23)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test038() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        try {
            xYSeries0.getX((-1987));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test042() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Before")));
        try {
            xYSeries0.delete((-867), 0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test045() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("columWidth")) , true , false);
        xYSeries0.addOrUpdate(1.7976931348623157E308, (-2186.5751883));
        try {
            xYSeries0.createCopy((-1), 23);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        try {
            xYSeries0.getDataItem((-2675));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(7, 7);
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries0.add(((double)(7)), ((double)(7)), true);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(7, 7);
        xYSeries1.setMaximumItemCount(7);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(7, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(-1)) , 452.7);
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , false , false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(7, 7);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1.0) , 2809.7467 , true , true);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(simpleHistogramBin0)) , false);
        boolean boolean0 = xYSeries0.equals(((java.lang.Object)(null)));
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)), false);
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)));
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        xYSeries0.update(0, 59);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test084() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        xYSeries0.clear();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test085() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("columWidth")) , true , false);
        xYSeries0.addOrUpdate(1.7976931348623157E308, (-2186.5751883));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.delete(0, 0);
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        xYSeries0.add(((double)(7)), ((double)(7)), true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(-1)) , 452.7);
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((double)(-1)) , 452.7);
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
        xYSeries0.getDataItem(1);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(0)) , ((java.lang.Number)(23)));
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.setMaximumItemCount(0);
        org.junit.Assert.assertEquals(0, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test094() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        try {
            xYSeries0.remove(((java.lang.Number)(23)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test097() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        try {
            xYSeries0.getY((-1375));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.data.statistics.SimpleHistogramBin simpleHistogramBin0 = new org.jfree.data.statistics.SimpleHistogramBin((-1.0) , 2809.7467 , true , true);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(simpleHistogramBin0)) , false);
        xYSeries0.add(((double)(2002)), ((java.lang.Number)(9)), false);
        xYSeries0.addOrUpdate(((java.lang.Number)(16)), ((java.lang.Number)(2)));
        xYSeries0.addOrUpdate(1.0, ((double)(-1508)));
        xYSeries0.addOrUpdate(((java.lang.Number)(16)), ((java.lang.Number)(68)));
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(4, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(7)));
        xYSeries0.add(0.0, ((java.lang.Number)(null)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test100() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("/L@Q3<9m|Fy(K ,ED")));
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add(((double)(0L)), 0.0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.clear();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }
}

