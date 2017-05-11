/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 24 13:52:08 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StatisticalBarRenderer_ESTest extends StatisticalBarRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      categoryStepRenderer_State0.setBarWidth(10);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Float0, combinedDomainCategoryPlot0, subCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, 0, 0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 87, (-5000.855198565), 225.0, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      categoryStepRenderer_State0.setBarWidth(10);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((float) (-2061), 2.0F, (-2894.8F), 2.0F);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.DEFAULT_TICK_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, subCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, 169, 1059);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 169, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 0.2, (Number) 90, (Comparable) 0.2, (Comparable) 0.2);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.DEFAULT_TICK_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0);
      statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, subCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, 0, 0);
      assertEquals((-1), sunGraphics2D0.eargb);
      assertEquals((-1), sunGraphics2D0.pixel);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorPaint((Paint) null);
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertNull(color0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.DEFAULT_TICK_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, (CategoryAxis) null, numberAxis0, defaultStatisticalCategoryDataset0, 1, (-1412));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      JScrollPane jScrollPane0 = new JScrollPane((Component) null);
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      NumberAxis numberAxis0 = new NumberAxis();
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawVerticalItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle0, categoryPlot0, extendedCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, (-1), 710);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((float) 0, (float) 10, (float) 0, (float) 0);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.DEFAULT_TICK_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, subCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, (-3034), 2165, (-1255));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((float) (-2061), 2.0F, 2.0F, 2.0F);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.DEFAULT_TICK_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem((Graphics2D) null, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, (CategoryAxis) null, numberAxis0, defaultStatisticalCategoryDataset0, 169, 1059);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(500, 10, (-5000.855198565), 225.0, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((float) (-2061), 2.0F, 2.0F, 2.0F);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)numberAxis0.DEFAULT_TICK_LABEL_INSETS.createOutsetRectangle((Rectangle2D) rectangle2D_Float0);
      // Undeclared exception!
      try { 
        statisticalBarRenderer0.drawHorizontalItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Double0, combinedDomainCategoryPlot0, subCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, (-1768), 1059);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      boolean boolean0 = statisticalBarRenderer0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      DefaultStatisticalCategoryDataset defaultStatisticalCategoryDataset0 = new DefaultStatisticalCategoryDataset();
      defaultStatisticalCategoryDataset0.add((Number) 0.2, (Number) 90, (Comparable) 0.2, (Comparable) 0.2);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot((CategoryDataset) defaultStatisticalCategoryDataset0);
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis((String) null);
      NumberAxis numberAxis0 = new NumberAxis();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 15, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      CategoryStepRenderer.State categoryStepRenderer_State0 = new CategoryStepRenderer.State(plotRenderingInfo0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((float) 0, (float) 10, (float) 0, (float) 0);
      statisticalBarRenderer0.drawItem(sunGraphics2D0, categoryStepRenderer_State0, rectangle2D_Float0, combinedDomainCategoryPlot0, subCategoryAxis0, numberAxis0, defaultStatisticalCategoryDataset0, 0, 0, 1);
      assertEquals((-1), sunGraphics2D0.pixel);
      assertEquals((-1), sunGraphics2D0.eargb);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      statisticalBarRenderer0.setErrorIndicatorStroke((Stroke) null);
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertNull(basicStroke0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      BasicStroke basicStroke0 = (BasicStroke)statisticalBarRenderer0.getErrorIndicatorStroke();
      assertEquals(0.5F, basicStroke0.getLineWidth(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer0 = new StatisticalBarRenderer();
      Color color0 = (Color)statisticalBarRenderer0.getErrorIndicatorPaint();
      assertEquals(128, color0.getRed());
  }
}