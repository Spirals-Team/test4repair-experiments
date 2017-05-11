/*
 * This file was automatically generated by EvoSuite
 * Wed Jan 11 22:21:22 GMT 2017
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.general.PieDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PiePlot3D_ESTest extends PiePlot3D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.setDepthFactor(0.08);
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertEquals(0.08, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertEquals(0.12, piePlot3D1.getDepthFactor(), 0.01);
      assertFalse(piePlot3D1.getDarkerSides());
      assertTrue(boolean0);
      assertFalse(piePlot3D1.isCircular());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertTrue(boolean0);
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) defaultIntervalCategoryDataset0, tableOrder0, (-3621));
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) categoryToPieDataset0);
      assertFalse(piePlot3D0.getDarkerSides());
      
      piePlot3D0.setDarkerSides(true);
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      PiePlot3D piePlot3D0 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(rectangle2D_Double0);
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(boolean0);
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(piePlot3D0.isCircular());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) 1.0F, (double) 1.0F, 0.08, (double) 10);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      PlotState plotState0 = new PlotState();
      StandardEntityCollection standardEntityCollection0 = new StandardEntityCollection();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) standardEntityCollection0);
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      // Undeclared exception!
      try { 
        piePlot3D0.draw((Graphics2D) null, rectangle2D_Double0, point2D_Double0, plotState0, plotRenderingInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double((double) 1.0F, 0.0, 0.08, 0.12);
      Point2D.Double point2D_Double0 = new Point2D.Double();
      // Undeclared exception!
      try { 
        piePlot3D0.draw((Graphics2D) null, rectangle2D_Double0, point2D_Double0, (PlotState) null, (PlotRenderingInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.plot.Plot", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Number[][] numberArray0 = new Number[2][0];
      DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(numberArray0, numberArray0);
      TableOrder tableOrder0 = TableOrder.BY_ROW;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) defaultIntervalCategoryDataset0, tableOrder0, (-3621));
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) categoryToPieDataset0);
      boolean boolean0 = piePlot3D0.getDarkerSides();
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PiePlot3D piePlot3D0 = new PiePlot3D();
      piePlot3D0.setDepthFactor(180.0);
      PiePlot3D piePlot3D1 = new PiePlot3D();
      boolean boolean0 = piePlot3D0.equals(piePlot3D1);
      assertEquals(180.0, piePlot3D0.getDepthFactor(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) defaultKeyedValues2DDataset0, tableOrder0, 0);
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) categoryToPieDataset0);
      piePlot3D0.getPlotType();
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, piePlot3D0.getDepthFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      TableOrder tableOrder0 = TableOrder.BY_COLUMN;
      CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset((CategoryDataset) defaultKeyedValues2DDataset0, tableOrder0, 0);
      PiePlot3D piePlot3D0 = new PiePlot3D((PieDataset) categoryToPieDataset0);
      double double0 = piePlot3D0.getDepthFactor();
      assertFalse(piePlot3D0.getDarkerSides());
      assertFalse(piePlot3D0.isCircular());
      assertEquals(0.12, double0, 0.01);
  }
}
