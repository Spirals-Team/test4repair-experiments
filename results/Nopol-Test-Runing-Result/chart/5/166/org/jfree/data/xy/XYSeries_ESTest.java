package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test00() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add((-169.85518981191956), 0.0, true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-169.85518981191956));
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)((byte)(18))));
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(xYDataItem0, false);
        xYSeries0.add((-169.85518981191956), ((java.lang.Number)(8257536)), true);
        xYSeries0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test01() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-169.85518981191956));
        xYSeries0.add(xYDataItem0);
        xYSeries0.addOrUpdate(((double)(5)), (-169.85518981191956));
        xYSeries0.add(xYDataItem0, false);
        xYSeries0.add((-169.85518981191956), ((java.lang.Number)(1178815570)), true);
        xYSeries0.hashCode();
    }

    @org.junit.Test(timeout = 4000)
    public void test04() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-169.85518981191956));
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)(5)));
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)((byte)(18))));
        xYSeries0.indexOf(((byte)(18)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test07() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add((-169.85518981191956), 0.0, true);
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)(5)));
        int int0 = xYSeries0.indexOf(((byte)(18)));
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(1, int0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test11() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-179.9629326));
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)(5)));
        xYSeries0.add(xYDataItem0);
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
        org.jfree.data.xy.XYDataItem xYDataItem1 = xYSeries0.getDataItem(1);
        org.junit.Assert.assertSame(xYDataItem1, xYDataItem0);
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-179.9629326));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(xYDataItem0)) , false , true);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week((-959) , (-4));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true , false);
        boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertFalse(boolean0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("\ufffd")) , false);
        try {
            xYSeries0.updateByIndex((-1383), 2);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test25() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year((-1377));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)) , true);
        try {
            xYSeries0.getY((-9999));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(629);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(spreadsheetDate0)) , true , true);
        try {
            xYSeries0.getX((-16));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test30() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(1139);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        xYSeries0.add(2365.9560694, ((java.lang.Number)(9999)));
        try {
            xYSeries0.createCopy((-9999), 9999);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        org.jfree.data.time.Minute minute0 = new org.jfree.data.time.Minute();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(minute0)) , false , false);
        xYSeries0.addOrUpdate(2276.7223, ((double)(0)));
        int int0 = xYSeries0.indexOf(0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(465);
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week(465 , year0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)));
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.addOrUpdate(((java.lang.Number)(9999)), ((java.lang.Number)(-9999)));
        xYSeries0.addOrUpdate(((java.lang.Number)(53)), ((java.lang.Number)(53)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add(1385.51472446, 0.0, true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , 1385.51472446);
        xYSeries0.add(xYDataItem0);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test46() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("\ufffd")) , false);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(0.0 , 1.0);
        xYSeries0.add(xYDataItem0, true);
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("\ufffd")) , false);
        try {
            xYSeries0.getDataItem((-1383));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("\ufffd")) , false);
        try {
            xYSeries0.remove((-1383));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("")) , false , false);
        xYSeries0.hashCode();
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add((-169.85518981191956), 0.0, true);
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)((byte)(18))));
        xYSeries0.hashCode();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(629);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(spreadsheetDate0)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        boolean boolean0 = xYSeries0.equals(year0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(629);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(spreadsheetDate0)) , true , true);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test57() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1595L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false , false);
        xYSeries0.add(((java.lang.Number)(2)), ((java.lang.Number)(16)), false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(0, (-1383));
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy((-9999), 9999);
        xYSeries0.setMaximumItemCount(2);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(2, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add((-169.85518981191956), 0.0, true);
        xYSeries0.toArray();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        java.lang.Integer integer0 = javax.swing.JLayeredPane.DRAG_LAYER;
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(integer0)) , false , false);
        try {
            xYSeries0.delete((-2494), 590);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)));
        xYSeries0.delete(11, 1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add((-169.85518981191956), 0.0, true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-169.85518981191956));
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)(5)));
        xYSeries0.setMaximumItemCount(2);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(2, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond((-1595L));
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , false , false);
        xYSeries0.add(((java.lang.Number)(2)), ((java.lang.Number)(16)), false);
        xYSeries0.update(2, 1751474532);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.add((-169.85518981191956), 0.0, true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(234.2 , (-169.85518981191956));
        xYSeries0.add(((java.lang.Number)((byte)(18))), ((java.lang.Number)(5)));
        xYSeries0.add(xYDataItem0);
        xYSeries0.setMaximumItemCount(2);
        org.junit.Assert.assertEquals(2, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        org.jfree.data.time.SpreadsheetDate spreadsheetDate0 = new org.jfree.data.time.SpreadsheetDate(629);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(spreadsheetDate0)) , true , true);
        boolean boolean0 = xYSeries0.getAutoSort();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        boolean boolean0 = xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        try {
            xYSeries0.remove(((java.lang.Number)(999)));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)) , false);
        xYSeries0.add(((double)(0)), ((java.lang.Number)(0)), true);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.remove(0);
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(1139);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        int int0 = xYSeries0.getMaximumItemCount();
        org.junit.Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(java.lang.Integer.MAX_VALUE, int0);
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }
}

