/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 18 21:06:07 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Panel;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.block.AbstractBlock;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BlockFrame;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.ColumnArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.FlowArrangement;
import org.jfree.chart.block.GridArrangement;
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.WindItemRenderer;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.DateTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.util.TableOrder;
import org.jfree.chart.util.VerticalAlignment;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractBlock_ESTest extends AbstractBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      Color color0 = (Color)fastScatterPlot0.getRangeGridlinePaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, (-1894.72809866), 0.0);
      colorBlock0.setMargin(fastScatterPlot0.DEFAULT_INSETS);
      double double0 = colorBlock0.trimToContentHeight(1.0F);
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1894.72809866), colorBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("Tg", stringArray0);
      Color color0 = (Color)symbolAxis0.getGridBandAlternatePaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 298.44087, 0.05);
      colorBlock0.setMargin((-214.9279529), 298.44087, 0.0, (-1633.789535));
      double double0 = colorBlock0.trimToContentWidth((-1540.526609727));
      assertEquals(298.44087, colorBlock0.getContentXOffset(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setPadding((-1.0), (-1.0), (-1.0), (-1.0));
      double double0 = abstractBlock0.trimToContentWidth(0.0F);
      assertEquals((-1.0), abstractBlock0.getContentXOffset(), 0.01);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GridArrangement gridArrangement0 = new GridArrangement(0, 0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null, (Arrangement) gridArrangement0, (Arrangement) gridArrangement0);
      FlowArrangement flowArrangement0 = new FlowArrangement(legendTitle0.DEFAULT_HORIZONTAL_ALIGNMENT, legendTitle0.DEFAULT_VERTICAL_ALIGNMENT, (-1299.30146), (-1299.30146));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      double double0 = blockContainer0.trimToContentHeight(Double.POSITIVE_INFINITY);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = (Rectangle)polygon0.getBounds2D();
      textTitle0.trimPadding(rectangle0);
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-796.2895606), 1591.3682913);
      rectangle2D_Double0.y = (-796.2895606);
      abstractBlock0.trimPadding(rectangle2D_Double0);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      abstractBlock0.trimPadding(defaultCaret0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-796.2895606), 1591.3682913);
      abstractBlock0.trimPadding(rectangle2D_Double0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1.0), (-1.0), (-796.2895606), 1591.3682913);
      abstractBlock0.trimPadding(rectangle2D_Double0);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      EmptyBlock emptyBlock0 = new EmptyBlock((-234.883509), 0.0);
      RectangleInsets rectangleInsets0 = Axis.DEFAULT_AXIS_LABEL_INSETS;
      rectangleInsets0.trim(rectangle2D_Double0);
      emptyBlock0.trimMargin(rectangle2D_Double0);
      assertEquals((-234.883509), emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      Line2D.Double line2D_Double0 = new Line2D.Double(2336.06, 2336.06, 0.0, 50.0);
      Rectangle rectangle0 = line2D_Double0.getBounds();
      Rectangle rectangle1 = (Rectangle)emptyBlock0.trimMargin(rectangle0);
      assertEquals(50, rectangle1.y);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-796.2895606), 1591.3682913);
      rectangle2D_Double0.y = (-796.2895606);
      abstractBlock0.trimMargin(rectangle2D_Double0);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      Rectangle rectangle0 = rectangle2D_Float0.getBounds();
      abstractBlock0.trimMargin(rectangle0);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, (-1142.1));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-1626.25019), 1609.793728791, 0.0, 1609.793728791);
      emptyBlock0.trimMargin(rectangle2D_Double0);
      assertEquals((-1142.1), emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-2216.28802511), 0.0, (-2216.28802511), 0.0);
      rectangle2D_Double0.y = 1068.390061;
      LabelBlock labelBlock0 = new LabelBlock("");
      labelBlock0.trimBorder(rectangle2D_Double0);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      Panel panel0 = new Panel();
      Color color0 = Color.blue;
      SoftBevelBorder softBevelBorder0 = new SoftBevelBorder(0, color0, color0, color0, color0);
      Rectangle rectangle0 = softBevelBorder0.getInteriorRectangle((Component) panel0, 1, 0, 1, 1);
      Rectangle rectangle1 = (Rectangle)emptyBlock0.trimBorder(rectangle0);
      assertEquals((-2.0), rectangle1.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((-484.62768045), 0.0, 4615.967321705867, 0.0);
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1.0F), 4079.3F, 4079.3F, (-1.0F));
      Rectangle2D.Double rectangle2D_Double1 = (Rectangle2D.Double)rectangle2D_Float0.createIntersection(rectangle2D_Double0);
      blockContainer0.trimBorder(rectangle2D_Double1);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float((-1916.345F), (-1916.345F), 0.0F, (-2852.088F));
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      Color color0 = (Color)fastScatterPlot0.getRangeGridlinePaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, (-1894.72809866), 0.0);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)fastScatterPlot0.DEFAULT_INSETS.createInsetRectangle((Rectangle2D) rectangle2D_Float0);
      colorBlock0.trimBorder(rectangle2D_Double0);
      assertEquals((-1894.72809866), colorBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      DefaultCaret defaultCaret0 = new DefaultCaret();
      abstractBlock0.trimBorder(defaultCaret0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("hlSRr)$u");
      double double0 = textTitle0.getWidth();
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(160.464489520614, true, (XYToolTipGenerator) highLowItemLabelGenerator0);
      Color color0 = (Color)candlestickRenderer0.getItemOutlinePaint((-1915), 0);
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, (-1.0), (double) (-809.291F));
      double double0 = colorBlock0.getWidth();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-809.291015625), colorBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setPadding((-1.0), (-1.0), (-1.0), (-1.0));
      abstractBlock0.getPadding();
      assertEquals((-1.0), abstractBlock0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.getPadding();
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setPadding((-881.2986358532992), (-881.2986358532992), (-881.2986358532992), 250000.0);
      abstractBlock0.getPadding();
      assertEquals((-881.2986358532992), abstractBlock0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      GridArrangement gridArrangement0 = new GridArrangement(0, 1786);
      ColumnArrangement columnArrangement0 = new ColumnArrangement((HorizontalAlignment) null, (VerticalAlignment) null, 0.0, (double) stackedAreaRenderer0.ZERO);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) stackedAreaRenderer0, (Arrangement) gridArrangement0, (Arrangement) columnArrangement0);
      legendTitle0.setMargin(0.0, 0.0, (double) 1786, (-131.03131703));
      RectangleInsets rectangleInsets0 = legendTitle0.getMargin();
      assertEquals(1786.0, rectangleInsets0.getBottom(), 0.01);
      assertEquals(0.0, rectangleInsets0.getLeft(), 0.01);
      assertEquals(0.0, legendTitle0.getWidth(), 0.01);
      assertEquals((-131.03131703), rectangleInsets0.getRight(), 0.01);
      assertEquals(0.0, legendTitle0.getHeight(), 0.01);
      assertEquals(0.0, rectangleInsets0.getTop(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      GridArrangement gridArrangement0 = new GridArrangement(0, 1786);
      ColumnArrangement columnArrangement0 = new ColumnArrangement((HorizontalAlignment) null, (VerticalAlignment) null, 0.0, (double) stackedAreaRenderer0.ZERO);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) stackedAreaRenderer0, (Arrangement) gridArrangement0, (Arrangement) columnArrangement0);
      legendTitle0.setMargin(Double.POSITIVE_INFINITY, 5.0E9, (-1550.974440273191), 0.0);
      legendTitle0.getMargin();
      assertEquals(5.000000001E9, legendTitle0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Color color0 = (Color)XYPlot.DEFAULT_GRIDLINE_PAINT;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 2563.482941559, 10000.0);
      double double0 = colorBlock0.getHeight();
      assertEquals(2563.482941559, colorBlock0.getWidth(), 0.01);
      assertEquals(10000.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setHeight((-2610.418434703826));
      double double0 = abstractBlock0.getHeight();
      assertEquals((-2610.418434703826), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[5];
      SymbolAxis symbolAxis0 = new SymbolAxis("Tg", stringArray0);
      Color color0 = (Color)symbolAxis0.getGridBandAlternatePaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 298.44087, 0.05);
      BlockBorder blockBorder0 = new BlockBorder(1205.0, Double.POSITIVE_INFINITY, 0.05, (double) 0.0F, symbolAxis0.DEFAULT_TICK_MARK_PAINT);
      colorBlock0.setFrame(blockBorder0);
      double double0 = colorBlock0.getContentYOffset();
      assertEquals(1205.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setPadding((-3.453701687030731), (-3.453701687030731), (-3.453701687030731), (-3.453701687030731));
      double double0 = abstractBlock0.getContentYOffset();
      assertEquals((-3.453701687030731), abstractBlock0.getContentXOffset(), 0.01);
      assertEquals((-3.453701687030731), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      assertEquals(1.0, textTitle0.getContentXOffset(), 0.01);
      
      textTitle0.setPadding((double) 0.0F, (double) 0.0F, (double) 0.0F, (double) 0.0F);
      double double0 = textTitle0.getContentXOffset();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.setPadding((-881.2986358532992), (-881.2986358532992), (-881.2986358532992), 250000.0);
      double double0 = abstractBlock0.getContentXOffset();
      assertEquals((-881.2986358532992), abstractBlock0.getContentYOffset(), 0.01);
      assertEquals((-881.2986358532992), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)abstractBlock0.getBounds();
      rectangle2D_Float0.setRect(875.5442F, 6.0F, 3140.0F, 3140.0F);
      abstractBlock0.getBounds();
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      Rectangle2D.Float rectangle2D_Float0 = (Rectangle2D.Float)compositeTitle0.getBounds();
      rectangle2D_Float0.y = (-1951.2F);
      compositeTitle0.getBounds();
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SubCategoryAxis subCategoryAxis0 = new SubCategoryAxis("org.jfree.chart.block.AbstractBlock");
      LabelBlock labelBlock0 = new LabelBlock("org.jfree.chart.block.AbstractBlock", subCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
      labelBlock0.calculateTotalWidth(0.0F);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Font font0 = CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
      LabelBlock labelBlock0 = new LabelBlock("5ve_F@Kw!_?", font0);
      double double0 = labelBlock0.calculateTotalWidth(3182.0);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
      assertEquals(3182.0, double0, 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      double double0 = emptyBlock0.calculateTotalWidth((-4199.3));
      assertEquals((-4199.3), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Color color0 = (Color)defaultPolarItemRenderer0.getBaseFillPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, Double.POSITIVE_INFINITY, 861.62171877);
      colorBlock0.calculateTotalHeight(0.0);
      assertEquals(Double.POSITIVE_INFINITY, colorBlock0.getWidth(), 0.01);
      assertEquals(861.62171877, colorBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      double double0 = blockContainer0.calculateTotalHeight(680.673444642);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(680.673444642, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      WindItemRenderer windItemRenderer0 = new WindItemRenderer();
      HorizontalAlignment horizontalAlignment0 = Title.DEFAULT_HORIZONTAL_ALIGNMENT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, (-980.525), (double) windItemRenderer0.ZERO);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) windItemRenderer0, (Arrangement) flowArrangement0, (Arrangement) flowArrangement0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      double double0 = blockContainer0.calculateTotalHeight((-1.0));
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-3170.0649123822514), 100000.0);
      Size2D size2D0 = emptyBlock0.arrange((Graphics2D) null);
      assertEquals((-3170.0649123822514), size2D0.width, 0.01);
      assertEquals(100000.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultBoxAndWhiskerCategoryDataset defaultBoxAndWhiskerCategoryDataset0 = new DefaultBoxAndWhiskerCategoryDataset();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      SpiderWebPlot spiderWebPlot0 = new SpiderWebPlot((CategoryDataset) defaultBoxAndWhiskerCategoryDataset0, tableOrder0);
      LabelBlock labelBlock0 = new LabelBlock("+G.hL<ZaceC#tR!", spiderWebPlot0.DEFAULT_LABEL_FONT, spiderWebPlot0.DEFAULT_LABEL_BACKGROUND_PAINT);
      // Undeclared exception!
      try { 
        labelBlock0.trimPadding((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GridArrangement gridArrangement0 = new GridArrangement((-2264), (-1));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) gridArrangement0);
      // Undeclared exception!
      try { 
        blockContainer0.trimMargin((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("");
      LabelBlock labelBlock0 = new LabelBlock("", extendedCategoryAxis0.DEFAULT_AXIS_LABEL_FONT);
      // Undeclared exception!
      try { 
        labelBlock0.trimBorder((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        blockContainer0.toContentConstraint((RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GridArrangement gridArrangement0 = new GridArrangement(0, 0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null, (Arrangement) gridArrangement0, (Arrangement) gridArrangement0);
      FlowArrangement flowArrangement0 = new FlowArrangement(legendTitle0.DEFAULT_HORIZONTAL_ALIGNMENT, legendTitle0.DEFAULT_VERTICAL_ALIGNMENT, (-1299.30146), (-1299.30146));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) flowArrangement0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = chartRenderingInfo0.getPlotInfo();
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)plotRenderingInfo0.getDataArea();
      // Undeclared exception!
      try { 
        blockContainer0.drawBorder((Graphics2D) null, rectangle2D_Double0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      // Undeclared exception!
      try { 
        textTitle0.arrange((Graphics2D) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      PiePlot piePlot0 = new PiePlot();
      abstractBlock0.setPadding(piePlot0.DEFAULT_INSETS);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      RectangleInsets rectangleInsets0 = Title.DEFAULT_PADDING;
      abstractBlock0.setMargin(rectangleInsets0);
      abstractBlock0.getMargin();
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Color color0 = (Color)XYPlot.DEFAULT_GRIDLINE_PAINT;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 2563.482941559, 10000.0);
      double double0 = colorBlock0.getWidth();
      assertEquals(2563.482941559, double0, 0.01);
      assertEquals(10000.0, colorBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("");
      labelBlock0.setWidth(25000.0);
      assertEquals(25000.0, labelBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      double double0 = abstractBlock0.getHeight();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      AbstractBlock abstractBlock1 = (AbstractBlock)abstractBlock0.clone();
      assertEquals(0.0, abstractBlock1.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock1.getHeight(), 0.01);
      assertNotSame(abstractBlock1, abstractBlock0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Panel panel0 = new Panel();
      boolean boolean0 = abstractBlock0.equals(panel0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      Size2D size2D0 = compositeTitle0.arrange((Graphics2D) null);
      assertEquals(2.0, size2D0.width, 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(2.0, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle(1);
      // Undeclared exception!
      try { 
        dateTitle0.arrange((Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      // Undeclared exception!
      try { 
        abstractBlock0.setBounds((Rectangle2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bounds' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      compositeTitle0.setBounds(rectangle2D_Double0);
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      // Undeclared exception!
      try { 
        textTitle0.setPadding((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'padding' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LabelBlock labelBlock0 = new LabelBlock("pY]_c-+");
      // Undeclared exception!
      try { 
        labelBlock0.setFrame((BlockFrame) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'frame' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      // Undeclared exception!
      try { 
        textTitle0.setMargin((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'margin' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      double double0 = abstractBlock0.getContentYOffset();
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle();
      double double0 = textTitle0.getContentXOffset();
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      dateTitle0.setMargin((double) 0.0F, (-1499.41206813), (double) 2465.0F, 92.0);
      dateTitle0.getMargin();
      assertEquals((-1498.41206813), dateTitle0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      WindItemRenderer windItemRenderer0 = new WindItemRenderer();
      HorizontalAlignment horizontalAlignment0 = Title.DEFAULT_HORIZONTAL_ALIGNMENT;
      VerticalAlignment verticalAlignment0 = VerticalAlignment.BOTTOM;
      FlowArrangement flowArrangement0 = new FlowArrangement(horizontalAlignment0, verticalAlignment0, (-980.525), (double) windItemRenderer0.ZERO);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) windItemRenderer0, (Arrangement) flowArrangement0, (Arrangement) flowArrangement0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      blockContainer0.getID();
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      dateTitle0.getMargin();
      assertEquals(0.0, dateTitle0.getHeight(), 0.01);
      assertEquals(0.0, dateTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      dateTitle0.getFrame();
      assertEquals(0.0, dateTitle0.getHeight(), 0.01);
      assertEquals(0.0, dateTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      emptyBlock0.setID("9@SoVzBu^o");
      assertEquals("9@SoVzBu^o", emptyBlock0.getID());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      compositeTitle0.getPadding();
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      RingPlot ringPlot0 = new RingPlot();
      JFreeChart jFreeChart0 = new JFreeChart(" (", (Plot) ringPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(15, 10);
      assertEquals(0, bufferedImage0.getTileGridXOffset());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      Size2D size2D0 = abstractBlock0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.height, 0.01);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTitle dateTitle0 = new DateTitle();
      dateTitle0.setPadding((-1499.41206813), 1286.361895205561, (-392.72966451485087), (double) 0.0F);
      assertEquals((-1499.41206813), dateTitle0.getContentYOffset(), 0.01);
  }
}
