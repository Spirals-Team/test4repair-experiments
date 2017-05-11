/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 16 17:03:21 GMT 2017
 */

package org.jfree.chart.block;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BorderArrangement_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.block.BorderArrangement"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BorderArrangement_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.Drawable",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.data.Range",
      "org.jfree.chart.util.RectangleInsets"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BorderArrangement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.util.Size2D",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Minute",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.time.TimePeriodValue",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.general.junit.DefaultPieDatasetTests",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.xy.XYSeries"
    );
  }
}
