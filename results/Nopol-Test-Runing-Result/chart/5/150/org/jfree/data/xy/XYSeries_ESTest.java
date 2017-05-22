package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test000() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((double)(0)), ((java.lang.Number)((byte)(24))));
        xYSeries0.add(0.0, (-397.8));
        xYSeries0.add(((double)(0)), 0.0);
        xYSeries0.add((-250.247042335), ((java.lang.Number)(16)));
        xYSeries0.add(((double)(0)), ((double)(16)), true);
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test001() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), false);
        xYSeries0.add(0.0, ((double)(59)), false);
        xYSeries0.add(583.1477165561, ((double)(59)));
        xYSeries0.addOrUpdate(((double)(0)), ((double)(59)));
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(4, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test002() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(day0)) , false , false);
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.addOrUpdate(((double)(1)), 0.0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test003() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(java.lang.Double.NaN, 3218.870924306911, true);
        xYSeries0.add(((java.lang.Number)(512)), ((java.lang.Number)(24)));
        xYSeries0.add(((double)(0)), ((java.lang.Number)(16)));
        xYSeries0.update(0, 20);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test004() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), true);
        xYSeries0.add(0.0, ((double)(59)), false);
        xYSeries0.add(583.1477165561, ((double)(59)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test005() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true , true);
        xYSeries0.add(((double)(1)), ((double)(53)), true);
        xYSeries0.add(1.0, (-19.42712650496971));
        xYSeries0.updateByIndex(1, 1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test006() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true , true);
        xYSeries0.add(0.0, 0.0, true);
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.remove(((java.lang.Number)(integer0)));
        org.junit.Assert.assertTrue(xYDataItem1.equals(((java.lang.Object)(xYDataItem0))));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test007() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(59)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test008() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((double)(1)), 0.0);
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.remove(0);
        org.junit.Assert.assertEquals(1.0, xYDataItem1.getXValue(), 0.01);
        org.junit.Assert.assertEquals(0.0, xYDataItem1.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test009() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), false);
        xYSeries0.add(0.0, ((double)(59)), false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(2);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test010() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-221.1012303024473));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add((-247.9462060753947), ((java.lang.Number)(16)));
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.remove(0);
        org.junit.Assert.assertEquals(16.0, xYDataItem1.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-247.9462060753947), xYDataItem1.getXValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test011() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), false);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(0)));
        int int0 = xYSeries0.indexOf(0);
        org.junit.Assert.assertEquals(1, int0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test012() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((double)(0)), ((java.lang.Number)((byte)(24))));
        java.lang.Byte byte0 = ((java.lang.Byte)(xYSeries0.getY(0)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(((byte)(24)), ((byte)(byte0)));
    }

    @org.junit.Test(timeout = 4000)
    public void test013() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getY(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test014() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((double)(0)), ((java.lang.Number)((byte)(24))));
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getX(0)));
        org.junit.Assert.assertEquals(0.0, ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test015() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-221.1012303024473));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((java.lang.Number)((byte)(13))), ((java.lang.Number)(1668313716)), true);
        xYSeries0.getX(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test016() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add((-1793.3152305127178), (-397.8));
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getX(0)));
        org.junit.Assert.assertEquals((-1793.3152305127178), ((double)(double0)), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test017() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true);
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test018() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-221.1012303024473));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((java.lang.Number)((byte)(13))), ((java.lang.Number)(1668313716)), true);
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test019() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(java.lang.Double.NaN, 3218.870924306911, true);
        xYSeries0.add(((double)(16)), ((java.lang.Number)(0)));
        xYSeries0.add(xYDataItem0, true);
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.getDataItem(2);
        org.junit.Assert.assertEquals(0.0, xYDataItem1.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(16.0, xYDataItem1.getXValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test020() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(java.lang.Double.NaN, 3218.870924306911, true);
        xYSeries0.add(((double)(0)), ((java.lang.Number)(16)));
        xYSeries0.add(xYDataItem0, true);
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.getDataItem(2);
        org.junit.Assert.assertEquals(0.0, xYDataItem1.getXValue(), 0.01);
        org.junit.Assert.assertEquals(16.0, xYDataItem1.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test022() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(3049);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test023() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-865.553768710965) , (-865.553768710965));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(4, 3062);
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test024() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.createCopy(59, 59);
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test025() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), false);
        xYSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test026() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(53);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add(((java.lang.Number)(9999)), ((java.lang.Number)(9999)), false);
        xYSeries0.addOrUpdate(((java.lang.Number)(9999)), ((java.lang.Number)(9999)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test033() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-865.5538) , (-865.5538));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        java.util.Vector<java.awt.Panel> vector0 = new java.util.Vector<java.awt.Panel>();
        java.awt.Panel panel0 = new java.awt.Panel(((java.awt.LayoutManager)(null)));
        vector0.add(panel0);
        xYSeries0.data = ((java.util.List)(vector0));
        try {
            xYSeries0.remove(((java.lang.Number)(integer0)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test035() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-2250.7) , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , false);
        try {
            xYSeries0.remove((-961));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test039() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        try {
            xYSeries0.getDataItem((-1731));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test048() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-865.5538) , (-865.5538));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        java.util.Vector<java.awt.Panel> vector0 = new java.util.Vector<java.awt.Panel>();
        java.awt.Panel panel0 = new java.awt.Panel(((java.awt.LayoutManager)(null)));
        vector0.add(panel0);
        xYSeries0.data = ((java.util.List)(vector0));
        try {
            xYSeries0.addOrUpdate(0.0, (-1481.4));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test049() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true);
        javax.swing.table.DefaultTableModel defaultTableModel0 = new javax.swing.table.DefaultTableModel();
        java.util.Vector vector0 = defaultTableModel0.getDataVector();
        xYSeries0.data = ((java.util.List)(vector0));
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), true);
        try {
            xYSeries0.addOrUpdate(0.0, ((double)(59)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test050() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-865.5538) , (-865.5538));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        java.util.Vector<java.awt.Panel> vector0 = new java.util.Vector<java.awt.Panel>();
        java.awt.Panel panel0 = new java.awt.Panel(((java.awt.LayoutManager)(null)));
        vector0.add(panel0);
        xYSeries0.data = ((java.util.List)(vector0));
        try {
            xYSeries0.add(xYDataItem0, true);
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test056() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        double[][] doubleArray0 = new double[7][3];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(doubleArray0 , doubleArray0);
        org.jfree.chart.util.TableOrder tableOrder0 = org.jfree.chart.util.TableOrder.BY_ROW;
        org.jfree.data.category.CategoryToPieDataset categoryToPieDataset0 = new org.jfree.data.category.CategoryToPieDataset(((org.jfree.data.category.CategoryDataset)(defaultIntervalCategoryDataset0)) , tableOrder0 , 836);
        java.util.List list0 = categoryToPieDataset0.getKeys();
        xYSeries0.data = list0;
        try {
            xYSeries0.add(((double)(0)), ((java.lang.Number)((byte)(24))));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test062() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.add(java.lang.Double.NaN, ((java.lang.Number)(59)), false);
        int int0 = xYSeries0.indexOf(0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test063() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false);
        xYSeries0.add(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        int int0 = xYSeries0.indexOf(0);
        org.junit.Assert.assertEquals(0, int0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test065() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , false , false);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test066() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(java.lang.Double.NaN, 3218.870924306911, true);
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.getDataItem(2);
        org.junit.Assert.assertSame(xYDataItem0, xYDataItem1);
    }

    @org.junit.Test(timeout = 4000)
    public void test067() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(day0)) , false);
        try {
            xYSeries0.getX((-1336));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test071() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-221.1012303024473));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test072() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(integer0)) , false , false);
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test073() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(0.0, (-397.8));
        xYSeries0.hashCode();
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test074() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(53);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries1.add(((java.lang.Number)(-9999)), ((java.lang.Number)(9999)), false);
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test075() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(53);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        org.jfree.data.xy.XYSeries xYSeries1 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test076() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(xYSeries1.getAllowDuplicateXValues());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test077() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(53);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , true);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries1.setDescription("1{?m");
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        org.junit.Assert.assertFalse(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test078() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true , true);
        boolean boolean0 = xYSeries0.equals("3@J~uKi+h.6F3");
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test079() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test081() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(53);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , true);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        xYSeries1.setMaximumItemCount(53);
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        org.junit.Assert.assertEquals(53, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test082() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-221.1012303024473));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(0.0, ((java.lang.Number)(null)), false);
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test083() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , true);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((java.lang.Number)(0)), ((java.lang.Number)(59)));
        org.junit.Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test086() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(java.lang.Double.NaN, 3218.870924306911, true);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.update(0, 20);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test087() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-865.5538) , (-865.5538));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.clear();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test088() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(day0)) , false , false);
        try {
            xYSeries0.delete((-1153), 1);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test089() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true , true);
        xYSeries0.delete(836, (-753));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test090() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.add(((double)(1)), 0.0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test092() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        xYSeries0.add(((java.lang.Number)(9999)), ((java.lang.Number)(-9999)), true);
        xYSeries0.addOrUpdate(((java.lang.Number)(9999)), ((java.lang.Number)(9999)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test093() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(53);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , true);
        xYSeries0.add(((java.lang.Number)(9999)), ((java.lang.Number)(9999)), true);
        xYSeries0.addOrUpdate(((java.lang.Number)(9999)), ((java.lang.Number)(9999)));
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test095() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(0.0, (-397.8));
        xYSeries0.setMaximumItemCount(1);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test096() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-250.912853254528));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test098() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-865.5538) , (-865.5538));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DEFAULT_LAYER;
        try {
            xYSeries0.remove(((java.lang.Number)(integer0)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test099() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true , true);
        xYSeries0.add(xYDataItem0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test101() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)) , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(1733843290)) , ((java.lang.Number)(14)));
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test102() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem((-397.8) , (-221.1012303024473));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)));
        xYSeries0.add(((java.lang.Number)((byte)(13))), ((java.lang.Number)(1668313716)), true);
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test103() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 0.0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , true , true);
        xYSeries0.add(0.0, 0.0, true);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.clear();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test104() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , false , false);
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test105() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Null 'series' not permitted.")));
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
    }
}

