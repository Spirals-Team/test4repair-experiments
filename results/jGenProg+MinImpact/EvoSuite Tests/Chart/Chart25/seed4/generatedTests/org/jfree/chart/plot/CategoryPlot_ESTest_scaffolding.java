/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jan 11 23:33:09 GMT 2017
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
      "com.lowagie.text.pdf.TrueTypeFontUnicode",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.Effect3D",
      "com.lowagie.text.pdf.PdfOCG",
      "com.lowagie.text.Element",
      "com.lowagie.text.pdf.collection.PdfCollectionItem",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "com.lowagie.text.pdf.ExtraEncoding",
      "org.jfree.data.RangeInfo",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "com.lowagie.text.pdf.internal.PdfAnnotationsImp",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.chart.ui.Contributor",
      "com.lowagie.text.pdf.PdfStructureElement",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.text.TextBlock",
      "com.lowagie.text.pdf.ColorDetails",
      "org.jfree.chart.axis.Axis",
      "com.lowagie.text.pdf.PdfPattern",
      "com.lowagie.text.pdf.PdfRectangle",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.block.BlockBorder",
      "com.lowagie.text.pdf.PdfPageEvent",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.time.Second",
      "com.lowagie.text.pdf.PdfOutline",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.chart.text.TextMeasurer",
      "org.jfree.chart.LegendItemSource",
      "com.lowagie.text.pdf.PdfAction",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.data.gantt.TaskSeries",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.ui.ExtensionFileFilter",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "com.lowagie.text.pdf.PdfNull",
      "com.lowagie.text.pdf.PdfOCProperties",
      "org.jfree.data.time.Millisecond",
      "com.lowagie.text.xml.xmp.PdfSchema",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.util.GradientPaintTransformType",
      "com.lowagie.text.pdf.PdfDocument",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "com.lowagie.text.pdf.ByteBuffer",
      "com.lowagie.text.pdf.PdfBorderDictionary",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.data.general.SeriesChangeEvent",
      "com.lowagie.text.pdf.PdfMediaClipData",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.labels.CategoryItemLabelGenerator",
      "org.jfree.chart.axis.TickUnits",
      "com.lowagie.text.pdf.PdfWriter",
      "com.lowagie.text.pdf.PdfLiteral",
      "com.lowagie.text.pdf.PdfPrinterGraphics2D",
      "com.lowagie.text.pdf.collection.PdfCollectionField",
      "com.lowagie.text.pdf.GrayColor",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "com.lowagie.text.pdf.PdfXConformanceException",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.renderer.category.CategoryStepRenderer$State",
      "com.lowagie.text.Phrase",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.ChartMouseListener",
      "com.lowagie.text.pdf.PdfImportedPage",
      "org.jfree.chart.renderer.category.CategoryItemRendererState",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.axis.SegmentedTimeline",
      "com.lowagie.text.Paragraph",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.data.Value",
      "org.jfree.chart.block.BlockFrame",
      "com.lowagie.text.Cell",
      "com.lowagie.text.pdf.ExtendedColor",
      "com.lowagie.text.pdf.PdfDocument$PdfInfo",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "com.lowagie.text.pdf.PdfTransparencyGroup",
      "org.jfree.chart.title.Title",
      "com.lowagie.text.pdf.PdfBorderArray",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.block.LineBorder",
      "com.lowagie.text.pdf.PdfFormXObject",
      "org.jfree.data.DefaultKeyedValues2D",
      "com.lowagie.text.pdf.FontDetails",
      "com.lowagie.text.pdf.PdfShading",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.chart.ui.BasicProjectInfo",
      "com.lowagie.text.pdf.PdfReader",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "com.lowagie.text.pdf.IntHashtable$Entry",
      "com.lowagie.text.ImgPostscript",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.urls.CategoryURLGenerator",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.chart.entity.TickLabelEntity",
      "com.lowagie.text.pdf.PdfPageLabels",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "com.lowagie.text.pdf.PdfDashPattern",
      "org.jfree.chart.entity.CategoryItemEntity",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.annotations.TextAnnotation",
      "com.lowagie.text.pdf.PdfDictionary",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.entity.CategoryLabelEntity",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "com.lowagie.text.ElementListener",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "com.lowagie.text.pdf.internal.PdfVersionImp",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "com.lowagie.text.pdf.PdfImage",
      "org.jfree.chart.util.StrokeList",
      "com.lowagie.text.pdf.interfaces.PdfVersion",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "com.lowagie.text.pdf.internal.PdfViewerPreferencesImp",
      "org.jfree.chart.axis.CategoryAxis3D",
      "com.lowagie.text.pdf.PdfPage",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.plot.XYPlot",
      "com.lowagie.text.pdf.PdfName",
      "com.lowagie.text.pdf.PdfGState",
      "com.lowagie.text.pdf.RandomAccessFileOrArray",
      "com.lowagie.text.ImgWMF",
      "com.lowagie.text.pdf.PdfAppearance",
      "com.lowagie.text.pdf.PdfTextArray",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "com.lowagie.text.Jpeg",
      "com.lowagie.text.pdf.PdfLayer",
      "com.lowagie.text.ImgRaw",
      "org.jfree.data.time.Hour",
      "com.lowagie.text.pdf.PdfPTableEvent",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.axis.SubCategoryAxis",
      "com.lowagie.text.pdf.collection.PdfTargetDictionary",
      "org.jfree.chart.axis.NumberTickUnit",
      "com.lowagie.text.pdf.TrueTypeFont",
      "org.jfree.chart.title.TextTitle",
      "com.lowagie.text.pdf.PRIndirectReference",
      "org.jfree.data.statistics.StatisticalCategoryDataset",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.Font",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.data.KeyedValues2D",
      "com.lowagie.text.pdf.PdfPSXObject",
      "org.jfree.data.Values",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "com.lowagie.text.xml.xmp.DublinCoreSchema",
      "org.jfree.chart.text.TextBlockAnchor",
      "com.lowagie.text.PageSize",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.chart.labels.CategorySeriesLabelGenerator",
      "com.lowagie.text.pdf.interfaces.PdfViewerPreferences",
      "com.lowagie.text.pdf.PdfPCellEvent",
      "org.jfree.chart.axis.MarkerAxisBand",
      "com.lowagie.text.xml.xmp.XmpWriter",
      "org.jfree.chart.axis.CategoryAxis",
      "com.lowagie.text.pdf.PdfPatternPainter",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.axis.LogarithmicAxis",
      "com.lowagie.text.pdf.PdfBoolean",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "com.lowagie.text.TextElementArray",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.axis.DateAxis",
      "com.lowagie.text.Row",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "com.lowagie.text.pdf.interfaces.PdfPageActions",
      "com.lowagie.text.pdf.PageResources",
      "com.lowagie.text.HeaderFooter",
      "org.jfree.chart.event.RendererChangeEvent",
      "com.lowagie.text.pdf.PdfException",
      "com.lowagie.text.pdf.PdfIndirectReference",
      "com.lowagie.text.pdf.PdfPTable",
      "org.jfree.chart.axis.Tick",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "com.lowagie.text.pdf.DocumentFont",
      "org.jfree.data.DefaultKeyedValues",
      "com.lowagie.text.pdf.PdfArray",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.util.ShapeList",
      "com.lowagie.text.pdf.collection.PdfCollection",
      "com.lowagie.text.pdf.OutputStreamCounter",
      "org.jfree.chart.util.HorizontalAlignment",
      "com.lowagie.text.DocWriter",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.data.time.DynamicTimeSeriesCollection$ValueSequence",
      "org.jfree.chart.axis.SegmentedTimeline$BaseTimelineSegmentRange",
      "org.jfree.chart.labels.CategoryToolTipGenerator",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "com.lowagie.text.pdf.PdfSpotColor",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.data.time.Quarter",
      "com.lowagie.text.pdf.PdfTransition",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.data.DomainInfo",
      "com.lowagie.text.pdf.PdfPages",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.SegmentedTimeline$SegmentRange",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValue",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfSignature",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.data.RangeType",
      "com.lowagie.text.pdf.PdfStructureTreeRoot",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.data.time.Month",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "com.lowagie.text.DocListener",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.axis.SymbolAxis",
      "com.lowagie.text.pdf.collection.PdfCollectionSchema",
      "com.lowagie.text.ImgCCITT",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.JFreeChart",
      "com.lowagie.text.pdf.FontMapper",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.pdf.PdfDestination",
      "org.jfree.chart.title.LegendTitle",
      "com.lowagie.text.pdf.PdfTable",
      "com.lowagie.text.pdf.PdfNumber",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.MonthConstants",
      "com.lowagie.text.pdf.internal.PdfXConformanceImp",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "com.lowagie.text.pdf.BadPdfFormatException",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfAcroForm",
      "org.jfree.chart.ui.Library",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.plot.Zoomable",
      "com.lowagie.text.pdf.PdfEncryption",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "org.jfree.chart.util.ObjectList",
      "com.lowagie.text.pdf.PRStream",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "com.lowagie.text.Image",
      "com.lowagie.text.pdf.PdfContentByte",
      "com.lowagie.text.Meta",
      "org.jfree.chart.axis.PeriodAxis",
      "com.lowagie.text.pdf.PdfIndirectObject",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "com.lowagie.text.ImgTemplate",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "com.lowagie.text.pdf.PdfDocument$PdfCatalog",
      "com.lowagie.text.pdf.PdfICCBased",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.block.Block",
      "com.lowagie.text.pdf.PdfDate",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.pdf.interfaces.PdfEncryptionSettings",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "com.lowagie.text.xml.xmp.XmpBasicSchema",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "com.lowagie.text.pdf.PdfRendition",
      "org.jfree.data.general.PieDataset",
      "com.lowagie.text.xml.xmp.XmpSchema",
      "org.jfree.data.KeyToGroupMap",
      "com.lowagie.text.Table",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.axis.AxisLocation",
      "com.lowagie.text.pdf.PdfStream",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.data.general.KeyedValues2DDataset",
      "com.lowagie.text.pdf.PdfTemplate",
      "com.lowagie.text.pdf.PdfGraphics2D$fakeComponent",
      "com.lowagie.text.pdf.PdfObject",
      "com.lowagie.text.pdf.PdfEncodings",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.data.time.Year",
      "com.lowagie.text.pdf.PdfShadingPattern",
      "org.jfree.chart.Drawable",
      "com.lowagie.text.pdf.collection.PdfCollectionSort",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "com.lowagie.text.pdf.interfaces.PdfAnnotations",
      "com.lowagie.text.pdf.interfaces.PdfRunDirection",
      "com.lowagie.text.pdf.PdfContentByte$GraphicState",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.ModuloAxis",
      "com.lowagie.text.pdf.PdfFileSpecification",
      "com.lowagie.text.pdf.PdfDocument$Indentation",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.gantt.GanttCategoryDataset",
      "com.lowagie.text.Rectangle",
      "org.jfree.data.Values2D",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.general.SeriesChangeListener",
      "com.lowagie.text.pdf.interfaces.PdfDocumentActions",
      "org.jfree.data.category.DefaultCategoryDataset",
      "com.lowagie.text.pdf.PdfColor",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.event.PlotChangeListener",
      "com.lowagie.text.pdf.IntHashtable",
      "org.jfree.data.general.Series",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.BadElementException",
      "com.lowagie.text.pdf.PdfString",
      "com.lowagie.text.pdf.PdfContents",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.data.KeyedValue",
      "com.lowagie.text.pdf.interfaces.PdfXConformance",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.util.PublicCloneable",
      "com.lowagie.text.pdf.BaseFont$StreamFont",
      "com.lowagie.text.Document",
      "com.lowagie.text.pdf.PdfResources",
      "org.jfree.data.KeyedObjects2D",
      "com.lowagie.text.pdf.OutputStreamEncryption",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.axis.CategoryLabelWidthType"
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
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
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
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
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
      "com.lowagie.text.pdf.BaseFont",
      "com.lowagie.text.pdf.PdfGraphics2D",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.DefaultCategoryItemRenderer",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.labels.IntervalCategoryItemLabelGenerator",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "com.lowagie.text.Image",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.time.Second",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "com.lowagie.text.pdf.PdfTemplate",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.annotations.CategoryLineAnnotation",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "com.lowagie.text.pdf.PdfAnnotation",
      "com.lowagie.text.pdf.PdfFormField",
      "com.lowagie.text.ImgCCITT",
      "com.lowagie.text.DocumentException",
      "com.lowagie.text.BadElementException",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "com.lowagie.text.Phrase",
      "com.lowagie.text.Paragraph",
      "com.lowagie.text.Font",
      "com.lowagie.text.Chunk",
      "org.jfree.chart.util.ShapeUtilities",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.plot.WaferMapPlot",
      "com.lowagie.text.pdf.Type1Font",
      "com.lowagie.text.ExceptionConverter",
      "com.lowagie.text.Table",
      "com.lowagie.text.Row",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.renderer.category.LevelRenderer",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.data.xy.DefaultWindDataset",
      "com.lowagie.text.pdf.AsianFontMapper",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "com.lowagie.text.ListItem",
      "com.lowagie.text.pdf.PdfPageLabels",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.xy.DefaultXYZDataset",
      "com.lowagie.text.Jpeg",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.labels.BoxAndWhiskerToolTipGenerator",
      "org.jfree.data.time.TimePeriodFormatException",
      "com.lowagie.text.pdf.CJKFont",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "com.lowagie.text.pdf.ColumnText",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.urls.StandardCategoryURLGenerator",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.xy.XYBarDataset",
      "com.lowagie.text.Anchor",
      "com.lowagie.text.pdf.PdfGState",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "com.lowagie.text.Section",
      "com.lowagie.text.Chapter",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator",
      "org.jfree.data.time.Week",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.text.TextUtilities",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.util.Size2D",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "com.lowagie.text.List",
      "com.lowagie.text.ChapterAutoNumber",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "com.lowagie.text.pdf.PdfAppearance",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYSplineAndShapeRenderer",
      "org.jfree.chart.title.CompositeTitle"
    );
  }
}
