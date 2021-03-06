/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 22:50:28 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.image.BufferedImage;
import java.time.chrono.HijrahDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.ColorBlock;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.RegularTimePeriod;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Color color0 = (Color)Plot.DEFAULT_BACKGROUND_PAINT;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 15.0, 0.0);
      blockContainer0.add((Block) colorBlock0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(15.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Color color0 = (Color)Plot.DEFAULT_BACKGROUND_PAINT;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 0.0, 0.0);
      colorBlock0.setHeight(3875.0837921377997);
      blockContainer0.add((Block) colorBlock0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(3875.0837921377997, size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      blockContainer0.setPadding(0.05, 0.0, 3824.0949121654617, (-1.0));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-1.0), size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      blockContainer0.setMargin(0.0, 3869.6353461781996, 5.4484459596, (-1.0));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(3868.6353461781996, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      blockContainer0.setMargin(0.0, 3824.0949121654617, (-439.733757), (-1.0));
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals((-439.733757), size2D0.height, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, "<+X=xuR;!`[~XU*g/");
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, cyclicNumberAxis0.DEFAULT_RANGE, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFR((BlockContainer) null, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 5.0E10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, (-3163.5643));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-3163.5643).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      CompassPlot compassPlot0 = new CompassPlot((ValueDataset) defaultValueDataset0);
      JFreeChart jFreeChart0 = new JFreeChart("org.jfree.chart.block.BorderArrangement", (Plot) compassPlot0);
      LegendTitle legendTitle0 = jFreeChart0.getLegend();
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFF(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange((BlockContainer) null, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot((ValueDataset) defaultValueDataset0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) thermometerPlot0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrange(blockContainer0, (Graphics2D) null, (RectangleConstraint) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'c' argument.
         //
         verifyException("org.jfree.chart.block.AbstractBlock", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      CompositeTitle compositeTitle0 = new CompositeTitle();
      HijrahDate hijrahDate0 = MockHijrahDate.now();
      // Undeclared exception!
      try { 
        borderArrangement0.add(compositeTitle0, hijrahDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.chrono.HijrahDate cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Color color0 = (Color)Plot.DEFAULT_BACKGROUND_PAINT;
      ColorBlock colorBlock0 = new ColorBlock((Paint) color0, 0.0, 0.0);
      blockContainer0.add((Block) colorBlock0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      boolean boolean0 = borderArrangement0.equals(textTitle0.DEFAULT_POSITION);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement1.add(blockContainer0, (Object) null);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      MultiplePiePlot multiplePiePlot0 = new MultiplePiePlot();
      JFreeChart jFreeChart0 = multiplePiePlot0.getPieChart();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, 0.8117596601621383, 4.5, chartRenderingInfo0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.createGraphics();
      Millisecond millisecond0 = new Millisecond();
      PeriodAxis periodAxis0 = new PeriodAxis("", (RegularTimePeriod) millisecond0, (RegularTimePeriod) millisecond0);
      Size2D size2D0 = borderArrangement0.arrangeRR(blockContainer0, periodAxis0.DEFAULT_RANGE, periodAxis0.DEFAULT_RANGE, sunGraphics2D0);
      assertEquals(0.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(textTitle0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(textTitle0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      borderArrangement0.add(textTitle0, textTitle0.DEFAULT_POSITION);
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      RectangleEdge rectangleEdge0 = RectangleEdge.opposite(textTitle0.DEFAULT_POSITION);
      borderArrangement0.add(textTitle0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 920.0);
      assertEquals(920.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      Size2D size2D0 = blockContainer0.arrange((Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(textTitle0, rectangleEdge0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      RectangleEdge rectangleEdge0 = RectangleEdge.BOTTOM;
      borderArrangement0.add(textTitle0, rectangleEdge0);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      RectangleEdge rectangleEdge0 = RectangleEdge.LEFT;
      borderArrangement0.add(textTitle0, rectangleEdge0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) null);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      TextTitle textTitle0 = new TextTitle();
      borderArrangement0.add(textTitle0, textTitle0.DEFAULT_POSITION);
      BlockContainer blockContainer0 = new BlockContainer((Arrangement) borderArrangement0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not yet implemented.
         //
         verifyException("org.jfree.chart.title.TextTitle", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
