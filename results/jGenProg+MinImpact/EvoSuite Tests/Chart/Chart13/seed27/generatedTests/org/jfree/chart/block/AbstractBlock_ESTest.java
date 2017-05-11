/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 28 16:16:22 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfGraphics2D;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.AbstractBlock;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BlockFrame;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.CenterArrangement;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.ColumnArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.WaferMapPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.general.WaferMapDataset;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractBlock_ESTest extends AbstractBlock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      legendTitle0.setMargin(0.0, 0.0, (double) 4266.712F, (-1.0));
      double double0 = legendTitle0.trimToContentHeight(0.0);
      assertEquals(0.0, legendTitle0.getWidth(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, legendTitle0.getContentYOffset(), 0.01);
      assertEquals(1.0, legendTitle0.getContentXOffset(), 0.01);
      assertEquals(0.0, legendTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      legendTitle0.setMargin(0.0, 0.0, (double) 0.0F, (-1.0));
      double double0 = legendTitle0.trimToContentWidth(0.0);
      assertEquals(0.0, legendTitle0.getHeight(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, legendTitle0.getWidth(), 0.01);
      assertEquals(1.0, legendTitle0.getContentYOffset(), 0.01);
      assertEquals(1.0, legendTitle0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      BlockBorder blockBorder0 = new BlockBorder();
      legendTitle0.setFrame(blockBorder0);
      double double0 = legendTitle0.getContentYOffset();
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Color color0 = (Color)piePlot3D0.getLabelPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 3980.03, (-1994.18));
      BlockBorder blockBorder0 = new BlockBorder();
      colorBlock0.setFrame(blockBorder0);
      double double0 = colorBlock0.getContentXOffset();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      DefaultCategoryItemRenderer defaultCategoryItemRenderer0 = new DefaultCategoryItemRenderer();
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) defaultCategoryItemRenderer0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      PdfContentByte pdfContentByte0 = new PdfContentByte((PdfWriter) null);
      PdfGraphics2D pdfGraphics2D0 = (PdfGraphics2D)pdfContentByte0.createGraphicsShapes(2571.76F, (float) 15, true, (-3020.0F));
      blockContainer0.drawBorder(pdfGraphics2D0, rectangle2D_Double0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(0.0, 0.0);
      double double0 = emptyBlock0.trimToContentWidth(4607.26006883086);
      assertEquals(4607.26006883086, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(50.36080980659026, 5088.6753968310595);
      double double0 = emptyBlock0.trimToContentHeight(50.36080980659026);
      assertEquals(50.36080980659026, emptyBlock0.getWidth(), 0.01);
      assertEquals(50.36080980659026, double0, 0.01);
      assertEquals(5088.6753968310595, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      BlockContainer blockContainer0 = new BlockContainer();
      rectangle2D_Float0.setRect(1.0F, (-2585.2F), (-1671.608F), 1977.959F);
      blockContainer0.trimPadding(rectangle2D_Float0);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColumnArrangement columnArrangement0 = new ColumnArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) columnArrangement0);
      DefaultCaret defaultCaret0 = new DefaultCaret();
      blockContainer0.trimPadding(defaultCaret0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Color color0 = (Color)piePlot3D0.getLabelPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 3980.03, (-1994.18));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(3980.03, 256.344354, (double) 1.0F, 6.283185307179586);
      colorBlock0.trimPadding(rectangle2D_Double0);
      assertEquals(3980.03, colorBlock0.getWidth(), 0.01);
      assertEquals((-1994.18), colorBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1.0, 401.657610252792, 401.657610252792, 1.0);
      LabelBlock labelBlock0 = new LabelBlock("RangeType.NEGATIVE");
      labelBlock0.setPadding(442.604, (-2461.160895443), (-6311.75), 2028.119904);
      labelBlock0.trimPadding(rectangle2D_Double0);
      assertEquals(6714.4076102527915, rectangle2D_Double0.getMaxY(), 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Color color0 = (Color)PiePlot.DEFAULT_LABEL_PAINT;
      rectangle2D_Double0.setFrameFromCenter(0.35, (-998.45517), (-581.25844), 1.0);
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 1.0, 25.5);
      colorBlock0.trimMargin(rectangle2D_Double0);
      assertEquals(25.5, colorBlock0.getHeight(), 0.01);
      assertEquals(1.0, colorBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-5.0), (-5.0));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      emptyBlock0.trimMargin(rectangle2D_Double0);
      assertEquals((-5.0), emptyBlock0.getHeight(), 0.01);
      assertEquals((-5.0), emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(50.36080980659026, 50.36080980659026);
      JScrollPane jScrollPane0 = new JScrollPane();
      Rectangle rectangle0 = jScrollPane0.getViewportBorderBounds();
      rectangle0.width = 350;
      emptyBlock0.trimMargin(rectangle0);
      assertEquals(50.36080980659026, emptyBlock0.getWidth(), 0.01);
      assertEquals(50.36080980659026, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(1.0, 401.657610252792, 401.657610252792, 1.0);
      LabelBlock labelBlock0 = new LabelBlock("RangeType.NEGATIVE");
      labelBlock0.setMargin(0.0, (-694.92), 0.0, 2129.9842167);
      labelBlock0.trimMargin(rectangle2D_Double0);
      assertEquals((-1727.3266064472082), rectangle2D_Double0.getMaxX(), 0.01);
      assertEquals(402.157610252792, rectangle2D_Double0.getCenterY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      Color color0 = (Color)PiePlot.DEFAULT_LABEL_PAINT;
      rectangle2D_Double0.setFrameFromCenter(0.35, (-998.45517), (-581.25844), 1.0);
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 1.0, 25.5);
      colorBlock0.trimBorder(rectangle2D_Double0);
      assertEquals(25.5, colorBlock0.getHeight(), 0.01);
      assertEquals(1.0, colorBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-5.0), (-5.0));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      emptyBlock0.trimBorder(rectangle2D_Double0);
      assertEquals((-5.0), emptyBlock0.getWidth(), 0.01);
      assertEquals((-5.0), emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Color color0 = (Color)piePlot3D0.getLabelPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 3980.03, (-1994.18));
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(3980.03, 256.344354, (double) 1.0F, 6.283185307179586);
      colorBlock0.trimBorder(rectangle2D_Double0);
      assertEquals(3980.03, colorBlock0.getWidth(), 0.01);
      assertEquals((-1994.18), colorBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer();
      CenterArrangement centerArrangement0 = new CenterArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) centerArrangement0);
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) stackedAreaRenderer0.ZERO, 0.0, (-282.076684027), (-282.076684027));
      blockContainer0.trimBorder(rectangle2D_Double0);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(50.36080980659026, 5088.6753968310595);
      double double0 = emptyBlock0.getWidth();
      assertEquals(50.36080980659026, double0, 0.01);
      assertEquals(5088.6753968310595, emptyBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      compositeTitle0.setWidth((-1000.984108095));
      double double0 = compositeTitle0.getWidth();
      assertEquals((-1000.984108095), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      blockContainer0.setPadding(661.911, 661.911, 661.911, (-814.8461373));
      blockContainer0.getPadding();
      assertEquals(661.911, blockContainer0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(50.36080980659026, 50.36080980659026);
      emptyBlock0.setPadding((-1677.077), 50.36080980659026, 1.0, 50.36080980659026);
      emptyBlock0.getPadding();
      assertEquals(50.36080980659026, emptyBlock0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      LabelBlock labelBlock0 = new LabelBlock("hEPP|q4[:'_", stackedAreaRenderer0.DEFAULT_VALUE_LABEL_FONT, stackedAreaRenderer0.DEFAULT_OUTLINE_PAINT);
      RectangleInsets rectangleInsets0 = Plot.DEFAULT_INSETS;
      labelBlock0.setMargin(rectangleInsets0);
      labelBlock0.getMargin();
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      TextTitle textTitle0 = new TextTitle("", categoryAxis0.DEFAULT_AXIS_LABEL_FONT);
      textTitle0.setMargin(0.0, (-312.1050816711871), 1.0E-6, 811.6642618508154);
      textTitle0.getMargin();
      assertEquals((-311.1050816711871), textTitle0.getContentXOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      MeterPlot meterPlot0 = new MeterPlot((ValueDataset) defaultValueDataset0);
      Color color0 = (Color)meterPlot0.getTickPaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, (double) 3.0F, (double) 10);
      double double0 = colorBlock0.getHeight();
      assertEquals(10.0, double0, 0.01);
      assertEquals(3.0, colorBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EmptyBlock emptyBlock0 = null;
      try {
        emptyBlock0 = new EmptyBlock(0.0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Font font0 = AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(false);
      Color color0 = (Color)stackedAreaRenderer0.getBaseFillPaint();
      LabelBlock labelBlock0 = new LabelBlock("S7At4d9NxX163V,", font0, (Paint) color0);
      double double0 = labelBlock0.getContentXOffset();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CategoryAxis categoryAxis0 = new CategoryAxis();
      TextTitle textTitle0 = new TextTitle("", categoryAxis0.DEFAULT_AXIS_LABEL_FONT);
      textTitle0.setMargin(0.0, (-312.1050816711871), 1.0E-6, 811.6642618508154);
      double double0 = textTitle0.getContentXOffset();
      assertEquals((-311.1050816711871), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = Title.DEFAULT_HORIZONTAL_ALIGNMENT;
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer((-137.0));
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) xYBarRenderer0);
      ColumnArrangement columnArrangement0 = new ColumnArrangement(horizontalAlignment0, legendTitle0.DEFAULT_VERTICAL_ALIGNMENT, 794.74259, (-482.43799208465003));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) columnArrangement0);
      blockContainer0.calculateTotalWidth(0.0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(90.0, 2233.11);
      double double0 = emptyBlock0.calculateTotalWidth(2233.11);
      assertEquals(2233.11, emptyBlock0.getHeight(), 0.01);
      assertEquals(90.0, emptyBlock0.getWidth(), 0.01);
      assertEquals(2233.11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HorizontalAlignment horizontalAlignment0 = Title.DEFAULT_HORIZONTAL_ALIGNMENT;
      XYBarRenderer xYBarRenderer0 = new XYBarRenderer((-137.0));
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) xYBarRenderer0);
      ColumnArrangement columnArrangement0 = new ColumnArrangement(horizontalAlignment0, legendTitle0.DEFAULT_VERTICAL_ALIGNMENT, 794.74259, (-482.43799208465003));
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) columnArrangement0);
      double double0 = blockContainer0.calculateTotalWidth((-21.358522137453));
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals((-21.358522137453), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.calculateTotalHeight(0.0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      abstractBlock0.calculateTotalHeight(2017.907092856);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.calculateTotalHeight((-1.0F));
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Color color0 = (Color)ganttRenderer0.getCompletePaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 2389.76601485, 1167.5521);
      // Undeclared exception!
      try { 
        colorBlock0.trimPadding((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CenterArrangement centerArrangement0 = new CenterArrangement();
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(false, false);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) xYLineAndShapeRenderer0, (Arrangement) centerArrangement0, (Arrangement) centerArrangement0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
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
  public void test37()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock((-891.642488592019), (-891.642488592019));
      // Undeclared exception!
      try { 
        emptyBlock0.trimBorder((Rectangle2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.util.RectangleInsets", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      SystemColor systemColor0 = SystemColor.activeCaptionBorder;
      ColorBlock colorBlock0 = new ColorBlock((Paint) systemColor0, (double) 0.0F, (double) 0.0F);
      // Undeclared exception!
      try { 
        colorBlock0.drawBorder((Graphics2D) null, rectangle2D_Float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BlockBorder", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AbstractBlock abstractBlock0 = new AbstractBlock();
      AbstractBlock abstractBlock1 = (AbstractBlock)abstractBlock0.clone();
      assertEquals(0.0, abstractBlock1.getWidth(), 0.01);
      assertNotSame(abstractBlock1, abstractBlock0);
      assertEquals(0.0, abstractBlock1.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart("To##.2r@Ta)|4_)8l", (Plot) waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      assertEquals(1, bufferedImage0.getNumYTiles());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GanttRenderer ganttRenderer0 = new GanttRenderer();
      Color color0 = (Color)ganttRenderer0.getCompletePaint();
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 2389.76601485, 1167.5521);
      PiePlot3D piePlot3D0 = new PiePlot3D();
      colorBlock0.setPadding(piePlot3D0.DEFAULT_INSETS);
      assertEquals(1167.5521, colorBlock0.getHeight(), 0.01);
      assertEquals(2389.76601485, colorBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      compositeTitle0.setHeight(860.653833429557);
      assertEquals(860.653833429557, compositeTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      AbstractBlock abstractBlock0 = new AbstractBlock();
      boolean boolean0 = abstractBlock0.equals(plotRenderingInfo0);
      assertFalse(boolean0);
      assertEquals(0.0, abstractBlock0.getWidth(), 0.01);
      assertEquals(0.0, abstractBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      CompositeTitle compositeTitle1 = (CompositeTitle)compositeTitle0.clone();
      boolean boolean0 = compositeTitle0.equals(compositeTitle1);
      assertTrue(boolean0);
      assertEquals(0.0, compositeTitle1.getHeight(), 0.01);
      assertNotSame(compositeTitle1, compositeTitle0);
      assertEquals(0.0, compositeTitle1.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      WaferMapPlot waferMapPlot0 = new WaferMapPlot();
      JFreeChart jFreeChart0 = new JFreeChart("To##.2r@Ta)|4_)8l", (Plot) waferMapPlot0);
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      blockContainer0.arrange((Graphics2D) sunGraphics2D0);
      assertEquals(0.0, blockContainer0.getHeight(), 0.01);
      assertEquals(0.0, blockContainer0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CenterArrangement centerArrangement0 = new CenterArrangement();
      XYLineAndShapeRenderer xYLineAndShapeRenderer0 = new XYLineAndShapeRenderer(false, false);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) xYLineAndShapeRenderer0, (Arrangement) centerArrangement0, (Arrangement) centerArrangement0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
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
  public void test47()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      // Undeclared exception!
      try { 
        compositeTitle0.setBounds((Rectangle2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'bounds' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CompositeTitle compositeTitle0 = new CompositeTitle();
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-1295), (-1295));
      WaferMapPlot waferMapPlot0 = new WaferMapPlot(waferMapDataset0);
      JFreeChart jFreeChart0 = new JFreeChart((Plot) waferMapPlot0);
      ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, 0, 0, 0, 0, 1696, (-508), false, false, true, true, true, true);
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)chartPanel0.scale(rectangle2D_Float0);
      compositeTitle0.setBounds(rectangle2D_Double0);
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Color color0 = (Color)PiePlot.DEFAULT_LABEL_PAINT;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 1.0, 25.5);
      // Undeclared exception!
      try { 
        colorBlock0.setPadding((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'padding' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      // Undeclared exception!
      try { 
        legendTitle0.setFrame((BlockFrame) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'frame' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      LabelBlock labelBlock0 = new LabelBlock("hEPP|q4[:'_", stackedAreaRenderer0.DEFAULT_VALUE_LABEL_FONT, stackedAreaRenderer0.DEFAULT_VALUE_LABEL_PAINT);
      // Undeclared exception!
      try { 
        labelBlock0.setMargin((RectangleInsets) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'margin' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      double double0 = compositeTitle0.getHeight();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      double double0 = compositeTitle0.getWidth();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("");
      textTitle0.setMargin((-845.37573), (-845.37573), (-845.37573), (-845.37573));
      textTitle0.getMargin();
      assertEquals((-844.37573), textTitle0.getContentYOffset(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      LabelBlock labelBlock0 = new LabelBlock("hEPP|q4[:'_", stackedAreaRenderer0.DEFAULT_VALUE_LABEL_FONT, stackedAreaRenderer0.DEFAULT_OUTLINE_PAINT);
      labelBlock0.getBounds();
      assertEquals(0.0, labelBlock0.getWidth(), 0.01);
      assertEquals(0.0, labelBlock0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("");
      textTitle0.getID();
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("");
      textTitle0.getMargin();
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TextTitle textTitle0 = new TextTitle("");
      textTitle0.getFrame();
      assertEquals(0.0, textTitle0.getHeight(), 0.01);
      assertEquals(0.0, textTitle0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      compositeTitle0.setPadding(0.0, Double.POSITIVE_INFINITY, (double) 0.0F, (-1.0));
      CompositeTitle compositeTitle1 = new CompositeTitle();
      boolean boolean0 = compositeTitle0.equals(compositeTitle1);
      assertEquals(Double.POSITIVE_INFINITY, compositeTitle0.getContentXOffset(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      StandardXYToolTipGenerator standardXYToolTipGenerator0 = StandardXYToolTipGenerator.getTimeSeriesInstance();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.0, false, (XYToolTipGenerator) standardXYToolTipGenerator0);
      LabelBlock labelBlock0 = new LabelBlock("vk7-%<~Y+=4G~i", candlestickRenderer0.DEFAULT_VALUE_LABEL_FONT, candlestickRenderer0.DEFAULT_PAINT);
      // Undeclared exception!
      try { 
        labelBlock0.arrange((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.LabelBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EmptyBlock emptyBlock0 = new EmptyBlock(50.36080980659026, 50.36080980659026);
      emptyBlock0.getPadding();
      assertEquals(50.36080980659026, emptyBlock0.getHeight(), 0.01);
      assertEquals(50.36080980659026, emptyBlock0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot((ValueAxis) null);
      JFreeChart jFreeChart0 = new JFreeChart("Null 'c' argument.", (Plot) combinedRangeXYPlot0);
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      // Undeclared exception!
      try { 
        jFreeChart0.createBufferedImage(10, 15, 10, chartRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.CombinedRangeXYPlot", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CompositeTitle compositeTitle0 = new CompositeTitle();
      compositeTitle0.setID(")E&U=_gD1_");
      compositeTitle0.getID();
      assertEquals(0.0, compositeTitle0.getWidth(), 0.01);
      assertEquals(0.0, compositeTitle0.getHeight(), 0.01);
  }
}
