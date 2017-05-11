/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 18 20:22:39 GMT 2017
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
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.data.RangeInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.block.Block",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.data.general.PieDataset",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.util.Size2D",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.data.general.Series",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.SeriesException",
      "org.jfree.chart.event.ChartChangeListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BorderArrangement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.PolarChartPanel",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfDictionary",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.DocWriter",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.general.DatasetGroup",
      "com.lowagie.text.Rectangle",
      "com.lowagie.text.Image",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.util.TableOrder",
      "com.lowagie.text.Document",
      "com.lowagie.text.PageSize",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfDocument",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "com.lowagie.text.pdf.AsianFontMapper",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.title.CompositeTitle",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.renderer.LookupPaintScale$PaintItem",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Week",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "com.lowagie.text.Jpeg2000",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "com.lowagie.text.pdf.PdfEncodings$WingdingsConversion",
      "com.lowagie.text.pdf.PdfEncodings$SymbolConversion",
      "com.lowagie.text.pdf.PdfEncodings$Cp437Conversion",
      "com.lowagie.text.pdf.PdfEncodings",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.xy.XYBarDataset",
      "com.lowagie.text.SimpleCell",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.time.TimeSeriesCollection",
      "com.lowagie.text.pdf.ColumnText",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.chart.renderer.xy.VectorRenderer",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.data.general.CombinedDataset",
      "com.lowagie.text.pdf.PdfAnnotation",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "com.lowagie.text.pdf.codec.PngImage",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.annotations.XYBoxAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.Chunk",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.chart.renderer.xy.XYStepRenderer",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.data.xy.VectorSeriesCollection",
      "org.jfree.chart.labels.BubbleXYItemLabelGenerator"
    );
  }
}
