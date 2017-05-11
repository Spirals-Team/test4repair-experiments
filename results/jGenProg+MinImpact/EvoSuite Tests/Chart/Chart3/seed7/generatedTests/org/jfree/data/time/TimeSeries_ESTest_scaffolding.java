/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Jan 12 21:39:52 GMT 2017
 */

package org.jfree.data.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TimeSeries_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.data.time.TimeSeries"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TimeSeries_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.time.Year",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.DomainOrder",
      "org.jfree.data.time.Minute",
      "org.jfree.data.xy.SelectableXYDataset",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.data.xy.XYDatasetSelectionState",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.general.SeriesChangeInfo",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.xy.WindDataset",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.Range",
      "org.jfree.chart.util.HashUtilities",
      "org.jfree.data.general.SeriesException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TimeSeries_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Week",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Month",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.gantt.XYTaskDataset",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.SeriesChangeType",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.time.TimeSeriesCollection",
      "com.lowagie.text.pdf.PdfGraphics2D$HyperLinkKey",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.time.TimeSeriesTableModel",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.statistics.BoxAndWhiskerItem"
    );
  }
}
