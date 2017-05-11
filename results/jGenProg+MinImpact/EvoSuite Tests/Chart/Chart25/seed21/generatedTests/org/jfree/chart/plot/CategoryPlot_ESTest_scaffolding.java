/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 22 18:01:32 GMT 2017
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CategoryPlot_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.CategoryPlot"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CategoryPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.Effect3D",
      "com.lowagie.text.Element",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "com.lowagie.text.TextElementArray",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.urls.PieURLGenerator",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.axis.SegmentedTimeline$BaseTimelineSegmentRange",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.event.TitleChangeListener",
      "com.lowagie.text.ListItem",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.axis.SegmentedTimeline$SegmentRange",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.ui.Licences",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "org.jfree.data.time.Month",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.SymbolAxis",
      "com.lowagie.text.Chunk",
      "com.lowagie.text.Phrase",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.renderer.category.CategoryStepRenderer$State",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.DataUtilities",
      "com.lowagie.text.Paragraph",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.Value",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.HashUtilities",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.labels.PieToolTipGenerator",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.plot.PiePlotState",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "com.lowagie.text.ElementListener",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.data.time.Year",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Font",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.StrokeMap",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.util.PaintUtilities"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CategoryPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.SerialUtilities",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "com.lowagie.text.Document",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.Image",
      "com.lowagie.text.Jpeg",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.ColumnText",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.axis.NumberAxis3D",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Second",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer",
      "com.lowagie.text.pdf.PdfPageLabels",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.plot.PiePlot3D",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "com.lowagie.text.ChapterAutoNumber",
      "com.lowagie.text.Chunk",
      "org.jfree.data.time.Week",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "com.lowagie.text.ListItem",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.xy.XYSeries",
      "com.lowagie.text.Table",
      "com.lowagie.text.Row",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.pdf.CJKFont",
      "com.lowagie.text.SimpleCell",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "com.lowagie.text.Anchor",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.codec.PngImage",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.block.GridArrangement",
      "com.lowagie.text.pdf.PdfLayerMembership",
      "org.jfree.data.DefaultKeyedValue",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.chart.renderer.xy.HighLowRenderer"
    );
  }
}
