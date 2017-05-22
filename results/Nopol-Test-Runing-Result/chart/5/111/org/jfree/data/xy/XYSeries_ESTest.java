package org.jfree.data.xy;


public class XYSeries_ESTest extends org.jfree.data.xy.XYSeries_ESTest_scaffolding {
    @org.junit.Test(timeout = 4000)
    public void test03() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)));
        xYSeries0.add(((double)(1)), ((java.lang.Number)(1936744803)));
        xYSeries0.add((-891.761422), ((double)(1)));
        xYSeries0.update(1, 4);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test05() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        xYSeries0.addOrUpdate(((java.lang.Number)(2)), ((java.lang.Number)(4096)));
        xYSeries0.add((-505.0), ((java.lang.Number)(1)));
        xYSeries0.add(((java.lang.Number)(2)), ((java.lang.Number)(null)));
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test06() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(1)) , true , true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(4)) , ((java.lang.Number)(1200)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(((java.lang.Number)(1852662636)), ((java.lang.Number)(3)));
        xYSeries0.updateByIndex(1, 1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test08() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)));
        xYSeries0.add(((double)(1)), ((java.lang.Number)(1936744803)));
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.remove(((java.lang.Number)(1)));
        org.junit.Assert.assertEquals(1.936744803E9, xYDataItem0.getYValue(), 0.01);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)));
        xYSeries0.add(((double)(1)), ((double)(4)), false);
        xYSeries0.add((-891.761422), ((double)(1)));
        int int0 = xYSeries0.indexOf(1);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertEquals(1, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test14() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.addOrUpdate(((java.lang.Number)(23)), ((java.lang.Number)(23)));
        xYSeries0.getY(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)));
        xYSeries0.add(((double)(1)), ((java.lang.Number)(1936744803)));
        xYSeries0.add((-891.761422), ((double)(1)));
        org.junit.Assert.assertEquals(2, xYSeries0.getItemCount());
        java.lang.Double double0 = ((java.lang.Double)(xYSeries0.getX(1)));
        org.junit.Assert.assertEquals(1.0, ((double)(double0)), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)));
        xYSeries0.add(((double)(1)), ((java.lang.Number)(1936744803)));
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(1)) , true , true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(4)) , ((java.lang.Number)(1200)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.addOrUpdate(((double)(23)), (-1222.5021571363));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        org.jfree.data.xy.XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        org.junit.Assert.assertEquals((-1222.5021571363), xYDataItem0.getYValue(), 0.01);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.getAutoSort();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , false , false);
        xYSeries0.getAllowDuplicateXValues();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.setNotify(false);
        org.jfree.data.xy.XYSeries xYSeries1 = xYSeries0.createCopy(244, (-648));
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        org.jfree.data.time.Millisecond millisecond0 = new org.jfree.data.time.Millisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(millisecond0)));
        java.lang.Number[][] numberArray0 = new java.lang.Number[5][2];
        org.jfree.data.category.DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new org.jfree.data.category.DefaultIntervalCategoryDataset(numberArray0 , numberArray0);
        java.util.List list0 = defaultIntervalCategoryDataset0.getRowKeys();
        xYSeries0.data = list0;
        try {
            xYSeries0.remove(((java.lang.Number)(999)));
            org.junit.Assert.fail("Expecting exception: ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        try {
            xYSeries0.remove((-1084));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        org.jfree.data.time.Year year0 = new org.jfree.data.time.Year(312);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(year0)));
        try {
            xYSeries0.getX((-119));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , false , false);
        try {
            xYSeries0.getDataItem((-1));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test37() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true , false);
        try {
            xYSeries0.delete((-2851), (-98));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test39() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        xYSeries0.addOrUpdate(((java.lang.Number)(12)), ((java.lang.Number)(4096)));
        try {
            xYSeries0.createCopy((-520), 4096);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , false , false);
        xYSeries0.addOrUpdate(((java.lang.Number)(1)), ((java.lang.Number)(0.5F)));
        int int0 = xYSeries0.indexOf(((byte)(124)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)("Couldn't clone XYDataItem!")) , true , false);
        xYSeries0.add(((java.lang.Number)((byte)(126))), ((java.lang.Number)(null)), false);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , true);
        xYSeries0.getItemCount();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        org.jfree.data.time.Week week0 = new org.jfree.data.time.Week();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(week0)) , true , false);
        xYSeries0.hashCode();
        org.junit.Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries0.add(((java.lang.Number)(2)), ((java.lang.Number)(null)));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test65() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        xYSeries0.setMaximumItemCount(2);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertEquals(2, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        org.junit.Assert.assertTrue(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        xYSeries0.setDescription("s2tB$BnIM'9qE");
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertFalse(xYSeries1.equals(((java.lang.Object)(xYSeries0))));
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test67() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.addOrUpdate(((double)(12L)), (-1222.5021571363));
        xYSeries0.createCopy(244, (-648));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        xYSeries0.add(((java.lang.Number)(2)), ((java.lang.Number)(null)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        org.jfree.data.time.Quarter quarter0 = new org.jfree.data.time.Quarter();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(quarter0)));
        xYSeries0.add(((double)(1)), ((java.lang.Number)(1936744803)));
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.update(1, 4);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        xYSeries0.clear();
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)) , true);
        xYSeries0.delete(23, 0);
        org.junit.Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        org.junit.Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(0)) , false , false);
        xYSeries0.add(((double)(0)), ((java.lang.Number)(-126)), true);
        xYSeries0.createCopy(0, 0);
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(1)) , true , true);
        org.jfree.data.xy.XYDataItem xYDataItem0 = new org.jfree.data.xy.XYDataItem(((java.lang.Number)(4)) , ((java.lang.Number)(1200)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(((double)(1200)), ((java.lang.Number)(null)), true);
        xYSeries0.add(xYDataItem0, false);
        org.junit.Assert.assertEquals(3, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        org.jfree.data.time.Day day0 = new org.jfree.data.time.Day();
        org.jfree.data.time.Hour hour0 = new org.jfree.data.time.Hour(2384 , day0);
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(hour0)));
        try {
            xYSeries0.updateByIndex((-87), 23);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        org.jfree.data.time.Month month0 = new org.jfree.data.time.Month();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(month0)));
        xYSeries0.addOrUpdate(0.0, ((double)(4521)));
        xYSeries0.toArray();
        org.junit.Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @org.junit.Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        org.jfree.data.time.FixedMillisecond fixedMillisecond0 = new org.jfree.data.time.FixedMillisecond();
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(fixedMillisecond0)) , true);
        try {
            xYSeries0.getY((-1036));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        org.jfree.data.xy.XYSeries xYSeries0 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)(48)) , true , true);
        org.jfree.data.xy.XYSeries xYSeries1 = ((org.jfree.data.xy.XYSeries)(xYSeries0.clone()));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        org.junit.Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        org.junit.Assert.assertTrue(boolean0);
        org.junit.Assert.assertNotSame(xYSeries1, xYSeries0);
        org.junit.Assert.assertTrue(xYSeries1.getAutoSort());
        org.junit.Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }
}

