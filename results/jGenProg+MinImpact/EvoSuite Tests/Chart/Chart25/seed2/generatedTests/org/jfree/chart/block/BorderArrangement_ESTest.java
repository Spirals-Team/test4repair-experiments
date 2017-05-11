/*
 * This file was automatically generated by EvoSuite
 * Tue Jan 17 22:42:26 GMT 2017
 */

package org.jfree.chart.block;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.LegendItemSource;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.block.Arrangement;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BorderArrangement_ESTest extends BorderArrangement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(8000000.0, (-3949.4235), "");
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      blockContainer0.setMargin(cyclicNumberAxis0.DEFAULT_AXIS_LABEL_INSETS);
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(6.0, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(0.0, false, (XYToolTipGenerator) highLowItemLabelGenerator0);
      LegendTitle legendTitle0 = new LegendTitle((LegendItemSource) candlestickRenderer0, (Arrangement) borderArrangement0, (Arrangement) borderArrangement0);
      BlockContainer blockContainer0 = legendTitle0.getItemContainer();
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      BlockBorder blockBorder0 = new BlockBorder((-1.0), (-2600.6801099503), (-1.0), 2178.51691341);
      blockContainer0.setFrame(blockBorder0);
      Size2D size2D0 = borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 1395.965);
      assertEquals(973.8018034597001, size2D0.width, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN((BlockContainer) null, (Graphics2D) null, 1081.73330363);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range(double, double): require lower (0.0) <= upper (-1.0).
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
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
  public void test06()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      StyleConstants styleConstants0 = (StyleConstants)AttributeSet.NameAttribute;
      // Undeclared exception!
      try { 
        borderArrangement0.add(blockContainer0, styleConstants0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.text.StyleConstants cannot be cast to org.jfree.chart.util.RectangleEdge
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      borderArrangement0.add(blockContainer0, (Object) null);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getHeight(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      assertTrue(borderArrangement1.equals((Object)borderArrangement0));
      
      borderArrangement1.add(blockContainer0, (Object) null);
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertFalse(borderArrangement1.equals((Object)borderArrangement0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BorderArrangement borderArrangement1 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals(borderArrangement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      boolean boolean0 = borderArrangement0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      Size2D size2D0 = borderArrangement0.arrangeNN(blockContainer0, (Graphics2D) null);
      assertEquals(0.0, size2D0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = RectangleEdge.RIGHT;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeFN(blockContainer0, (Graphics2D) null, 0.0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Not implemented.
         //
         verifyException("org.jfree.chart.block.BorderArrangement", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      BlockContainer blockContainer0 = new BlockContainer();
      RectangleEdge rectangleEdge0 = Title.DEFAULT_POSITION;
      borderArrangement0.add(blockContainer0, rectangleEdge0);
      // Undeclared exception!
      try { 
        borderArrangement0.arrangeRR(blockContainer0, (Range) null, (Range) null, (Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.Range", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BorderArrangement borderArrangement0 = new BorderArrangement();
      borderArrangement0.clear();
  }
}
