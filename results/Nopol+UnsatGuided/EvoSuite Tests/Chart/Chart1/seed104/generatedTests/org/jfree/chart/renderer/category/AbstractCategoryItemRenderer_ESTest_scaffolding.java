/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Jan 15 11:59:38 GMT 2017
 */

package org.jfree.chart.renderer.category;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractCategoryItemRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer"; 
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

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("os.name", "Linux"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractCategoryItemRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "org.jfree.chart.Effect3D",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.category.CategoryDatasetSelectionState",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.data.RangeInfo",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.data.general.DatasetSelectionState",
      "org.jfree.chart.renderer.category.BarPainter",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.annotations.Annotation",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.needle.LongNeedle",
      "org.jfree.chart.text.G2TextMeasurer",
      "org.jfree.chart.panel.PanHandler",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.plot.CategoryCrosshairState",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.ShadowGenerator",
      "org.jfree.chart.plot.Selectable",
      "org.jfree.chart.util.PaintMap",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.util.HashUtilities",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.RenderAttributes",
      "org.jfree.chart.event.OverlayChangeListener",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.data.statistics.MultiValueCategoryDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.RenderingSource",
      "org.jfree.chart.ui.Licences",
      "org.jfree.data.category.SelectableCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.event.AnnotationChangeListener",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.plot.PieSelectionAttributes",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.data.time.Month",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.category.CategoryRangeInfo",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.urls.CustomCategoryURLGenerator",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.renderer.category.CategoryStepRenderer$State",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "org.jfree.data.pie.PieDatasetChangeInfo",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.data.pie.PieDataset",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.needle.ShipNeedle",
      "org.jfree.data.event.DatasetChangeListener",
      "org.jfree.data.Value",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.data.gantt.Task",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.util.StrokeMap",
      "org.jfree.chart.block.BlockFrame",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.entity.PlotEntity",
      "org.jfree.chart.panel.Overlay",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.ui.Library",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.panel.ZoomHandler",
      "org.jfree.data.time.Day",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.data.event.SeriesChangeListener",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.needle.LineNeedle",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.data.general.KeyedValues2DDataset",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.event.OverlayChangeEvent",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.data.time.Year",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.Drawable",
      "org.jfree.chart.BufferedImageRenderingSource",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.needle.PinNeedle",
      "org.jfree.chart.panel.AbstractMouseHandler",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.chart.plot.Pannable",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "org.jfree.data.Values2D",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.general.Series",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.event.DatasetChangeInfo",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.needle.MiddlePinNeedle",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.util.PaintUtilities"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractCategoryItemRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.GradientBarPainter",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.renderer.RenderAttributes",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.axis.Axis",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.pie.AbstractPieDataset",
      "org.jfree.data.pie.DefaultPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.KeyedObjects",
      "org.jfree.data.event.DatasetChangeEvent",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.ResourceBundleWrapper",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.plot.PieLabelLinkStyle",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.util.PaintMap",
      "org.jfree.chart.util.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.plot.PieSelectionAttributes",
      "org.jfree.chart.util.DefaultShadowGenerator",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.RectangleEdge",
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
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.renderer.category.ScatterRenderer",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.category.AbstractCategoryDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.data.statistics.DefaultMultiValueCategoryDataset",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.gantt.SlidingGanttCategoryDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.urls.CustomCategoryURLGenerator",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.annotations.AbstractAnnotation",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.entity.JFreeChartEntity",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.entity.AxisEntity",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.renderer.xy.GradientXYBarPainter",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.entity.TitleEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.renderer.xy.XYShapeRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateTickUnitType",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.data.category.SlidingCategoryDataset",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.util.LogFormat",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.chart.plot.PolarPlot",
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
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.renderer.category.StandardBarPainter",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.labels.StandardPieToolTipGenerator",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.event.AnnotationChangeEvent",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYDataImageAnnotation",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.renderer.xy.XYSplineRenderer",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Week",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.chart.title.DateTitle",
      "org.jfree.data.event.SeriesChangeEvent",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.renderer.xy.SamplingXYLineRenderer",
      "org.jfree.data.time.Minute",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.VectorSeries",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.renderer.xy.XYStepRenderer",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.block.ColorBlock",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.statistics.SimpleHistogramBin"
    );
  }
}
