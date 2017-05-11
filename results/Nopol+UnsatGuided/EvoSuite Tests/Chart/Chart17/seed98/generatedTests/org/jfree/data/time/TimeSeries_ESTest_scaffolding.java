/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jan 24 12:55:47 GMT 2017
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
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.general.Dataset",
      "org.jfree.data.time.Week",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Hour",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.general.Series",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Day",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.data.Values",
      "org.jfree.data.Values2D",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedValues",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.Month",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.time.TimePeriod"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TimeSeries_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.SeriesException",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.Range",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.time.Week",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.general.junit.DefaultPieDatasetTests",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.UnknownKeyException"
    );
  }
}
